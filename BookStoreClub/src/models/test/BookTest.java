package models.test;

import static org.junit.Assert.*;

import org.junit.Test;

import models.Book;

public class BookTest {

	@Test
	public void test2EqualBooks() {
		Book book = new Book("","","","","",0);
		Book book1 = new Book("","","","","",0);
		
		assertTrue(book.equals(book1));
		
		
	}

	@Test
	public void test2NonEqualBooks() {
		Book book = new Book("","","","","",0);
		Book book2 = new Book("000","","","","",0);
		
		assertFalse(book.equals(book2));
		
	}
}
