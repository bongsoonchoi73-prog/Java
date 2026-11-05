package com.kh.chep04;

public class Gimbap {
	private String name;
	private String mainMeun;
	private int price;
	
	public Gimbap() {
		super();
	}
	public Gimbap(String name, String mainMeun, int price) {
		super();
		this.name = name;
		this.mainMeun = mainMeun;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMainMeun() {
		return mainMeun;
	}
	public void setMainMeun(String mainMeun) {
		this.mainMeun = mainMeun;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	

}
