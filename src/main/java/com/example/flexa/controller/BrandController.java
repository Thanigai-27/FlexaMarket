package com.example.flexa.controller;

import com.example.flexa.model.Brand;
import com.example.flexa.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/brands")
public class BrandController {
    @Autowired
    private BrandService brandService;

    @PostMapping("/")
    private ResponseEntity<Brand> saveBrand(@RequestBody Brand brand){
        return new ResponseEntity<Brand>(brandService.saveBrand(brand), HttpStatus.CREATED);
    }

    @RequestMapping("/")
    private List<Brand> getAllBrands(){
        return brandService.getAllBrands();
    }

    @RequestMapping("/{id}")
    private ResponseEntity<Brand> getBrandById(@PathVariable("id") Long id){
        try {
            return new ResponseEntity<Brand>(brandService.getBrandById(id), HttpStatus.OK);
        }catch (NoSuchElementException e){
            return new ResponseEntity<Brand>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/{id}")
    private void deleteBrandById(@PathVariable("id") Long id){
        brandService.deleteBrandById(id);
    }
    @PutMapping("/{id}")
    private ResponseEntity<Brand> updateBrand(@RequestBody Brand brand, @PathVariable("id") Long id) throws Exception {
        return new ResponseEntity<Brand>(brandService.updateBrand(brand, id), HttpStatus.OK);
    }
}
