package com.example.flexa.controller;

import com.example.flexa.model.Stock;
import com.example.flexa.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/stocks")
public class StockController {
    @Autowired
    private StockService stockService;

    @PostMapping("/")
    private ResponseEntity<Stock> saveStock(@RequestBody Stock stock){
        return new ResponseEntity<Stock>(stockService.saveStock(stock), HttpStatus.CREATED);
    }

    @RequestMapping("/")
    private List<Stock> getAllStocks(){
        return stockService.getAllStocks();
    }

    @RequestMapping("/{id}")
    private ResponseEntity<Stock> getStockById(@PathVariable("id") Long id){
        try {
            return new ResponseEntity<Stock>(stockService.getStockById(id), HttpStatus.OK);
        }catch (NoSuchElementException e){
            return new ResponseEntity<Stock>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/{id}")
    private void deleteStockById(@PathVariable("id") Long id){
        stockService.deleteStockById(id);
    }
}
