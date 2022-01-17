package com.example.flexa.repository;

import com.example.flexa.model.ProductInventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductInventoryRepository extends JpaRepository<ProductInventory,Long> {
}
