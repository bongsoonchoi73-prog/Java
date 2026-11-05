package com.kh.chep03;

public class SoftDrink extends Baverage {

	private String coke;

	public SoftDrink() {}
	public SoftDrink(String coke) {
		super();
		this.coke = coke;
	
	
}
	public String getCoke() {
		return coke;
	}
	public void setCoke(String coke) {
		this.coke = coke;
	}
}