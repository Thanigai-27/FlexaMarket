package com.example.flexa.service;

import com.example.flexa.model.ProductInventory;

import java.util.List;

public interface ProductInventoryService {
    ProductInventory saveProductInventory(ProductInventory productInventory);
    List<ProductInventory> getAllProductInventorys();
    ProductInventory getProductInventoryById(Long id);
    void deleteProductInventoryById(Long id);
}
