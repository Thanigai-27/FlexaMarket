package com.example.flexa.service;


import com.example.flexa.model.Category;
import com.example.flexa.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService{

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public Category saveCategory(Category category) {
        return categoryRepository.save(category);
    }

    public List<Category> getAllCategorys(){
        return categoryRepository.findAll();
    }

    @Override
    public Category getCategoryById(Long id){return categoryRepository.getById(id);}

    @Override
    public void deleteCategoryById(Long id){categoryRepository.deleteById(id);}



}
