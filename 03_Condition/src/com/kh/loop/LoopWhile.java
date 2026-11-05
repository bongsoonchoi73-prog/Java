package com.kh.loop;

import java.util.Scanner;

public class LoopWhile {
	/*
	 * while문
	 * 
	 * [표현식]
	 * 
	 * 초기식;
	 * 
	 * while(조건식) {
	 * 
	 *      증감식;
	 *      
	 * }
	 * 
	 * for   => 개발자가 반복을 몇 번 해야하는지 명확 할 때 씀
	 * while => 개발자가 반복을 몇 번 해야하는지 모를 때 씀
	 */
	public void method0() {
		
		int i = 0; // 초기식
		while(i < 3) { // 조건식
			System.out.println(i);
			 i++; //증감식
		}
	}
   public void method1() {
	   while (true) {//무한 반복
		   System.out.println("이런 느낌");
		   
	   }
   }
   
   public void method2() {
	   // 1부터 5까지 합계 출력
	   //System.out.println(1 + 2 + 3 + 4 + 5);
	   
	   // 무지성 반복문 => 불가능
	   // 조건 => 무지성 if문 가능
	   
	   // 반복횟수 정해져있음
	   int i = 1;
	   int sum = 0;
	   
	   while(i <= 10) {
		   sum += i;
		   i++;
	   }
	   
	   // 합계 출력
	   System.out.println(55);
   
   
   }

       // 로또 번호 만들어보기 v 0.1
     public void generateLottoNumber() {
    	 // 1 ~ 45 => 6개
         // random
    	 //Math m = new Math();
    	 System.out.println(Math.random());
     
    	 int number;
		 //1단계 =>10 곱하기
    	 //2단계 => (int)형으로 강제형변환
    	 //3단계 => + 1 (10 값 중 하나가 나옴)
     
    	 int num1 = (int)(Math.random() * 45) + 1;
    	 int num2 = (int)(Math.random() * 45) + 1;
    	 int num3 = (int)(Math.random() * 45) + 1;
    	 int num4 = (int)(Math.random() * 45) + 1;
    	 int num5 = (int)(Math.random() * 45) + 1;
    	 int num6 = (int)(Math.random() * 45) + 1;
    	 
    	 
    	 System.out.println("오늘의 운세 ~%d, %d, %d, %d, %d, %d");
    	 
    	 
    	 }
     
    	 
    /*
     *  탈출문
     *  
     *  break => break;를 만나는 순간 반복문 한겹 습득
     *  
     *  switch 내부에 작용하는 break;문과 구별
     * 
     */
    	 public void method4() {
    		 
    	 // 무한 반복
    	 // 매번 사용자에게 문자열 입력 받는다
    	 // 입력받는 문자열의 길이를 출력
         // 문자열이 "exit"와 같다면 반복문 종료
    	Scanner sc = new Scanner(System.in);
    	
    	while(true) {
    		System.out.print("글자수 체크(그만은 exit입력) > ");
    		String keyword = sc.nextLine();
    		System.out.println(keyword + "은(는) " + keyword.length() + "글자입니다");
    		
    		//exit 반복문 종료
    		if(keyword.equals("exit")) {
    			//break;
    			return;
    		}
    	}
    }
		 //System.out.println("다음에 또 만나요");

          /*
           * continue
           * 
           */
          public void checkId() {
	          System.out.println("회원가입 서비스입나다");
	          Scanner sc = new Scanner(System.in);
	          // 사용자에게 아이디를 입력받을 것
	          // 사용자 아이디 10글자 넘을 시 다시 입력
	          // 10글자 안넘을 시 다음 파트
	          
	          while (true) {
	        	  System.out.println("아이디를 입력해주세요(10글자를 넘기지 말아주세요) > ");
	        	  String userId = sc.nextLine();
	        	  
	        	  if(10 < userId.length()) {
	        		  System.out.println("아이디는 10글자 이하만 사용가능합니다");
	        		  continue;
	        	  } else {
	        		  System.out.println("사용 가능한 아이디입니다");
	        		  break;
	        	 }
	          }
	        	  System.out.println("비밀번호를 입력해보세요");
	          
         }
    }
    		 
    	 	 
   
     

