package com.kh.condition;

import java.util.Scanner;

public class ConditionElse {
	/*
	 * if ~ else
	 * 
	 * [ 표현법 ]
	 * 
	 * if(조건식) { 조건식의 결과값이 ture일 경우 실행할 코드 - a } if (!조건식){ }
	 * 
	 * if(조건식){ 조건식의 결과 값이 true일 경우 실핼 코드 - a } else{ 조건식의 결과 값이 false일 경우 실핼 코드 - b
	 * }
	 */
	public void method1() {
		// 응모 가정 : 핸드폰 번호 입력받아서 당첨자 번호 같으면 o
		// 아님 x
		// 010-7777-7777 => 당첨자 번호

		// ctrl + shift + o
		Scanner sc = new Scanner(System.in);
		System.out.print("핸드폰 번호를 입력하세요 > ");
		String phoneNumber = sc.nextLine(); // int x
		System.out.println(phoneNumber);

		// 1.어떤값을 가지고 사용자가 입력한 폰번호 == phoneNumber / "010-7777-7777"
		// 2.어떤 연산 동등비교
		// = (동등비교연산자)의 경우 기본타입자료형 8개끼리만 사용가능
		// System.out.println(phoneNumber.equals("010-7777-7777"));
		// 문자열끼리 비교 == equals()메소드를 호출해서 비교
		// 문자열 값이 일치하면 ture / 일치하지 않으면 false
		if (phoneNumber.equals("010-7777-7777")) {
			System.out.println("당첨");
		} else {
			System.out.println("꽝");
		}
		/*
		 * if(1phoneNumber.equals("010-7777-777")){ System.out.println("꽝"); }
		 */

		/*
		 * if elsa if문
		 * 
		 * [ 표현법 ]
		 * 
		 * if(조건식1){
		 * 
		 * } else if(조건식2) {
		 * 
		 * } else if(조건식){
		 * 
		 * } else { }
		 * 
		 * 
		 * 
		 */
	}

	public void method2() {
		// 행드폰 뒷자리 입력 받아서 1등,2등,3등 외 미당첨
		// 1.1234 2.4567 3. 1111
		Scanner sc = new Scanner(System.in);
		System.out.println("핸드폰 번호 뒷자리를 입력해주세요 > ");
		String phoneNumber = sc.nextLine();
		System.out.println("사용자가 입력한 폰번호 : " + phoneNumber);

		if (phoneNumber.equals(" 1234 ")) {
			System.out.println("1등");
		} else if (phoneNumber.equals("5678")) {
			System.out.println("2등");
		} else if (phoneNumber.equals("1111")) {
			System.out.println("3등");
		} else {
			System.out.println("미당첨");
		}

	}

	public void ageCheck() {

		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력해주세요 > ");
		int age = sc.nextInt();
		System.out.println(age);
		
	/*	if (1 <= age && age <= 12) {
			System.out.println("어린이");
		} else if( 13 <= age && age <= 17) {
			System.out.println ("청소년");
		
		}else if( 18 <= age && age <= 32) {
			System.out.println ("성인");
		}
    */
		
	 }
	} 
	
		
	

