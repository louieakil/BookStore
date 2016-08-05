package lendinglibrary.models;
import java.util.Date;
import java.util.GregorianCalendar;

import lendinglibrary.util.Gender;

public class Customer {

	private String firstName;
	private String title;
	private String surname;
	private String address;
	private String phoneNumber;
	private String email;
	private int customerNumber;
	private Gender sex;
	private boolean isValid;
	private Date expireDate;
	
	
	public Customer(String title, String firstName, String surname, String address, String phoneNumber, String email, int customerNumber ,Gender sex){
		System.out.println("New customer"+ " "+ title + " " + firstName + " "+ "created");
		setName(title,firstName,surname);
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.sex = sex;
		this.isValid = true;
		this.customerNumber = customerNumber;
		GregorianCalendar gCal = new GregorianCalendar();
		gCal.add(GregorianCalendar.YEAR, 1);
		this.expireDate = gCal.getTime();
		
	}

	public String getFirstName() {
		return firstName;
	}
	
	public String getSurname() {
		return surname;
	}
	
	private void setName(String title, String firstName, String surname) {
		this.title = title;
		this.firstName = firstName;
		this.surname = surname;
	}
	
	public String getMailingName(){
		StringBuilder sb = new StringBuilder(title);
		sb.append(" ");
		sb.append(firstName.substring(0, 1));
		sb.append(" ");
		sb.append(surname);	
		return sb.toString();
	}
	
	public Date getExpireDate(){
		return expireDate;
	}

	@Override
	public String toString() {
		return getMailingName();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + customerNumber;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((expireDate == null) ? 0 : expireDate.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + (isValid ? 1231 : 1237);
		result = prime * result + ((phoneNumber == null) ? 0 : phoneNumber.hashCode());
		result = prime * result + ((sex == null) ? 0 : sex.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
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
		Customer other = (Customer) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (customerNumber != other.customerNumber)
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (expireDate == null) {
			if (other.expireDate != null)
				return false;
		} else if (!expireDate.equals(other.expireDate))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (isValid != other.isValid)
			return false;
		if (phoneNumber == null) {
			if (other.phoneNumber != null)
				return false;
		} else if (!phoneNumber.equals(other.phoneNumber))
			return false;
		if (sex != other.sex)
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	
	
	
}
