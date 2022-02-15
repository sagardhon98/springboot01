package com.ci.daotest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ci.entities.Country;
import com.ci.repository.CountryRepo;

@SpringBootTest
class CountryDaoTest {

	@Autowired
	private CountryRepo countryRepo;

	/**
	 * Test Cases for Country
	 */

	// Insert Country
	@Test
	public void testInsertCountry() {
		Country country = new Country(1L, "India");
		Country insertCountry = countryRepo.save(country);
		System.out.println("Data saved Successfully." + insertCountry);
	}

	// Update Country
	@Test
	public void testUpdateCountry() {
		Country country = new Country(2L, "USA");
		Country updateCountry = countryRepo.save(country);
		System.out.println("Data update Successfully." + updateCountry);
	}

	// Read Single Country
	@Test
	public void testReadSingleCountry() {
		Long id = 1L;
		Optional<Country> readSingleCountry = countryRepo.findById(id);
		System.out.println("Single data fetch Successfully." + readSingleCountry.get());
		
		assertNotNull(readSingleCountry);
	}

	// Read Country
	@Test
	public void testReadCountry() {
		List<Country> readAllCountry = countryRepo.findAll();
		System.out.println("All data fetch Successfully.");
		readAllCountry.forEach(e -> {
			System.out.println(e);
		});
		
		assertNotNull(readAllCountry);
	}

	// single data delete
	@Test
	public void testSingleCountryDelete() {
		Long id = 1L;
		countryRepo.deleteById(id);
		System.out.println("Single data delete Successfully.");
	}

	// Delete All Country
	@Test
	public void testAllCountryDelete() {
		countryRepo.deleteAll();
		System.out.println("All data delete Successfully.");
	}

}
