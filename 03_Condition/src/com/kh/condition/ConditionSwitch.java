package com.kh.condition;

import java.util.Scanner;

public class ConditionSwitch {
	
	public void method0() {
		
		Scanner sc =  new Scanner(System.in);
		System.out.print(" 몇 층 가세요?( B1 /B2 / B3) > ");
		String floor = sc.nextLine();
		
		switch(floor) {
		case "B1" : System.out.println("지하1층"); break;
		case "B2" : System.out.println("지하 2층");break;
		case "B3" : System.out.println("지하 3층");
		}
		/* [표현식]
		 * 
		 * switch(case문에 기술할 동등비교 대상) (
		 * case 정수,실수,문자열,문자 : 실행할코드;
		 * )
		 * 
		 * 모던 스위치
		 * 
		 */
		
			}
		
	}


