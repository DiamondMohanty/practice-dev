package dev.practice.medicineinventory.domain;

import java.util.Date;

public class Medicine {

	private String id;
	private Date expiryDate;
	private Date manufacturedDate;
	private String name;
	private Double price;
	
	public Medicine() { }
		
	public Medicine(String barCode, Date expiryDate, Date manufacturedDate, String name, Double price) {
		super();
		this.id = barCode;
		this.expiryDate = expiryDate;
		this.manufacturedDate = manufacturedDate;
		this.name = name;
		this.price = price;
	}

	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public Date getExpiryDate() {
		return expiryDate;
	}
	
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	
	public Date getManufacturedDate() {
		return manufacturedDate;
	}
	
	public void setManufacturedDate(Date manufacturedDate) {
		this.manufacturedDate = manufacturedDate;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Double getPrice() {
		return price;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	
}
