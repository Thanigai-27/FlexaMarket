package com.example.flexa.service;

import com.example.flexa.model.Brand;
import com.example.flexa.repository.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandRepository brandRepository;

    @Override
    public Brand saveBrand(Brand brand) {
        return brandRepository.save(brand);
    }

    @Override
    public List<Brand> getAllBrands(){
        return brandRepository.findAll();
    }

    @Override
    public Brand getBrandById(Long id) {
        return brandRepository.getById(id);
    }

    @Override
    public void deleteBrandById(Long id) {
        brandRepository.deleteById(id);
    }

    @Override
    public Brand updateBrand(Brand brand, Long id) throws Exception {
        Brand currentBrand = Optional.of(brandRepository.getById(id)).orElseThrow(() -> new Exception("Brand not found for Id : " + id) );
        currentBrand.setName(brand.getName());
        currentBrand.setCreated_at(brand.getCreated_at());
        return brandRepository.save(currentBrand);
    }

}
