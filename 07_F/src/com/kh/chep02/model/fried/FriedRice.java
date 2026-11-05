package com.kh.chep02.model.fried;

public class FriedRice extends Fried{
	
	private void rice() {
		System.out.println("볶음밥 나왓습니다");
		
	}
	@Override
	public void fried() {
		rice();
	}

}
