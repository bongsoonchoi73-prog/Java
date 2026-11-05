package com.kh.chap01.abstraction.model.vo;



public class Dog {
	// [ 필드부 ]

	// 이름, 종, 나이, 성별, 중성화여부
	 public String name;// 개의 이름을 저장해야겠는데? ,public 접근제한자
	 // 립클리스에서 파란색은 필드다
	 public String spacies; // 종
	 public int age;// 나이
	 public char gender; // 성별
	 public boolean neuter; // 중성화
	 
	 
	 //[생성자부]
	 
	 //[ 메소드부] => Dog가 수행 할 수 있는 것
	 public void walk() { // 걸을 때 나의 이름을 말하며 걷고싶다
		                  // => walk메소드 입장에서 나의 이름은? 내부 / 외부
		 System.out.println("걷다");
	 }
	 
	 public void swingTail() {
		 //if(age < 10) {
			 
		 //}else
		 System.out.println(name + "이(가) 꼬리를 흔듭니다");
		 age++;
	 }
}
