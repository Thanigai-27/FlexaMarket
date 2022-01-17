package com.example.flexa.service;

import com.example.flexa.model.WeightUnit;

import java.util.List;

public interface WeightUnitService {
    WeightUnit saveWeightUnit(WeightUnit weightUnit);
    List<WeightUnit> getAllWeightUnits();
    WeightUnit getWeightUnitById(Long id);
    void deleteWeightUnitById(Long id);
}
