package com.kh.chep02.model.dto;
             //자식클래스 extends 부모클래스
public class Beacelet extends Treasure {
//부모로부터 상속받는 부분은 작성하지 않는다
	private double perimeter;
	
	public Beacelet() {}
	public Beacelet(String name,double weight, double perimeter) {
		super();
		this.perimeter = perimeter;
		
	}
	public double getPerimeter() {
		return perimeter;
	}
	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}
	//메소드를 상속받는데 맘에 안든다
	// 다시 쓸 수 있음
	public String info() {
		return super.info() + ", 지름 : " + perimeter;
 } 
}