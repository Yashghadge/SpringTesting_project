package com.test.repo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.test.models.Book;
import com.test.repostories.BookRepository;

@SpringBootTest
class BookRepositoryTest {

	@Autowired
	BookRepository bookRepository;
	
	@Test
	void testfindByName() {
	  String excepetedBookName= "Spring";
	 Book found_book =bookRepository.findByName("Spring");
	  String actualBookName=found_book.getName();
	  assertEquals(excepetedBookName, actualBookName);
	  
	}

}
