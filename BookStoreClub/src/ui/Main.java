package ui;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

import models.Book;
import models.BookCatalog;
import models.BookNotFoundException;
import models.Customer;
import models.DVD;
import models.Loan;
import models.LoanExists;
import models.LoanRegistry;
import models.Material;
import ui.UI;
import utilities.GenderType;
 
public class Main {

	public static void main(String[] args) {
		
		double d = 1.2345;
		NumberFormat nf = NumberFormat.getPercentInstance();
		System.out.println(nf.format(d));

		BookCatalog bookCatalog = new BookCatalog();
		
		Book book1 = new Book(1,"An intro to realness","Master Lew","12345", "Carroll", 425);
		Book book2 = new Book(2,"Booming out the 6","Lew Will","23456", "Carroll", 150);
		DVD dvd1 = new DVD(3,"Film about my life", "By Lew Will", "Carroll Branch","99887", 120);
		DVD dvd2 = new DVD(3,"Film about my life", "By Lew Will", "Carroll Branch","99887", 120);		

		
		bookCatalog.addBook(book1);
		bookCatalog.addBook(book2);


		UI ui = new UI();
		ui.printHeader();
		ui.printBookCatalog(bookCatalog.getBookArray());
		
		try 
		{
		Book foundBook = bookCatalog.findBook("Better java");
		System.out.println("The book is " + foundBook.getTitle());
		}
		catch (BookNotFoundException e)
		{
			System.out.println("Book not found");
		}
		
		
		Customer customer = new Customer("Mr", "Mike", "Will","333 foster","7709695176","@blah.com",3,GenderType.MALE);
		System.out.println(customer.getExpiryDate());
		System.out.println(customer.getMailingName());

		System.out.println(customer);
		System.out.println(dvd1.equals(dvd2));
		
		Loan loan1 = new Loan(1, customer, book1);
		System.out.println(loan1.getDueDate());
		
		LoanRegistry registry = new LoanRegistry();
		try
		{
		registry.addLoan(loan1);
		System.out.println("Added Loan");
		}
		catch (LoanExists e) 
		{
		System.out.println("Added Loan FAILED!!!");
		}
		
		System.out.println(registry.isBookOnLoan(book1.getID()));
		loan1.endLoan();
		System.out.println(registry.isBookOnLoan(book1.getID()));
	}

}
