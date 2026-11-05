package com.kh.chap06.controller;

public class MethodController {
	/*
	 *  메소드(Method) == 멤버 변수
	 *  
	 *  프로그래밍 언어에서의 함수 : 틀정 작업을 수행하기 위해서 만드렁지 코드 블럭
	 *  1. 재사용성
	 *  2. 모듈화
	 *  
	 * 객체지향 프로그래밍에서의 함수(메소드) : 객체가 수행할 수 있는 행동을 정의한 코드 블럭
	 *
	 * 특정 자료형에서만 사용 가능한 함수
	 * 
	 * [ 표현법 ]
	 * 
	 * 접근제한자 예약어 반환형 메소드식별자(매개변수의 자료형 매개변수식별자]
	 *     수행할 코드;
	 *     return 반환값;
	 * }
	 * 생략 가능한 것 : 예약어, 매개변수 ,return(void)
	 * 반환형: 반환값이 존재할 시 반환갑의 자료형
	 * 메소드 호출 시 전달 인자값 => 매개변수의 자료형 및 개수가 일치해야함
	 */
	// 정수 값 두개를 받아서 합을 반환해주는 기능을 구현
	// Method Signature
    public int add(int a, int b) { // Method Body
    	return a + b; /// Return Value
    }
}
