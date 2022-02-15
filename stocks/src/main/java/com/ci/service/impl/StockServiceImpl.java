package com.ci.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ci.exception.StockNotFoundException;
import com.ci.model.Stock;
import com.ci.repository.StockRepo;
import com.ci.service.StockService;

@Service
public class StockServiceImpl implements StockService {

	@Autowired
	private StockRepo stockRepo;

	@Override
	public List<Stock> getAllStock(Stock stock) {
		List<Stock> findAllStock = stockRepo.findAll();
		return findAllStock;
	}
	
	@Override
	public Optional<Stock> getSingleStockById(Long id) {
		Optional<Stock> findById = stockRepo.findById(id);
		if (!findById.isPresent()) {
			throw new StockNotFoundException("This stock not found with id : " + id);
		}
		return findById;
	}
	
	
	@Override
	public Stock insertStock(Stock stock) {
		Stock saveStock = stockRepo.save(stock);
		return saveStock;
	}


	@Override
	public Stock updateStock(Stock stock) {
		Stock updateStock = stockRepo.save(stock);
		if (updateStock == null) {
			throw new StockNotFoundException("Stock not available.");
		}
		return updateStock;
	}


	@Override
	public void deleteStockById(Long id) {
		Optional<Stock> findStockById = stockRepo.findById(id);
		if (!findStockById.isPresent()) {
			throw new StockNotFoundException("This stock not found with id : " + id);
		} else {
			stockRepo.deleteById(id);
		}
	}

	
}
