package com.kh.chep02.model.factory;


import com.kh.chep02.model.fried.FriedPork;
import com.kh.chep02.model.fried.FriedRice;



public class CookFactory {
	public FriedRice creatrRice() {
		return new FriedRice();
		
	}
	public FriedRice createPork() {
		return new FriedRice();
	}
	public FriedRice create() {
		return creatrRice();
	}

}
