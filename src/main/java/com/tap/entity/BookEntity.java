package com.tap.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="book")
public class BookEntity {
  @Id
  @Column(name="book_id")
  @GeneratedValue(strategy=GenerationType.AUTO)
  private int book_id;
  @Column(name="book_name")
  private String book_name;
  @Column(name="book_author")
  private String book_author;

public int getBook_id() {
	return book_id;
}

public String getBook_name() {
	return book_name;
}


public String getBook_author() {
	return book_author;
}

public BookEntity(String book_name, String book_author) {
	super();
	this.book_name = book_name;
	this.book_author = book_author;
}
public BookEntity() {
	super();
}

@Override
public String toString() {
	return "BookEntity [book_id=" + book_id + ", book_name=" + book_name + ", book_author=" + book_author + "]";
}

public void setBook_id(int book_id) {
	this.book_id = book_id;
}

public void setBook_name(String book_name) {
	this.book_name = book_name;
}

public void setBook_author(String book_author) {
	this.book_author = book_author;
}


  
}
