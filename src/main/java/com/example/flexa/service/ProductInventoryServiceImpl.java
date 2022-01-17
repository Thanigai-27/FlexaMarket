package com.example.flexa.service;

import com.example.flexa.model.ProductInventory;
import com.example.flexa.repository.ProductInventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductInventoryServiceImpl implements ProductInventoryService{
    @Autowired
    private ProductInventoryRepository productInventoryRepository;

    @Override
    public ProductInventory saveProductInventory(ProductInventory productInventory) {
        return productInventoryRepository.save(productInventory);
    }

    @Override
    public List<ProductInventory> getAllProductInventorys(){
        return productInventoryRepository.findAll();
    }

    @Override
    public ProductInventory getProductInventoryById(Long id) {
        return productInventoryRepository.getById(id);
    }

    @Override
    public void deleteProductInventoryById(Long id) {
        productInventoryRepository.deleteById(id);
    }
}
