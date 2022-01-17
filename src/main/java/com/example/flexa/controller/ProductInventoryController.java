package com.example.flexa.controller;

import com.example.flexa.model.ProductInventory;
import com.example.flexa.service.ProductInventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/productInventory")
public class ProductInventoryController {
    @Autowired
    private ProductInventoryService productInventoryService;

    @PostMapping("/")
    private ResponseEntity<ProductInventory> saveProductInventory(@RequestBody ProductInventory productInventory){
        return new ResponseEntity<ProductInventory>(productInventoryService.saveProductInventory(productInventory), HttpStatus.CREATED);
    }
    @RequestMapping("/")
    private List<ProductInventory>getAllProductInventorys(){return productInventoryService.getAllProductInventorys();}

    @RequestMapping("/{id}")
    private ResponseEntity<ProductInventory> getProductInventoryById(@PathVariable("id") Long id){
        try {
            return new ResponseEntity<ProductInventory>(productInventoryService.getProductInventoryById(id), HttpStatus.OK);
        }catch (NoSuchElementException e){
            return new ResponseEntity<ProductInventory>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/{id}")
    private void deleteProductInventoryById(@PathVariable("id") Long id){
        productInventoryService.deleteProductInventoryById(id);
    }


}
