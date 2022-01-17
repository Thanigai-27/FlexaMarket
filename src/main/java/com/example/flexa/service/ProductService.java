package com.example.flexa.service;

import com.example.flexa.model.Product;

import java.util.List;

public interface ProductService {
    Product saveProduct(Product product);
    List<Product>getAllProducts();
    Product getProductById(Long id);
    void deleteProductById(Long id);
}
