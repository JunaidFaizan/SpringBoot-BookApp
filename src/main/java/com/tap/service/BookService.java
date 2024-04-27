package com.tap.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tap.entity.BookEntity;
import com.tap.repo.BookRepository;

@Component
public class BookService {
	@Autowired
    BookRepository br;
	
	public List<BookEntity> getAllbooks() {
		List<BookEntity>list = (List<BookEntity>) br.findAll();
		return list;
	}
	
	public BookEntity getBookById(int i) {
		BookEntity b =  br.findById(i);
		return b;
	}
	
	public String insertBook(BookEntity b) {
		br.save(b);
		return "Book Inserted";
	}

	public String updateBook(BookEntity b,int i) {
		BookEntity b1 = br.findById(i);
		b1.setBook_name(b.getBook_name());
		b1.setBook_author(b.getBook_author());
		br.save(b1);
		return "Data updated";
		
	}

	public String deleteBook(int i) {
		BookEntity b = br.findById(i);
		br.delete(b);
		return "Book deleted";
	}
}
