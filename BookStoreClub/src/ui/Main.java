package ui;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

import models.Book;
import models.BookCatalog;
import models.Customer;
import ui.UI;
import utilities.GenderType;
 
public class Main {

	public static void main(String[] args) {
		


		BookCatalog bookCatalog = new BookCatalog();
		
		Book book1 = new Book(1,"An intro to realness","Master Lew","12345");
		Book book2 = new Book(2,"Booming out the 6","Lew Will","23456");

		bookCatalog.addBook(book1);
		bookCatalog.addBook(book2);


		UI ui = new UI();
		ui.printHeader();
		ui.printBookCatalog(bookCatalog.getBookArray());
		
		Book foundBook = bookCatalog.findBook("Better java");
		if (foundBook !=null) {
			System.out.println(foundBook.getTitle());
		}
		
		Customer customer = new Customer("Mr", "Mike", "Will","333 foster","7709695176","@blah.com",3,GenderType.MALE);
		System.out.println(customer.getExpiryDate());
	}

}
