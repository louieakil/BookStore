package lendinglibrary.models;

public class BookCatalog {

	private Book[] bookArray = new Book[100];
	private int nextPos = 0;
	
	
	public Book[] getBookArray(){
		return bookArray;
	}
	
	public int getNumberofBooks(){
		return nextPos;
	}
	
	public void addBook(Book newBook){
		bookArray[nextPos] = newBook;
		nextPos++;
	}
	
	public Book findBook(String title) throws BookNotFoundException{
		title = title.trim();
		for(int i = 0; i < nextPos; i++){
			if(bookArray[i].getTitle().equalsIgnoreCase(title)){
				return bookArray[i];
			}
		}
		throw new BookNotFoundException();
	}
	
}
