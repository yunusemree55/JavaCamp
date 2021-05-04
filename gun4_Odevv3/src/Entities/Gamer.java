package Entities;

import java.time.LocalDate;

import Abstract.Entity;

public class Gamer implements Entity{
	private int id;
	private String firstName;
	private String lastName;
	private double money;
	private String nationalIdentity;
	private LocalDate dateOfBirth;
	
	public Gamer() {
		
	}
	
	public Gamer(int id, String firstName, String lastName,double money, String nationalIdentity, LocalDate dateOfBirth) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.money = money;
		this.nationalIdentity = nationalIdentity;
		this.dateOfBirth = dateOfBirth;
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

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public String getNationalIdentity() {
		return nationalIdentity;
	}

	public void setNationalIdentity(String nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
}

