package com.kh.chep03;

public class Water extends Baverage{

	private String Watersource;

	public Water() {}
	public Water(String watersource) {
		super();
		Watersource = watersource;
	}


	public String getWatersource() {
		return Watersource;
	}

	public void setWatersource(String watersource) {
		Watersource = watersource;
	}

}
