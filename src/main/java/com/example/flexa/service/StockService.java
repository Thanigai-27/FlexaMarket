package com.example.flexa.service;

import com.example.flexa.model.Stock;

import java.util.List;

public interface StockService {
    Stock saveStock(Stock stock);
    List<Stock> getAllStocks();
    Stock getStockById(Long id);
    void deleteStockById(Long id);
}
