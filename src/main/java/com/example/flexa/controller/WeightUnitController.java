package com.example.flexa.controller;

import com.example.flexa.model.WeightUnit;
import com.example.flexa.service.WeightUnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/weightUnit")
public class WeightUnitController {
    @Autowired
    private WeightUnitService weightUnitService;

    @PostMapping("/")
    private ResponseEntity<WeightUnit> saveWeightUnit(@RequestBody WeightUnit weightUnit){
        return new ResponseEntity<WeightUnit>(weightUnitService.saveWeightUnit(weightUnit), HttpStatus.CREATED);
    }
    @RequestMapping("/")
    private List<WeightUnit> getAllWeightUnit(){
        return weightUnitService.getAllWeightUnits();
    }
    @RequestMapping("/{id}")
    private ResponseEntity<WeightUnit>getWeightUnitById(@PathVariable("id") Long id){
        try {
            return new ResponseEntity<WeightUnit>(weightUnitService.getWeightUnitById(id), HttpStatus.OK);
        }catch (NoSuchElementException e){
            return new ResponseEntity<WeightUnit>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/{id}")
    private void deleteWeightUnitById(@PathVariable("id") Long id){
        weightUnitService.deleteWeightUnitById(id);
    }

}
