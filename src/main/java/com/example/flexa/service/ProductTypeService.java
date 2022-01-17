package com.example.flexa.service;

import com.example.flexa.model.ProductType;

import java.util.List;

public interface ProductTypeService {
    ProductType saveProductType(ProductType productType);
    List<ProductType>getAllProductTypes();
    ProductType getProductTypeById(Long id);
    void deleteProductTypeById(Long id);
}
