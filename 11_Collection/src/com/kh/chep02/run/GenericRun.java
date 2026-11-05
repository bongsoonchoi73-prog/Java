package com.kh.chep02.run;

import java.util.ArrayList;

public class GenericRun {

	public static void main(String[] args) {
		ArrayList list = new ArrayList(); 
		list.add(" 하이 ");
		list.add(1);
		list.add(true);
		
		String text = (String) list.get(0);
	    int nuber = (int) list.get(1);
		}
	/*
	  Box box = new Box();
	  box.set("하하");
	  box.set(1);
	  box.set(new Mall("스타필드" , "고양"));
	  
	  Box<String> b = new Box();
	  // 제네릭 : 타입지정을 컴파일 시점에 체크하는 것
	  b.set("타입");
	  // b.set(123123);
	  
	}*/
	/*
	 * 개발자들끼리 암묵적 약속
	 * 
	 * T -> Type      ==>> 아무타입
	 * E -> Element   ==>> 요소라는 의미를 적을 땐 E
	 * R -> Return    ==>> 반환타입
	 * N -> Number    ==>> 숫자타입
	 * K -> key       ==>> Map의 Key타입
	 * V -> Value     ==>> Map의 Value값
	 * 
	 */
/*	
	ArrayList malls = new ArrayList();
	malls.add(new Mall("스타필드", " 하남"));
	
	Mall mall = malls.get(0); // 형변환 객차를 생략할 수 있다 
	
	*/
}


