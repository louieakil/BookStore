package lendinglibrary.models;

import java.util.ArrayList;

import lendinglibrary.util.BookStatus;

public class LoanRegistry {

	private ArrayList<Loan> registry;
	
	public LoanRegistry(){
		registry = new ArrayList<Loan>();
	}
	
	public void addLoan(Loan loan) throws LoanAlreadyExistsException
	{
		
		if(registry.contains(loan))
		{
			throw new LoanAlreadyExistsException();
		}
		
		registry.add(loan);
			
	}
	
	public Loan findLoan(String bookId) throws LoanNotFoundException
	{ 
		for(Loan loan : registry)
		{
			if(bookId.equals(loan.getBookBorrowed().getID()) && loan.getStatus().equals(BookStatus.CURRENT))
			{
				return loan;
			}
		}
		
		throw new LoanNotFoundException();
	}
	
	public boolean isBookOnLoan(String bookiD)
	{
		try{
			Loan foundLoan = findLoan(bookiD);
			return true;
		}
		catch(LoanNotFoundException e){
			return false;
		}
	}
	
}
