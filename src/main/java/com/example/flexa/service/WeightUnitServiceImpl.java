package com.example.flexa.service;

import com.example.flexa.model.WeightUnit;
import com.example.flexa.repository.WeightUnitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeightUnitServiceImpl implements WeightUnitService{
    @Autowired
    private WeightUnitRepository weightUnitRepository;
    @Override
    public WeightUnit saveWeightUnit(WeightUnit weightUnit){
        return weightUnitRepository.save(weightUnit);
    }
    @Override
    public List<WeightUnit>getAllWeightUnits(){
        return weightUnitRepository.findAll();
    }
    @Override
    public WeightUnit getWeightUnitById(Long id){return weightUnitRepository.getById(id);}
    @Override
    public void deleteWeightUnitById(Long id){ weightUnitRepository.deleteById(id);}
}
