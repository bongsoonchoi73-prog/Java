package com.kh.chep01.model.dto;

public class GldBracelet {
	private String name;//보물명
	private double weight;//무게
	private double perimeter;//출처

	
	public GldBracelet() {
		super();
	}
	public GldBracelet(String mane, double weight, double perimeter) {
		super();
		this.name = name;
		this.weight = weight;
		this.perimeter = perimeter;
	}

	//1. 기본생성자, 2. 모든 필드를 매개변수로 갖는 생성자
	// 기본생성자 단축키
	// Alt + shift + s -> 알파벳 o -> Alt + d -> Alt + g
	
    // 매게변수 생성자
    // Alt + shift + s -> o -> Alt + g

    // 게터세터 단축키 Alt + shift + s -> r -> Alt + a

	public String getMane() {
		return name;
	}
	public void setMane(String mane) {
		this.name = name;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getPerimeter() {
		return perimeter;
	}
	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}
	/*ublic String info() {
	    	return"보물정보 = [보물명 : " + name
	    		+" , 무게 : " +  weight
	    		+", 출처 : " + perimeter"]";
}*/
}