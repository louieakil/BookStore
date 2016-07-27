
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
	
	
	public Customer(String title, String firstName, String surname, String address, String phoneNumber, String email, Gender sex){
		System.out.println("New customer"+" "+ getFirstName() + "created");
		setName(title,firstName,surname);
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.sex = sex;
		this.isValid = isValid;
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
		String mailingName;
		mailingName = title + " " + this.getFirstName().substring(0, 1) 
				+ " " + this.getSurname();	
		return mailingName;
	}
	
}