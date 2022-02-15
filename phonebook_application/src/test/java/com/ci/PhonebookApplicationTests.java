package com.ci;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ci.dao.PhoneBookRepo;
import com.ci.entities.PhoneBook;

@SpringBootTest
class PhonebookApplicationTests {

	@Autowired
	PhoneBookRepo phoneBookRepo;

	// insert
	@Test
	public void testInsert() {
		PhoneBook phBook = new PhoneBook(3L, "Charles", "charles@gmail.com", 9856129000L);
		PhoneBook saved = phoneBookRepo.save(phBook);
		System.out.println("Data saved Successfully " + saved);
	}
	
	//update
	@Test
	public void testUpdate() {
		PhoneBook phoneBook = new PhoneBook(1L, "John", "john@gmail.com", 9856120911L);
		PhoneBook updated = phoneBookRepo.save(phoneBook);
		System.out.println("Data update Successfully " + updated);
	}
	
	//single data fetch
	@Test
	public void testSingleData() {
		Long id = 2L;
		Optional<PhoneBook> findById = phoneBookRepo.findById(id);
		System.out.println("Single data fetch Successfully. " + findById.get());
	}
	
	//all data fetch
	@Test
	public void testAllDataFetch() {
		List<PhoneBook> findAll = phoneBookRepo.findAll();
		System.out.println("All fetch Successgully");
		findAll.forEach(e->{
			System.out.println(e);
		});
	}
	
	//single data delete
	@Test
	public void testSingleDataDelete() {
		long id = 3L;
		phoneBookRepo.deleteById(id);
		System.out.println("Single Data delete Successfully");
	}
	
	//all data delete
	@Test
	public void testAllDataDelate() {
		phoneBookRepo.deleteAll();
		System.out.println("All data delete Successfully");
	}

}
