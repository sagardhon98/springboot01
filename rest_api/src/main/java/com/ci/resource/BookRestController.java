package com.ci.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ci.entity.Book;

@RestController
public class BookRestController {

	@GetMapping("/getBook")
	public Book getBook() {
		Book book = new Book(1L , "Mrityunjaya" , "Shivaji Sawant" , 450);
		return book;
	}
	
	@PostMapping("/saveBook")
	public Book saveBook(@RequestBody Book book) {
		return book;
	}
}
