package com.example.flexa.controller;

import com.example.flexa.model.ProductAttributeValue;
import com.example.flexa.service.ProductAttributeValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/productAttributeValues")
public class ProductAttributeValueCategory {
    @Autowired
    private ProductAttributeValueService productAttributeValueService;
    @PostMapping("/")
    private ResponseEntity<ProductAttributeValue> saveProductAttributeValue(@RequestBody ProductAttributeValue productAttributeValue){
        return new ResponseEntity<ProductAttributeValue>(productAttributeValueService.saveProductAttributeValue(productAttributeValue), HttpStatus.CREATED);
    }
    @RequestMapping("/")
    private List<ProductAttributeValue> getAllProductAttributeValues(){
        return productAttributeValueService.getAllProductAttributeValues();
    }
    @RequestMapping("/{id}")
    private ResponseEntity<ProductAttributeValue> getProductAttributeValueById(@PathVariable("id") Long id){
        try {
            return new ResponseEntity<ProductAttributeValue>(productAttributeValueService.getProductAttributeValueById(id), HttpStatus.OK);
        }catch (NoSuchElementException e){
            return new ResponseEntity<ProductAttributeValue>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/{id}")
    private void deleteProductAttributeValueById(@PathVariable("id") Long id){
        productAttributeValueService.deleteProductAttributeValueById(id);
    }

}
