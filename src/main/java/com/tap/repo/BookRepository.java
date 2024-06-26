package com.tap.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.tap.entity.BookEntity;

@Component
public interface BookRepository extends CrudRepository<BookEntity, Integer> {
  BookEntity findById(int i);
}
