package models;

import java.util.ArrayList;

import utilities.StatusType;

public class LoanRegistry {
	
	private ArrayList<Loan> registry;
	
	public LoanRegistry(){
		registry = new ArrayList <Loan>();
	}
	
	
	public void addLoan(Loan loan) throws LoanExists {
		
		if(registry.contains(loan))
		{
			throw new LoanExists();
		}
		registry.add(loan);
	}
	
	public Loan findLoan(String bookID) throws LoanNotFound {
		
		
		for (Loan loan : registry)
		{
			if (loan.getBook().getID().equals(bookID) && loan.getStatus() == StatusType.CURRENT)
			{
				return loan;
			}
		}
		
		throw new LoanNotFound();
		
	}
	
	public boolean isBookOnLoan(String bookID)
	{
		try {
			Loan foundLoan = findLoan(bookID);
			return true;
		}
		catch (LoanNotFound e){
			return false;
		}
	}
	
}
