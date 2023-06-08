package com.example.demo.repository;

import com.example.demo.model.entity.InventoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface InventoryRepository extends JpaRepository<InventoryEntity,Long> {
    Optional<Boolean> findBySkuCode(String skuCode);
}
