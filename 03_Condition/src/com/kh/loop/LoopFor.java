package com.kh.loop;

import java.util.Scanner;

public class LoopFor { // 반복문
	
	public void method0() {
		
		//System.out.println("주목");
		// 100번
		for( 
				int i = 0;
				i < 100;
				i++
				) {
			System.out.println(i + 1 + "번 반복");
		}
		
	}
	/*
	 *for문
	 *
	 *for() {}
	 *
	 *초기식; 조건식; 증강식   세가지의 요소로 구성
	 * 
	 *for(int i = 0; i < 5; i++ {
	 *     반복 코드;
	 *     }
	 *     
	 *     초기식 : 반복문을 시작 할 때 " 초기에 단 한번만 실행" 될 구분 반복을 할 때 필요한 변수를 선언 뒤 초기화 구문(제어변수)=> int i = 0;
	 *     
	 *     조건식 : "반복문이 실행될 조건"을 작성하는 구문
	 *             조건식의 결과가 ture일경우 Scope내부로 진입
	 *             조건식의 결과가 false일경우 scope밖으로 빠져나감 => i < 5;
	 *             
	 *     증강식 :  "반복문을 제어하는 제어변수에 대입된 값"을 증감하는 구문"
	 *     제어변수명은 보편적으로 i,j,k
	 * 
	 * 
	 */
	
	public void gugudan() {
		// 목표 내일까지 배열 끝내기
		
		// 구구단 출력 프로그램
		
		// 사용자에게 정수를 입력받아서
		// 입력받은 정수의 단을 출력해보기
		
		Scanner sc = new Scanner(System.in);
		  System.out.println("구구단을 외우자");
		  System.out.println("몇 단을 출력하시겠어요? > ");
		    int dan = sc.nextInt();
		    System.out.println( dan + "단을 출력하겠습니다");
		    
		
	}
	
	

	}
