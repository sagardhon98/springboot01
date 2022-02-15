package com.ci;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ci.dao.BookRepo;
import com.ci.entity.Book;

@SpringBootTest
class DaoRevisionApplicationTests {

	@Autowired
	BookRepo bookRepo;

	// save book
	@Test
	public void testSaveBook() {
		Book book = new Book(5L, "शाळा [Shala]", " Milind Bokil", 300.0);
		Book saveBook = bookRepo.save(book);
		System.out.println("Data save Successfully. " + saveBook);
	}

	// update
	@Test
	public void testUpdateBook() {
		Book book = new Book(1L, "Rich Dad Poor Dad", "Robert T. Kiyosaki", 178.50);
		Book updateBook = bookRepo.save(book);
		System.out.println("Data update successfully. " + updateBook);
	}

	// delete single data
	@Test
	public void testSingleBookDelete() {
		Long id = 1L;
		bookRepo.deleteById(id);
		System.out.println("Single data delete Successfully.");
	}

	// delete all data
	@Test
	public void testDeleteAllBook() {
		bookRepo.deleteAll();
		System.out.println("All Data delete Successfully.");
	}

	// fetch single data
	@Test
	public void testFetchSingleBook() {
		Long id = 2L;
		Optional<Book> findBySingleBook = bookRepo.findById(id);
		System.out.println("Single data fetch Successfully. " + findBySingleBook.get());
	}

	// fetch all data
	@Test
	public void testFetchAllBook() {
		List<Book> findAllBook = bookRepo.findAll();
		System.out.println("All Data fetch Successfully.");
		findAllBook.forEach(e -> {
			System.out.println(e);
		});
	}

	// count data
	@Test
	public void testCountAllBook() {
		long countAllBook = bookRepo.count();
		System.out.println("Total Data : " + countAllBook);
	}

	// find by method

	// find by book name
	@Test
	public void testFindByBookName() {
		Book findByBookName = bookRepo.findByBookName("मृत्युंजय");
		System.out.println("Find book by name : " + findByBookName);
	}

	// find by price
	@Test
	public void testFindByPrice() {
		List<Book> findByBookPrice = bookRepo.findByPrice(178.0);
		System.out.println("Find book by price : ");
		findByBookPrice.forEach(e -> {
			System.out.println(e);
		});
	}

}
