package lendinglibrary.models;

import java.util.Date;
import java.util.GregorianCalendar;

import lendinglibrary.util.BookStatus;

public class Loan {

	private int id;
	private Customer customer;
	private Book bookBorrowed;
	private Date startDate;
	private Date dueDate;
	private BookStatus status;
	private Date returnDate;
	
	public Loan(int id, Customer borrower, Book bookBorrowed) {
		this.id = id;
		this.customer = borrower;
		this.bookBorrowed = bookBorrowed;		
		this.status = BookStatus.CURRENT;	
		this.startDate = new Date();
		GregorianCalendar gCal = new GregorianCalendar();
		gCal.setTime(startDate);
		gCal.add(GregorianCalendar.DAY_OF_WEEK_IN_MONTH, 2);
		this.dueDate = gCal.getTime();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Customer getBorrower() {
		return customer;
	}

	public void setBorrower(Customer borrower) {
		this.customer = borrower;
	}

	public Book getBookBorrowed() {
		return bookBorrowed;
	}

	public void setBookBorrowed(Book bookBorrowed) {
		this.bookBorrowed = bookBorrowed;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	public BookStatus getStatus() {
		return status;
	}

	public void setStatus(BookStatus status) {
		this.status = status;
	}

//	public Date getReturnDate() {	
//		if(status == BookStatus.CURRENT){
//			return this.returnDate = null;
//		}
//		else{
//			GregorianCalendar gCal = new GregorianCalendar();
//			gCal.setTime(startDate);
//			return gCal.getTime();
//		}
//	}
//
//	public void setReturnDate(Date returnDate) {
//		this.returnDate = new Date();
//	}
	
	public void endLoan(){
		this.status = BookStatus.HISTORIC;	
	}
	
	@Override
	public String toString() {
		return "Loan [id=" + id + ", borrower=" + customer.getMailingName() + ", bookBorrowed=" + bookBorrowed.getTitle() + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Loan other = (Loan) obj;
		if (id != other.id)
			return false;
		return true;
	}
		
}
