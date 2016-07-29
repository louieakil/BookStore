package lendinglibrary.ui;
import lendinglibrary.models.Book;
import lendinglibrary.models.BookCatalog;
import lendinglibrary.models.Customer;
import lendinglibrary.models.DVD;
import lendinglibrary.util.Gender;

public class Main {

	public static void main(String[] args) {
		
		BookCatalog bookCatalog = new BookCatalog();
		
		Book book1 = new Book(1, "Intro to Java", "Matty Ice", "232423", "mableton", 250);
		Book book2 = new Book(2, "Testing in Java", "Matty Ice", "232423", "douglas", 150);
		DVD dvd1 = new DVD(3, "Hot tub Time Machine", "Mabeleton", "Some guy", "9935", 120);
		
		book1.relocate("daBlock");
		
		bookCatalog.addBook(book1);
		bookCatalog.addBook(book2);

		System.out.println(dvd1.getTitle());
		
		UI ui = new UI();
		ui.printHeader();
		ui.printBookCatalog(bookCatalog.getBookArray());
		Book foundBook = bookCatalog.findBook("Intro to Java");
		Customer customer1 = new Customer("Ms", "Jacskon", "Sorry", "grove street", "7709695122", "mailer@mail.com", Gender.F);
		System.out.println(foundBook.getTitle());
		System.out.println(dvd1.lend(customer1));
		dvd1.license();
		System.out.println(dvd1.getTitle());
		
		
	}
	
	
}
