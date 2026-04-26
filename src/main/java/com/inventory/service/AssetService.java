package com.inventory.service;

import java.util.List;
import com.inventory.model.Asset;

public interface AssetService {

    void saveAsset(Asset asset);

    List<Asset> getAllAssets(); // ✅ ADD THIS
}