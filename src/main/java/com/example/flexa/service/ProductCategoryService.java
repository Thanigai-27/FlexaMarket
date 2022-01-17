package com.example.flexa.service;

import com.example.flexa.model.ProductCategory;

import java.util.List;

public interface ProductCategoryService {
    ProductCategory saveProductCategory(ProductCategory productCategory);
    List<ProductCategory>getAllProductCategorys();
    ProductCategory getProductCategoryById(Long id);
    void deleteProductCategoryById(Long id);
}
