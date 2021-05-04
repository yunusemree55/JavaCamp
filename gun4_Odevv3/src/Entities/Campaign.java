package Entities;

import Abstract.Entity;

public class Campaign implements Entity {
	
	private int id;
	private String name;
	private String discount;
	
	public Campaign() {
		
	}
	
	public Campaign(int id, String name, String discount) {
		super();
		this.id = id;
		this.name = name;
		this.discount = discount;
	}

	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}
}

