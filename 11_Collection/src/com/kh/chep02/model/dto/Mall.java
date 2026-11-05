package com.kh.chep02.model.dto;

public class Mall {
	private String brand;
	private String address;
	
	public Mall() {
		super();
	}
	public Mall(String brand, String address) {
		super();
		this.brand = brand;
		this.address = address;
	}
	public String getBrand() {
		return brand;
	}
	public String getAddress() {
		return address;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setAddress(String address) {
		this.address = address;
		
	}
	
	
	

}
