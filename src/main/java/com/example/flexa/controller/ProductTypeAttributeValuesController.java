package com.example.flexa.controller;


import com.example.flexa.model.ProductTypeAttributeValues;
import com.example.flexa.service.ProductTypeAttributeValuesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/productTypeAttributeValues")
public class ProductTypeAttributeValuesController {
    @Autowired
    private ProductTypeAttributeValuesService productTypeAttributeValuesService;
    @PostMapping("/")
    private ResponseEntity<ProductTypeAttributeValues> saveProductTypeAttributeValues(@RequestBody ProductTypeAttributeValues productTypeAttributeValues){
        return new ResponseEntity<ProductTypeAttributeValues>(productTypeAttributeValuesService.saveProductTypeAttributeValues(productTypeAttributeValues), HttpStatus.CREATED);
    }

    @RequestMapping("/")
    private List<ProductTypeAttributeValues> getAllProductTypeAttributeValues(){
        return productTypeAttributeValuesService.getAllProductTypeAttributeValues();
    }
}
