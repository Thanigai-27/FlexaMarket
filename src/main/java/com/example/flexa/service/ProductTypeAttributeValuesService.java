package com.example.flexa.service;


import com.example.flexa.model.ProductTypeAttributeValues;

import java.util.List;

public interface ProductTypeAttributeValuesService {
    ProductTypeAttributeValues saveProductTypeAttributeValues(ProductTypeAttributeValues productTypeAttributeValues);
    List<ProductTypeAttributeValues> getAllProductTypeAttributeValues();
}
