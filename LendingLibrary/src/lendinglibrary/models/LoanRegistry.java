package lendinglibrary.models;

import lendinglibrary.util.BookStatus;

public class LoanRegistry {

	private Loan[] registry;
	private int nextPos = 0;
	
	public LoanRegistry(){
		registry = new Loan[100];
	}
	
	public void addLoan(Loan loan) throws LoanAlreadyExistsException{
		int i;
		for(i = 0; i <= registry.length; i++)
		
		if(loan.equals(registry[i])){
			throw new LoanAlreadyExistsException();
		}
		else{
			registry[nextPos] = loan;
			nextPos++;
		}
		
	}
	
	public Loan findLoan(Book bookId) throws LoanNotFoundException{ 
		for(int i = 0; i <= registry.length; i++){
			if(bookId.getID() == registry[i].getId() && registry[i].getStatus().equals(BookStatus.CURRENT)){
				return registry[i];
			}
		}
		throw new LoanNotFoundException();
	}
	
	public boolean isBookOnLoan(Book book){
		for(int i = 0; i <= registry.length; i++){
			if(book.getID() == registry[i].getId() && registry[i].getStatus().equals(BookStatus.CURRENT)){
				return true;
			}
		}
		return false;
		
	}
	
}
