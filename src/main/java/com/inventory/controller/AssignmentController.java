package com.inventory.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.inventory.model.AssetAssignment;
import com.inventory.service.AssetAssignmentService;

@Controller
public class AssignmentController {

    @Autowired
    private AssetAssignmentService service;

    // =========================
    // SHOW ASSIGN FORM
    // =========================
    @GetMapping("/assign")
    public String showForm(Model model) {
        model.addAttribute("assignment", new AssetAssignment());
        return "assign_asset";
    }

    // =========================
    // SAVE ASSIGNMENT (ISSUE ASSET)
    // =========================
    @PostMapping("/assignAsset")
    public String assignAsset(@ModelAttribute AssetAssignment assignment) {

        assignment.setIssueDate(new Date());
        assignment.setStatus("Issued");

        service.save(assignment);

        return "redirect:/assignments";
    }

    // =========================
    // VIEW ALL ASSIGNMENTS
    // =========================
    @GetMapping("/assignments")
    public String viewAssignments(Model model) {
        model.addAttribute("list", service.getAll());
        return "assignments";
    }

    // =========================
    // RETURN ASSET
    // =========================
    @GetMapping("/return/{id}")
    public String returnAsset(@PathVariable Long id) {

        AssetAssignment assignment = service.getById(id);

        if (assignment != null) {
            assignment.setStatus("Returned");
            assignment.setReturnDate(new Date());
            service.save(assignment);
        }

        return "redirect:/assignments";
    }
}