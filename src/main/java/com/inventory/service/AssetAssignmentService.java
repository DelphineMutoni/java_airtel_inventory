package com.inventory.service;

import java.util.List;
import com.inventory.model.AssetAssignment;

public interface AssetAssignmentService {

    void save(AssetAssignment assignment);

    List<AssetAssignment> getAll();

    AssetAssignment getById(Long id);
}