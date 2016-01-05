package models.test;

import static org.junit.Assert.*;

import org.junit.Test;

import models.Book;
import models.BookCatalog;

public class BookCatalogTest {

	@Test
	public void testAddBook() {
		
		BookCatalog bc = new BookCatalog();
		int intialNum = bc.getNumberOfBook();
		
		Book book = new Book(1,"","","","",0);
		bc.addBook(book);
		
		assertTrue(intialNum == bc.getNumberOfBook() - 1);
		
	}
	
}
