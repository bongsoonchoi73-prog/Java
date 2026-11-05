package com.kh.chap08.controller;

import com.kh.chap08.model.dto.Fruit;
import com.kh.chap08.model.service.FruitService;

public class FruitController { //view랑 Service 중간다리
  private FruitService fs = new FruitService();
  
	public void saveFruit(String name, String species) {
		//System.out.println("view로 부터 전달받은 name : " + name);
		//System.out.println("view로 부터 전달받은 species : " + species);
		
		Fruit f = new Fruit(name, species);
		fs.saveFruit(f);
	}
	public void findFrult() {
		Fruit fruit = fc.findFriut();
		String info = fruit.info();
		System.out.println(info);
		
		System.out.println("과일명을 입력하세요");
		String name = sc.nextLine();
		System.out.println("품종을 입력하세요");
		String species = sc.nextLine();
		
		fc.saveFruit(name, species);
		
	}
	private void findFruit() {
		Fruit fruit = fc.findFruit();
		String info = fruit.info();
		System.out.println(info);
		
	}
	public void harvest() {
		fs.harvest();
	}
}
