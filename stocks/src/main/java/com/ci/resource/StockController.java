package com.ci.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ci.model.Stock;
import com.ci.service.StockService;

@RestController
@RequestMapping("/api")
public class StockController {

	@Autowired
	private StockService stockService;
	
	@GetMapping("/stock")
	public ResponseEntity<List<Stock>> fetchAllStock(Stock stock){
		List<Stock> allStock = stockService.getAllStock(stock);
		return new ResponseEntity<List<Stock>>(allStock , HttpStatus.ACCEPTED);
	}
	
	@PostMapping("/stock")
	public ResponseEntity<Stock> saveStock(@RequestBody Stock stock) {
		Stock insertStock = stockService.insertStock(stock);
		return new ResponseEntity<Stock>(insertStock , HttpStatus.CREATED);
	}
	
	@GetMapping("/stock/{id}")
	public ResponseEntity<Optional<Stock>> getSingleStock(@PathVariable("id") Long id){
		Optional<Stock> singleStockById = stockService.getSingleStockById(id);
		return new ResponseEntity<Optional<Stock>>(singleStockById , HttpStatus.FOUND);
	}
	
	@PutMapping("/stock/{id}")
	public ResponseEntity<?> updateStock(@PathVariable("id") Long id, @RequestBody Stock stockDetail) {
		Stock stock = new Stock();
		stock.setId(id);
		stock.setName(stockDetail.getName());
		stock.setCurrentPrice(stockDetail.getCurrentPrice());
		stock.setLastUpdate(stockDetail.getLastUpdate());
		Stock updateStock = stockService.updateStock(stock);
		return new ResponseEntity<>(updateStock, HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("/stock/{id}")
	public ResponseEntity<Void> deleteStockById(@PathVariable("id") Long id){
		System.out.println("Delete stock***************************");
		stockService.deleteStockById(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
	
}
