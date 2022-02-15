package com.ci.service;

import java.util.List;
import java.util.Optional;

import com.ci.model.Stock;

public interface StockService {

	public List<Stock> getAllStock(Stock stock);
	
	public Optional<Stock> getSingleStockById(Long id);
	
	public Stock insertStock(Stock stock);
	
	public Stock updateStock(Stock stock);
	
	public void deleteStockById(Long id);
	
}
