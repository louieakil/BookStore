package models.test;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.Test;

import models.Book;
import models.Customer;
import models.Loan;
import utilities.GenderType;

public class LoanTest {

	@Test
	public void testDueDate() {
		
		Book book = new Book("0","","","","",0);
		Customer customer = new Customer("", "", "", "", "", "", 0, GenderType.MALE);
		
		Loan loan = new Loan(0,customer,book);
		
		GregorianCalendar gcExpect = new GregorianCalendar();
		gcExpect.add(GregorianCalendar.DAY_OF_MONTH, 14);
		
		GregorianCalendar gcActual = new GregorianCalendar();
		gcActual.setTime(loan.getDueDate());
		
		assertEquals("Checking year", gcExpect.get(GregorianCalendar.YEAR), gcActual.get(GregorianCalendar.YEAR));
		assertEquals("Checking month",gcExpect.get(GregorianCalendar.MONTH), gcActual.get(GregorianCalendar.MONTH));
		assertEquals("Checking day",gcExpect.get(GregorianCalendar.DAY_OF_MONTH), gcActual.get(GregorianCalendar.DAY_OF_MONTH));
		
		
		
		
	}

}
