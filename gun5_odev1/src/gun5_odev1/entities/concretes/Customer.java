package gun5_odev1.entities.concretes;

import gun5_odev1.entities.abstracts.Entity;

public class Customer implements Entity{
	
	private int id;
	private String firstName;
	private String lastName;
	private String emailAddress;
	private String password;
	
	public Customer() {
		
	}
	
	public Customer(int id, String firstName, String lastName, String emailAddress, String password) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
		this.password = password;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
