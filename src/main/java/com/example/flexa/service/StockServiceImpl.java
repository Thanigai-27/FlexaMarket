package com.example.flexa.service;

import com.example.flexa.model.Stock;
import com.example.flexa.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockServiceImpl implements StockService{

    @Autowired
    StockRepository stockRepository;

    @Override
    public Stock saveStock(Stock stock){ return stockRepository.save(stock);}
    @Override
    public List<Stock>getAllStocks(){return stockRepository.findAll();}
    @Override
    public Stock getStockById(Long id){return stockRepository.getById(id);}
    @Override
    public void deleteStockById(Long id){stockRepository.deleteById(id);}
}
