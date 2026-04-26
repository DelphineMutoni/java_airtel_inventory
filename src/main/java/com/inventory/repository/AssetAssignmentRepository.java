package com.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.inventory.model.AssetAssignment;

public interface AssetAssignmentRepository extends JpaRepository<AssetAssignment, Long> {
}