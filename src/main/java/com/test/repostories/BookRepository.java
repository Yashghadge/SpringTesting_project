package com.test.repostories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.models.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {
   
  Book findByName(String name);
}
