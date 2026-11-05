package com.kh.chep01.model.dto;

public class PrinceTombGoldCrown {
	private String name; // 이름
	private double weight; // 무게
	private double purity; // 숭도
	private String source; // 출처

	public PrinceTombGoldCrown() {
		super();
	}

	public PrinceTombGoldCrown(String name, double weight, double purity, String source) {
		super();
		this.name = name;
		this.weight = weight;
		this.purity = purity;
		this.source = source;
	}

	public String getName() {
		return name;
	}

	public double getWeight() {
		return weight;
	}

	public double getPurity() {
		return purity;
	}

	public String getSource() {
		return source;
	}

	
}
