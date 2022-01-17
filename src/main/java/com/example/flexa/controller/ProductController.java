package com.example.flexa.controller;


import com.example.flexa.model.Product;
import com.example.flexa.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping("/")
    private ResponseEntity<Product> saveBrand(@RequestBody Product product){
        return new ResponseEntity<Product>(productService.saveProduct(product), HttpStatus.CREATED);
    }

    @RequestMapping("/")
    private List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @RequestMapping("/{id}")
    private ResponseEntity<Product> getProductById(@PathVariable("id") Long id){
        try {
            return new ResponseEntity<Product>(productService.getProductById(id), HttpStatus.OK);
        }catch (NoSuchElementException e){
            return new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/{id}")
    private void deleteProductById(@PathVariable("id") Long id){
        productService.deleteProductById(id);
    }
}


