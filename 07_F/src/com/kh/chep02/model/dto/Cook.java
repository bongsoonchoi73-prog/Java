package com.kh.chep02.model.dto;

/*
 * 클래스 내부에 추상메소드가 한개라도 오는 순간
 * 클래스 또한 anstract 키어드를 붙여서 추상 클래스로 정의 해야함
 * 
 * 추상 클래스 == 필드 + 멧ㅎ드 + 추상메소드 존재하지 않아도 추상클래스 정리
 * 
 * 
 * 1. 구햔하는 도중 해당 클래스가 구체적으로 구현된 상태가 아닌 것 같을 시 추상클래스 선언
 * 2.지금 이 클래스는 부모클래스 역할만 할 것이고 개체 생선은 불가능해야한다 추상클래스 선언
 * 
 * 
 */

public abstract class Cook {
  private String name;
  public Cook(String name) {
	  this.name = name;
	  
  }
//추상황 => 추상 매소드
 //anstract<=> impemaet

//public abstract void static { // dyname / automaic
                            //  / Virtual == logical /physical

  public void breakTime() {
	  System.out.println(" 쉬는 시간입니다 ");
  }

public void cooking() {
	
	
}

public void Cooking() {
	// TODO Auto-generated method stub
	
}
  
}
