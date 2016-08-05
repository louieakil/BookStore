package lendinglibrary.models.test;

import static org.junit.Assert.*;

import org.junit.Test;

import lendinglibrary.models.Book;

public class BookTest {

	@Test
	public void testBookEquals() {
		Book book = new Book(0, "", "","", "", 0);
		Book book2 = new Book(0, "", "","", "", 0);
		Book book3 = new Book(2, "", "","", "", 0);
		//Two equal books
		assertTrue("Books Equal Each Other", book.equals(book2));
		//Two not equal books
		assertFalse("Not the Same Book", book2.equals(book3));
	}

}