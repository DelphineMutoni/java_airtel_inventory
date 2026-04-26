package com.inventory.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventory.model.AssetAssignment;
import com.inventory.repository.AssetAssignmentRepository;

@Service
public class AssetAssignmentServiceImpl implements AssetAssignmentService {

    @Autowired
    private AssetAssignmentRepository repo;

    // =========================
    // SAVE ASSIGNMENT
    // =========================
    @Override
    public void save(AssetAssignment assignment) {
        repo.save(assignment);
    }

    // =========================
    // GET ALL ASSIGNMENTS
    // =========================
    @Override
    public List<AssetAssignment> getAll() {
        return repo.findAll();
    }

    // =========================
    // GET BY ID (FIXED - THIS WAS MISSING)
    // =========================
    @Override
    public AssetAssignment getById(Long id) {
        return repo.findById(id).orElse(null);
    }
}