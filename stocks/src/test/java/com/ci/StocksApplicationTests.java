package com.ci;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ci.model.Stock;
import com.ci.repository.StockRepo;

@SpringBootTest
class StocksApplicationTests {

	@Autowired
	private StockRepo stockRepo;

	@Test
	public void testGetAllStock() {
		List<Stock> findAllStock = stockRepo.findAll();
		findAllStock.forEach(e -> {
			System.out.println("All Stock fetch Successfully : " + e);
		});
	}
	
	@Test
	public void testDeleteSingleStock() {
		Long id = 4L;
		stockRepo.deleteById(id);
		System.out.println("Single stock delete Successfully.");
	}
	
	
}
