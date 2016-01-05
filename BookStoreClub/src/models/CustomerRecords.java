package models;

import java.util.HashSet;

public class CustomerRecords {
	
	private HashSet<Customer> records;
	
	public CustomerRecords(){
		records = new HashSet<Customer>();
	}
	
	
	public void addCustomer(Customer newCustomer){
		records.add(newCustomer);
	}
	
	public Customer findByName(String name) throws CustomerNotFoundException
	{
		for(Customer theirName : records)
		{
		if (theirName.getMailingName().equals(name))
			{
			  return theirName;
			}
		}
		throw new CustomerNotFoundException();
	}
	
	public int getNumberOfCustomer(){
		return records.size();
	}
	
}
