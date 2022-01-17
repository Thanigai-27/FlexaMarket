package com.example.flexa.service;

import com.example.flexa.model.ProductAttribute;

import java.util.List;

public interface ProductAttributeService {
    ProductAttribute saveProductAttribute(ProductAttribute productAttribute);
    List<ProductAttribute>getAllProductAttributes();

    void deleteProductAttributeById(Long id);
}
