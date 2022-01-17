package com.example.flexa.controller;

import com.example.flexa.model.ProductType;
import com.example.flexa.service.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/productType")
public class ProductTypeController {
    @Autowired
    private ProductTypeService productTypeService;
    @PostMapping("/")
    private ResponseEntity<ProductType> saveProductType(@RequestBody ProductType productType){
        return new ResponseEntity<ProductType>(productTypeService.saveProductType(productType), HttpStatus.CREATED);
    }

    @RequestMapping("/")
    private List<ProductType> getAllProductTypes(){
        return productTypeService.getAllProductTypes();
    }
    @RequestMapping("/{id}")
    private ResponseEntity<ProductType> getProductTypeById(@PathVariable("id") Long id){
        try {
            return new ResponseEntity<ProductType>(productTypeService.getProductTypeById(id), HttpStatus.OK);
        }catch (NoSuchElementException e){
            return new ResponseEntity<ProductType>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/{id}")
    private void deleteProductTypeById(@PathVariable("id") Long id){
        productTypeService.deleteProductTypeById(id);
    }

}
