package com.example.flexa.service;


import com.example.flexa.model.ProductTypeAttributeValues;
import com.example.flexa.repository.ProductTypeAttributeValuesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductTypeAttributeValuesServiceImpl implements ProductTypeAttributeValuesService {
    @Autowired
    private ProductTypeAttributeValuesRepository productTypeAttributeValuesRepository;

    @Override
    public ProductTypeAttributeValues saveProductTypeAttributeValues(ProductTypeAttributeValues productTypeAttributeValues) {
        return productTypeAttributeValuesRepository.save(productTypeAttributeValues);
    }

    public List<ProductTypeAttributeValues> getAllProductTypeAttributeValues(){
        return productTypeAttributeValuesRepository.findAll();
    }
}
