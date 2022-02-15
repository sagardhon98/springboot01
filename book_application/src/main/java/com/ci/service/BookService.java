package com.ci.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ci.dao.BookRepo;
import com.ci.entities.Book;

@Service
public class BookService {

	@Autowired
	BookRepo bookRepo;
	
	//insert book
	public Book insertBook(Book book) {
		Book saveBook = bookRepo.save(book);
		return saveBook;
	}
	
	//fetch all book
	public List<Book> fetchAllBook(){
		List<Book> findAllBook = bookRepo.findAll();
		return findAllBook;
	}
	
	//delete book
	public Book deleteBook(Long id) {
		bookRepo.deleteById(id);
		return null;
	}
	
	//update
	public Book updateBook(Book book) {
		Book updateBook = bookRepo.save(book);
		return updateBook;
	}
}
