package com.tap.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tap.entity.BookEntity;
import com.tap.service.BookService;


@RestController
public class BookController {
	@Autowired
    BookService bs;
	@GetMapping("/books")
	public List<BookEntity> getAllBooks() {
		
		return bs.getAllbooks();
	}
	
	@GetMapping("/books/{id}")
	public BookEntity getBookById(@PathVariable("id") int i) {
		
	    return bs.getBookById(i);
	}
	
	@PostMapping("/books")
	public String insertBook(@RequestBody BookEntity b) {
		return bs.insertBook(b);
	}
	
	@PutMapping("/books/{id}")
	public String updateBook(@RequestBody BookEntity b,@PathVariable("id")int i) {
		return bs.updateBook(b,i);
	}
	
	@DeleteMapping("/books/{id}")
	public String deleteBook(@PathVariable("id")int i) {
		return bs.deleteBook(i);
	}
    
}
