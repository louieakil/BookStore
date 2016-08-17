package lendinglibrary.models;

public class Book extends Material {

	private String author;
	private String isbn;
	private int noOfPages;
	
	public Book(String bookID, String title, String author, String isbn, String branch, int noOfPages){
		super(bookID, title, branch);
		this.author = author;
		this.isbn = isbn;
		this.noOfPages = noOfPages;
	}


	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getIsbn() {
		return isbn;
	}
	
	public void sendForRepair(){
		System.out.println("sent to be fixed");
	}


	@Override
	public int getLoanPeriod() {
		return 21;
	}
	
	@Override
	public String toString(){
		return "Book: " + getID() + " " + getTitle() + " / " + getAuthor();
	}

}
