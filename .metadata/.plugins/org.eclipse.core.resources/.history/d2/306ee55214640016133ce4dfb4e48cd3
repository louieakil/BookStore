package lendinglibrary.models;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class BookCatalog {

	private LinkedHashMap<String,Book> bookMap;
	
	public BookCatalog(){
		bookMap = new LinkedHashMap<String,Book>();
	}
	
	public LinkedHashMap<String, Book> getBookMap(){
		return bookMap;
	}
	
	public int getNumberofBooks(){
		return bookMap.size();
	}
	
	public void addBook(Book newBook){
		bookMap.put(newBook.getID(), newBook);
	}
	
	public Book findBook(String title) throws BookNotFoundException{
		title = title.trim();
		
		for(Book next: bookMap.values())
		{
			if(next.getTitle().equalsIgnoreCase(title))
			{
				return next;
			}
		}
		throw new BookNotFoundException();
	}
	
}
