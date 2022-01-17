package com.example.flexa.controller;

import com.example.flexa.model.Category;
import com.example.flexa.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @PostMapping("/")
    private ResponseEntity<Category> saveBrand(@RequestBody Category category){
        return new ResponseEntity<Category>(categoryService.saveCategory(category), HttpStatus.CREATED);
    }

    @RequestMapping("/")
    private List<Category> getAllCategorys(){
        return categoryService.getAllCategorys();
    }
    @RequestMapping("/{id}")
    private ResponseEntity<Category> getCategoryById(@PathVariable("id") Long id){
        try {
            return new ResponseEntity<Category>(categoryService.getCategoryById(id), HttpStatus.OK);
        }catch (NoSuchElementException e){
            return new ResponseEntity<Category>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/{id}")
    private void deleteCategoryById(@PathVariable("id") Long id){
        categoryService.deleteCategoryById(id);
    }
}
