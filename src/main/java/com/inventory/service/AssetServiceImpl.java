package com.inventory.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventory.model.Asset;
import com.inventory.repository.AssetRepository;

@Service
public class AssetServiceImpl implements AssetService {

    @Autowired
    private AssetRepository repo;

    @Override
    public void saveAsset(Asset asset) {
        repo.save(asset);
    }

    // =========================
    // GET ALL ASSETS (DASHBOARD USES THIS)
    // =========================
    @Override
    public List<Asset> getAllAssets() {
        return repo.findAll();
    }
}