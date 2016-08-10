package lendinglibrary.models.test;

import static org.junit.Assert.*;

import java.util.HashSet;

import org.junit.Test;

import lendinglibrary.models.Customer;
import lendinglibrary.models.CustomerAlreadyExistsException;
import lendinglibrary.models.CustomerNotFoundException;
import lendinglibrary.models.CustomerRecords;
import lendinglibrary.util.Gender;

public class CustomerRecordsTest {
	
	private CustomerRecords cr;
	
	public CustomerRecordsTest() throws CustomerAlreadyExistsException 
	{
		Customer customer23 = new Customer("Ms", "Sandra", "Fields", "grtreet", "77098799098", "maileghfhgr@mail.com", 23428,Gender.F);
		cr = new CustomerRecords();
		cr.addCustomer(customer23);
	}
	
	@Test
	public void testFindCustomer(){
		try {
			Customer foundCustomer = cr.findByName("Ms S Fields");
		} catch (CustomerNotFoundException e) {
			e.printStackTrace();
			fail("not found by name");
		}
	}
	
	@Test
	public void testNoDuplicates() throws CustomerAlreadyExistsException{
		Customer customer1 = new Customer("Ms", "Jackson", "Sorry", "grove street", "7709695122", "mailer@mail.com", 23428,Gender.F);
		
		int intialSize = cr.getNumberOfCustomer();
		
		cr.addCustomer(customer1);
		
		assertTrue(cr.getNumberOfCustomer() != intialSize);
		
	}
	
	@Test
	public void testAddCustomer() throws CustomerAlreadyExistsException {
		Customer customer1 = new Customer("Ms", "Jackson", "Sorry", "grove street", "7709695122", "mailer@mail.com", 23428,Gender.F);
	
		int intialSize = cr.getNumberOfCustomer();
		
		cr.addCustomer(customer1);
		
		assertTrue(intialSize == cr.getNumberOfCustomer() -1);
	}
	
	
}
