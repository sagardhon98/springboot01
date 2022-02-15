package com.ci.daotest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ci.entities.City;
import com.ci.repository.CityRepo;

@SpringBootTest
class CityDaoTest {

	@Autowired
	private CityRepo cityRepo;

	/**
	 * Test Cases for City
	 */

	// Insert City
	@Test
	public void testInsertCity() {
		City city = new City(1L, "Mumbai", 1L);
		City insertCity = cityRepo.save(city);
		System.out.println("Data saved Successfully." + insertCity);
	}

	// Update City
	@Test
	public void testUpdateCity() {
		City city = new City(1L, "Mumbai", 1L);
		City updateCity = cityRepo.save(city);
		System.out.println("Data update Successfully." + updateCity);
	}

	// Read single city
	@Test
	public void testReadSingleCity() {
		Long id = 1L;
		Optional<City> readSingleCity = cityRepo.findById(id);
		System.out.println("Single data fetch Successfully." + readSingleCity.get());
		
		assertNotNull(readSingleCity);
	}

	// Read All City
	@Test
	public void testReadAllCity() {
		List<City> readAllCity = cityRepo.findAll();
		System.out.println("All Data fetch Successfully.");
		readAllCity.forEach(e -> {
			System.out.println(e);
		});
		
		assertNotNull(readAllCity);
	}

	// Delete Single city
	@Test
	public void testDeleteSingleCity() {
		Long id = 1L;
		cityRepo.deleteById(id);
		System.out.println("Single data delete Successfully.");
	}

	// Delete All City
	@Test
	public void testDeleteAllCity() {
		cityRepo.deleteAll();
		System.out.println("All data delete Successfully.");
	}

}
