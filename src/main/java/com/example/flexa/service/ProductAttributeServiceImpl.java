package com.example.flexa.service;

import com.example.flexa.model.ProductAttribute;
import com.example.flexa.repository.ProductAttributeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductAttributeServiceImpl implements ProductAttributeService {


        @Autowired
        private ProductAttributeRepository productAttributeRepository;

        @Override
        public ProductAttribute saveProductAttribute(ProductAttribute productAttribute) {
            return productAttributeRepository.save(productAttribute);
        }
        @Override
        public List<ProductAttribute> getAllProductAttributes(){
            return productAttributeRepository.findAll();
        }


        @Override
        public void deleteProductAttributeById(Long id){productAttributeRepository.deleteById(id);}

    }



