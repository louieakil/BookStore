package lendinglibrary.ui;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.LinkedHashMap;

import lendinglibrary.models.Book;

public class UI {
	
	public String getPrice(double price){
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		return nf.format(price);
	}
	
	public void printHeader(){
		System.out.println("Book ID     Title                  Author");
	}
	
	public void printBook(Book book){
		System.out.println(fixlenghthString(book.getID(),6) + " " + fixLengthString(book.getTitle(), 20) 
			+ " " + fixLengthString(book.getAuthor(), 20));
	}
	
	private String fixLengthString(String start, int length){
		//TODO: fix string heading problem
		if(start.length() >= length){
			return start.substring(0, length);
		}
		else {
			while (start.length() < length){
				start += " ";
			}
			return start;
		}
	}
	
	private String fixlenghthString(String string, int length){
		String startString = String.valueOf(string);
		return fixLengthString(startString, length);
	}
	
	public void printBookCatalog(LinkedHashMap<String,Book> bookCatalog){
		for(Book next : bookCatalog.values())
		{
			printBook(next);
		}
	}
}
