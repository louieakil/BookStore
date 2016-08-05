package lendinglibrary.models.test;

import static org.junit.Assert.*;

import org.junit.Test;

import lendinglibrary.models.Book;
import lendinglibrary.models.BookCatalog;
import lendinglibrary.models.BookNotFoundException;

public class BookCatalogTest {
	
	
	private BookCatalog bc;
	private Book book1;
	
	public BookCatalogTest(){
		bc = new BookCatalog();
		book1 = new Book(1,"Learning Stuff","","","",0);
		bc.addBook(book1);
	}
	

	@Test
	public void testAddABook() {
		
		int intialNum = bc.getNumberofBooks();
	
		Book book = new Book(1,"","","","",0);
		bc.addBook(book);
		assertTrue(intialNum == bc.getNumberofBooks() - 1);	
	}
	
	@Test
	public void testFindBook() throws BookNotFoundException {
		
		try{
			Book foundbook = bc.findBook("Learning Stuff");
		}
		catch(BookNotFoundException e)
		{
			fail("Not Found");
		}
	}
	
	@Test
	public void testFindBookIgnoreCase() throws BookNotFoundException {
		
		try{
			Book foundbook = bc.findBook("learning stuff");
		}
		catch(BookNotFoundException e)
		{
			fail("Not Found");
		}
	}
	
	@Test
	public void testFindBookExtraSpaces() throws BookNotFoundException {
		
		try{
			Book foundbook = bc.findBook("  learning stuff  ");
		}
		catch(BookNotFoundException e)
		{
			fail("Not Found");
		}
	}
	
	@Test(expected = BookNotFoundException.class)
	public void testFindBookNotExist() throws BookNotFoundException {
		
		Book foundbook = bc.findBook("Leaning Leon");
	}

}