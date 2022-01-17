package com.example.flexa.service;


import com.example.flexa.model.ProductCategory;
import com.example.flexa.repository.ProductCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductCategoryServiceImpl implements ProductCategoryService{

    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Override
    public ProductCategory saveProductCategory(ProductCategory productCategory) {
        return productCategoryRepository.save(productCategory);
    }
    @Override
    public List<ProductCategory> getAllProductCategorys(){
        return productCategoryRepository.findAll();
    }
    @Override
    public ProductCategory getProductCategoryById(Long id){return productCategoryRepository.getById(id);}
    @Override
    public void deleteProductCategoryById(Long id){productCategoryRepository.deleteById(id);}
}

