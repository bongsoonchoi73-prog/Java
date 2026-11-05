package com.kh.suvway.model.dto;

public class Sandwich {
	private String name;
	private int price;
	private String material;

    public Sandwich(String name, int price, String material) {
			super();
			this.name = name;
			this.price = price;
			this.material = material;
			
			
			
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	
	public Sandwich() {
		super();
	}

}
