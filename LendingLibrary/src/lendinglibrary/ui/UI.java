package lendinglibrary.ui;
import java.text.NumberFormat;
import java.util.Map;

import lendinglibrary.models.Book;
import lendinglibrary.models.Material;

public class UI {
	
	public String getPrice(double price){
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		return nf.format(price);
	}
	
	public void printHeader(){
		System.out.println("Book ID     Title                  Author");
	}
	
	public void printBook(Book next){
		System.out.println(fixlenghthString(next.getID(),6) + " " + fixLengthString(next.getTitle(), 20) 
			+ " " + fixLengthString(next.getAuthor(), 20));
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
	
	public void printMaterialCatalog(Map<String, Material> map){
		for(Material next : map.values())
		{
			System.out.println(next.toString());
		}
	}
}
