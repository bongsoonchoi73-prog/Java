package com.kh.chep01.model.dto;

public class SwedenTombGoldCrown { 
	private String name;  // 이름
	private double weight;// 무게
	private double purity;// 순도
	
	public String getName() {
		return name;
	}
	public SwedenTombGoldCrown(String name, double weight, double purity) {
		super();
		this.name = name;
		this.weight = weight;
		this.purity = purity;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getPurity() {
		return purity;
	}
	public void setPurity(double purity) {
		this.purity = purity;
	}

}
