package com.example.flexa.service;

import com.example.flexa.model.ProductAttributeValue;

import java.util.List;

public interface ProductAttributeValueService {
    ProductAttributeValue saveProductAttributeValue(ProductAttributeValue productAttributeValue);
    List<ProductAttributeValue>getAllProductAttributeValues();
    ProductAttributeValue getProductAttributeValueById(Long id);
    void deleteProductAttributeValueById(Long id);
}
