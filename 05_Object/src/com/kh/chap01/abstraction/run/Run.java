package com.kh.chap01.abstraction.run;

import com.kh.chap01.abstraction.model.vo.Dog;

public class Run {
	
	public static void main(String[] args) {
        //현실 개 
		// 종 : 도베르만 , 이름 : 나폴레옹, 나이: 6, 성별 : M, 중성화여부 : 안함
		
		
		Dog dog = new Dog(); //개체 생성
	    // dog.walk();
		// 참고자료형은 기본값이 null이다
		dog.name = "나폴레옹";
		System.out.println(dog.name);
	    
		// 종 : 푸들. 읾 : 징기스칸, 나이 : 6,성별 : M, 중성화여부 : 안함
		Dog Khan = new Dog();
		Khan.name = "징기스킨";
		System.out.println(Khan.name);
		
	    // 실제화 = 객체생성 = 인스턴스화
		// 클래스 => 객체가 가지는 정보(속성,행위) 들을 담아내는 그릇 또는 틀 또는 설계도 또는 명세
		// 사용자 정의 자료
		
		dog.walk();
		Khan.walk();
		
		dog.age = 6;
		System.out.println(dog.age);
		
		dog.swingTail();
		System.out.println(dog.age);
		
		     
	}
	
}
