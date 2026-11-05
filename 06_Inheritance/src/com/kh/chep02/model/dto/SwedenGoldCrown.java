package com.kh.chep02.model.dto;

public class SwedenGoldCrown extends Treasure {

	private double purity;
	
	public SwedenGoldCrown() {}
	public SwedenGoldCrown(String name, double weight, double purity) {
		
	super(name,weight);
	this.purity = purity;
	}
	public double getPurity() {
		return purity;
	}
	public void setPurity(double purity) {
		this.purity = purity;
	}
}
