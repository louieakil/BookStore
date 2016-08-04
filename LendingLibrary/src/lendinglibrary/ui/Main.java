package lendinglibrary.ui;
import java.text.SimpleDateFormat;

import lendinglibrary.models.Book;
import lendinglibrary.models.BookCatalog;
import lendinglibrary.models.BookNotFoundException;
import lendinglibrary.models.Customer;
import lendinglibrary.models.DVD;
import lendinglibrary.models.Loan;
import lendinglibrary.util.Gender;

public class Main {

	public static void main(String[] args) {
		
//		BookCatalog bookCatalog = new BookCatalog();
//		
//		Book book1 = new Book(1, "Intro to Java", "Matty Ice", "232423", "mableton", 250);
//		Book book2 = new Book(2, "Testing in Java", "Matty Ice", "232423", "douglas", 150);
//		DVD dvd1 = new DVD(3, "Hot tub Time Machine", "Mabeleton", "Some guy", "9935", 120);
//		
//		book1.relocate("daBlock");
//		
//		bookCatalog.addBook(book1);
//		bookCatalog.addBook(book2);
//
//		System.out.println(dvd1);
//		
//		UI ui = new UI();
//		ui.printHeader();
//		ui.printBookCatalog(bookCatalog.getBookArray());
//		
//		try{
//			Book foundBook = bookCatalog.findBook("I Java");
//			System.out.println(foundBook.getTitle());
//		}
//		catch(BookNotFoundException e){
//			System.out.println("not found book");
//		}
//		
//		Customer customer1 = new Customer("Ms", "Jacskon", "Sorry", "grove street", "7709695122", "mailer@mail.com", Gender.F);
//
//		System.out.println(dvd1.lend(customer1));
//		dvd1.license();
//		System.out.println(dvd1.lend(customer1));
//		System.out.println(dvd1.lend(customer1));
//		System.out.println(dvd1.getLoanPeriod());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Loan test = new Loan(22, null, null);
		System.out.println(sdf.format(test.getStartDate()));
		System.out.println(sdf.format(test.getDueDate()));
		System.out.println(sdf.format(test.getReturnDate()));
		
		
		
	}
	
	
}
