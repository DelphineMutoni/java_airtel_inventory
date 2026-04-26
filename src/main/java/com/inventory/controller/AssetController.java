package com.inventory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.inventory.model.Asset;
import com.inventory.repository.AssetRepository;
import com.inventory.service.AssetService;

@Controller
public class AssetController {
	   @Autowired
	    private AssetRepository assetRepository;
    @Autowired
    private AssetService service;

    // =========================
    // SHOW FORM
    // =========================

    @GetMapping("/showNewAssetForm")
    public String showNewAssetForm(Model model) {
        model.addAttribute("asset", new Asset());
        return "add_asset";
    }

    // =========================
    // SAVE ASSET (ONLY ONE METHOD)
    // =========================
    @PostMapping("/saveAsset")
    public String saveAsset(@ModelAttribute Asset asset) {

        // ✅ FIX: DEFAULT STATUS MUST BE AVAILABLE
        asset.setStatus("Available");

        service.saveAsset(asset);

        return "redirect:/assets";
    }

    // =========================
    // LIST ASSETS
    // =========================
    @GetMapping("/assets")
    public String viewAssets(Model model) {
        model.addAttribute("listAssets", service.getAllAssets());
        return "assets";
    }
    @GetMapping("/edit/{id}")
    public String editAsset(@PathVariable Long id, Model model) {

        Asset asset = assetRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Asset not found"));

        model.addAttribute("asset", asset);

        return "editass"; // MUST match file name
    }
    
    // DELETE
    @GetMapping("/deleteAsset/{id}")
    public String deleteAsset(@PathVariable Long id) {
        assetRepository.deleteById(id);
        return "redirect:/assets";
    }
    // =========================
    // DASHBOARD
    // =========================
    @GetMapping("/")
    public String dashboard(Model model) {

        long total = service.getAllAssets().size();

        long assigned = service.getAllAssets().stream()
                .filter(a -> "Assigned".equals(a.getStatus()))
                .count();

        long available = service.getAllAssets().stream()
                .filter(a -> "Available".equals(a.getStatus()))
                .count();

        model.addAttribute("total", total);
        model.addAttribute("assigned", assigned);
        model.addAttribute("available", available);

        return "dashboard";
    }


}