package com.kh.chap08.model.service;

import com.kh.chap08.model.dto.Fruit;

public class FruitService { //연산
	//private Fruit fruit;
	//private Fruit secondFruit;
	//private Fruit thirdFruit;
	private Fruit[] fruits = new Fruit[3];
	
	public void saveFruit(Fruit f) {
		/*
	   if(fruit == null) {
		   this.fruit = f;
	   }else if(secondFruit == null) {
		   this.secondFruit = f;
	   }else if(thirdFruit == null) {
		   this.thirdFruit = f;
	   }
	   for(int i =0; i < frits.lengh; i++) {
	    if(fruits[i] == null) {
	     fruits[i] = f;
	     retutn;
	}
     public Fruit findFruit() {
    	// return fruit;
    	// 빈 과일이 하나라도 존재한다면 null을 반환
    	if(fruit != null) {
    	   return fruit;
    	}
    	 if(secondFruit != null) {
    		return secondFruit;
    	}
         if(thirdFruit != null) {
    		return thirdFruit;
    	}
    	return null;
    	/*
    	return fruit != null ? fruit : secondFruit != null
    	                     ? secondFruit : thirdFruit != null
    	                     ? return thirdFruit;
    	 */
    }
    public void harvest() {
    	//식물 뽑기
    	//fruit =null;
    }
}
