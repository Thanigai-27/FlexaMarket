package com.example.flexa.service;


import com.example.flexa.model.Product;
import com.example.flexa.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(Long id){return productRepository.getById(id);}
    @Override
    public void deleteProductById(Long id){productRepository.deleteById(id);}
}
