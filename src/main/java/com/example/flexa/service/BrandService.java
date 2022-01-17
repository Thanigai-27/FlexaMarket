package com.example.flexa.service;

import com.example.flexa.model.Brand;

import java.util.List;

public interface BrandService {
    Brand saveBrand(Brand brand);
    List<Brand> getAllBrands();
    Brand getBrandById(Long id);
    void deleteBrandById(Long id);
    Brand updateBrand(Brand brand, Long id) throws Exception;
}
