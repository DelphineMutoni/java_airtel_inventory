package com.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.inventory.model.Asset;

public interface AssetRepository
extends JpaRepository<Asset,Long>{

}