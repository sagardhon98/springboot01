package com.ci.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ci.entity.Book;

public interface BookRepo extends JpaRepository<Book, Long> {
	
	Book findByBookName(String bookName);
	
	List<Book> findByPrice(Double price);

}
