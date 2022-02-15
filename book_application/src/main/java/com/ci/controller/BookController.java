package com.ci.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import com.ci.entities.Book;
import com.ci.service.BookService;

@Controller
public class BookController {

	@Autowired
	BookService bookService;
	
	@GetMapping("/")
	public String showWelcome() {
		return "/welcome";
	}
	
	@GetMapping("/addBook")
	public ModelAndView addBook() {
		ModelAndView mav = new ModelAndView();
		Book book = new Book();
		//data
		mav.addObject("book", book);
		//view
		mav.setViewName("/book");
		return mav;
	}
	
	@GetMapping("/bookForm")
	public String addBookForm(Book book) {
		Book insertBook = bookService.insertBook(book);
		System.out.println(insertBook);
		return "/success";
	}
	
	@GetMapping("/fetchAll")
	public ModelAndView fetchAllBook() {
		ModelAndView mav = new ModelAndView();
		List<Book> fetchAllBook = bookService.fetchAllBook();
		//data
		mav.addObject("fetchAllBook", fetchAllBook);
		//view
		mav.setViewName("/allBooks");
		return mav;
	}
	
	@GetMapping("/delete/{id}")
	public String deleteBookById(@PathVariable("id") Long id) {
		bookService.deleteBook(id);
		return "redirect:/fetchAll";
	}
	
	@GetMapping("/update/{id}")
	public ModelAndView updateBook(Book book) {
		ModelAndView mav = new ModelAndView();
		Book updateBook = bookService.updateBook(book);
		//data
		mav.addObject("updateBook", updateBook);
		//view
		mav.setViewName("/book");
		return mav;
	}
}
