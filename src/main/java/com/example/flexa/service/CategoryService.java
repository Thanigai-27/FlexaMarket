package com.example.flexa.service;

import com.example.flexa.model.Category;

import java.util.List;

public interface CategoryService {
    Category saveCategory(Category category);
    List<Category>getAllCategorys();
    Category getCategoryById(Long id);
    void deleteCategoryById(Long id);

}
