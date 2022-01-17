package com.example.flexa.service;

import com.example.flexa.model.ProductType;
import com.example.flexa.repository.ProductTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductTypeServiceImpl implements ProductTypeService {
    @Autowired
    private ProductTypeRepository productTypeRepository;

    @Override
    public ProductType saveProductType(ProductType productType) {
        return productTypeRepository.save(productType);
    }
    @Override
    public List<ProductType> getAllProductTypes(){
        return productTypeRepository.findAll();
    }
    @Override
    public ProductType getProductTypeById(Long id){return productTypeRepository.getById(id);}

    @Override
    public void deleteProductTypeById(Long id){productTypeRepository.deleteById(id);}

}
