package com.example.flexa.service;

import com.example.flexa.model.ProductAttributeValue;
import com.example.flexa.repository.ProductAttributeValueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductAttributeValueServiceImpl implements ProductAttributeValueService {

    @Autowired
    private ProductAttributeValueRepository productAttributeValueRepository;

    @Override
    public ProductAttributeValue saveProductAttributeValue(ProductAttributeValue productAttributeValue) {
        return productAttributeValueRepository.save(productAttributeValue);
    }

    @Override
    public List<ProductAttributeValue> getAllProductAttributeValues() {
        return productAttributeValueRepository.findAll();
    }
    @Override
    public ProductAttributeValue getProductAttributeValueById(Long id){
        return productAttributeValueRepository.getById(id);}
    @Override
    public void deleteProductAttributeValueById(Long id){ productAttributeValueRepository.deleteById(id);}
}
