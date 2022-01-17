package com.example.flexa.controller;

import com.example.flexa.model.ProductAttribute;
import com.example.flexa.service.ProductAttributeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/productAttribute")
public class ProductAttributeController {
    @Autowired
    private ProductAttributeService productAttributeService;
    @PostMapping("/")
    private ResponseEntity<ProductAttribute> saveProductAttribute(@RequestBody ProductAttribute productAttribute){
        return new ResponseEntity<ProductAttribute>(productAttributeService.saveProductAttribute(productAttribute), HttpStatus.CREATED);
    }

    @RequestMapping("/")
    private List<ProductAttribute> getAllProductAttributes(){
        return productAttributeService.getAllProductAttributes();
    }
    @DeleteMapping("/{id}")
    private void deleteProductAttributeById(@PathVariable("id") Long id){
        productAttributeService.deleteProductAttributeById(id);
    }
}
