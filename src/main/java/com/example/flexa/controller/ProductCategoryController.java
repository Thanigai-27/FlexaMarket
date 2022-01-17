package com.example.flexa.controller;

import com.example.flexa.model.ProductCategory;
import com.example.flexa.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/productCategory")
public class ProductCategoryController {
    @Autowired
    private ProductCategoryService productCategoryService;
    @PostMapping("/")
    private ResponseEntity<ProductCategory> saveProductCategory(@RequestBody ProductCategory productCategory){
        return new ResponseEntity<ProductCategory>(productCategoryService.saveProductCategory(productCategory), HttpStatus.CREATED);
    }

    @RequestMapping("/")
    private List<ProductCategory> getAllProductCategorys(){
        return productCategoryService.getAllProductCategorys();
    }

    @RequestMapping("/{id}")
    private ResponseEntity<ProductCategory> getProductCategoryById(@PathVariable("id") Long id){
        try {
            return new ResponseEntity<ProductCategory>(productCategoryService.getProductCategoryById(id), HttpStatus.OK);
        }catch (NoSuchElementException e){
            return new ResponseEntity<ProductCategory>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/{id}")
    private void deleteProductCategoryById(@PathVariable("id") Long id){
        productCategoryService.deleteProductCategoryById(id);
    }


}

