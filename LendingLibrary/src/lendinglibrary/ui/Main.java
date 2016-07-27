package lendinglibrary.ui;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

import lendinglibrary.models.Book;
import lendinglibrary.models.BookCatalog;

public class Main {

	public static void main(String[] args) {
		
		Date today = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		GregorianCalendar gCal = new GregorianCalendar();
		
		today = gCal.getTime();
		
		System.out.println(sdf.format(today));
		
		
		
//		BookCatalog bookCatalog = new BookCatalog();
//		
//		Book book1 = new Book(1, "Intro to Java", "Matty Ice", "232423");
//		Book book2 = new Book(2, "Testing in Java", "Matty Ice", "232423");
//		bookCatalog.addBook(book1);
//		bookCatalog.addBook(book2);
//
//		UI ui = new UI();
//		ui.printHeader();
//		
//		ui.printBookCatalog(bookCatalog.getBookArray());
//		
//		Book foundBook = bookCatalog.findBook("Intro to Java");
//		System.out.println(foundBook.getTitle());
	}
	
	
}
