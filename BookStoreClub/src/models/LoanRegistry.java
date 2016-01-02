package models;

import utilities.StatusType;

public class LoanRegistry {
	
	private Loan[] registry;
	private int nextPosition;
	
	public LoanRegistry(){
		registry = new Loan[100];
		nextPosition = 0;
	}
	
	
	public void addLoan(Loan loan) throws LoanExists {
		
		for (int i = 0; i < nextPosition; i++)
		{
			if (registry[i].equals(loan))
			{
				throw new LoanExists();
			}
		}
		
		registry[nextPosition] = loan;
		nextPosition++;
		
	}
	
	public Loan findLoan(int bookID) throws LoanNotFound {
		
		for (int i = 0; i < nextPosition; i++)
		{
			if (registry[i].getBook().getID() == bookID && registry[i].getStatus() == StatusType.CURRENT)
			{
				return registry[i];
			}
		}
		
		throw new LoanNotFound();
		
	}
	
	public boolean isBookOnLoan(int bookID)
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
