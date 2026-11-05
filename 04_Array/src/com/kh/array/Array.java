package com.kh.array;

import java.util.Arrays;

public class Array {
	
	// 변수 (Variable)
		// 메모리(RAM) 공간에 Data(VALUE)값을 저장하는 공간
		
		// 특징
		// 초기화(Initialize)해야만 사용할 수 있음, 선언된 Scope에서만 쓸 수 있음
		// 하나의 변수에는 하나의 값만 대입할 수 있다, 자료형은 크기가 정해져 있다
		
		/*
		 * 배열 : 하나의 배열에 여러 개의 값을 담을 수 있음
		 *       단, 같은 자료형의 값들만 담는다
		 *       동종모음 (homogeneous collection)이라고도 부름
		 *       
		 *   => 배열의 각 공간에 접근할 때 사용하는 개념 index / index는 0부터 시작한다
		 *   
		 *
		 */

		public void method1() {
		    // 자료형 + 식별자 = 변수 선언
			// *배열 : 논리적인 구조와 물리적인 구조가 같다*******
			// 배열 선언
			
			// 변수 선언 => 자료형 변수식별자;
			// 배열 선언 = .
			// 1) 자료형 배열식별자[];
			// 2) 자료형[] 배열식별자[]; => 두 번재 방법 당첨
			
			// int num = 0;
			// int[] nums; //int형 배열
			// double[] d;
			
			// 2. 배열 할당
			/*
			 * 배열에 몇 개의 값이 들어갈 것인지 배열의 크기를 정해주는 과정
			 * 
			 * int[] nums; <-- 배열 선언
			 * nums = new int[]; <-- 선언과 동시에 할당
			 * 
			 * int[] arr = new int[3]; <-- 선언과 동시에 할당
			 * 
			 * 배열은 참조자료형이다
			 */
			// nums라는 정수형 배열을 선언하고 3칸을 할당받기
			int[] nums = new int[3];
			
			// System.out.println(nums);
			
			nums[0] = 10;
			
		     System.out.println(nums[0]);
		     System.out.println(nums[1]);
			 System.out.println(nums[2]);
			
			int sum = 0;
		    for(int i = 0; i < 3; i++) 
		    	sum += nums[i];
		    // *new = heep의 영역에 있다*
		    }
		
		  public void method2() {
		    	
		     // 1. 배열 선언 및 할당
		    int[] nums =  new int[3]; // 
		        
		    System.out.println(nums[0]);
		    // 지역변수는 초기화, 기본 값이 들어있다면 초기화 x
		    
		    /*
		     * 기본자료형 : 변수 송간에 실제 값을 바로 담을 수 있음
		     *
		     * 참조자료형 : int[].. String
		     *         => 참조자료형은 변수 공간에 주소 값을 담을 수 있다
		     *         => hashCode
		     *         => length 배열 할당
		     */
		    }
		  
		  public void method3() {
			  
			  int[] nums = new int[3];
			  
			  nums[0] = 10;
			  nums[1] = 15;
			  nums[2] = 20;
			  System.out.println("흐흐");
			  nums[3] = 1;
		  }
		  // System.out.println(Array.toSring(nums));
		  
          public void method0() {
        	  // 배열은 사용해야 하는 값과 개수가 명확한 경우
        	  // 임시비밀번호 발급,인증코드 발급
        	  
        	  // 배열 소스코드 작업 시 
        	  // int[] arr = (100. 200. 300. 400. 500, 600);
        	  // System.out.println(Arrays.toString(arr)); //초기 값을 넣는 걸 초기화
          }
          
          public void method5() { //***********
        	  //*잘 기억하기*
        	  // 중독
        	  
        	  char[] addiction = new char [2];
        	  addiction[0] = '중';
        	  addiction[1] = '독';
              //System.out.println(toString(addiction));
        	  addiction = new char[3];
        	  // addiction = '성';
        	  // System.out.println(toString(addiction));
        	  /*
        	   * 연결이 끊긴 기존의 밴열은 일정 시간이 지남ㄴ GarbegeCollection(G.C) 가 알아서 삭제
        	   * 자동 메모리 관리
        	   * 기존 배열 식별자에 할당만 새롭게 한다면 => 기존에 참조하고 있던 연결이 끊기면서 새로운 배열
        	   */
        	  // 차형 배열 => 차형 배열의 주소값
        	  addiction = null; //아무것도 존재하지 않음을 의미하는 값 ,오직 주소 값
        	  System.out.println(addiction);
          }
           public void method6() { 
        	   // 복사
        	   
        	   // 얕은 복사, 깊은 복사 => 얕은 복사 중요*********
        	   //: 얕은 복사
        	   int[] origin = {1 ,2 ,3};
        	   //new int[3];
        	   System.out.println(Arrays.toString(origin));
        	   
        	   int[] copy = origin;
        	   System.out.println(Arrays.toString(copy));
        	   
        	   origin[2] = 33;
        	   System.out.println(Arrays.toString(origin));
        	   System.out.println(Arrays.toString(copy));
        	   // 얕은 복사 => 주소갑을 대입라는 것이기 때문에 가리키고 있는 대상이 같다
           
           
           
        	   // 깊은 복사 => 기존 배열의 크기보다 큰 배열로 복사하는 경우
           }
           public void method7() {
        	   
        	   int[] origin = { 1, 2, 3};
        	   int[] copy = new int[6];
        	   
        	   copy[0] = origin[0];
        	   copy[1] = origin[1];
        	   copy[2] = origin[2];
        	   for(int i = 0; i < origin.length; i++) {
        		    copy[i] = origin[i];
        	   }
                
                 System.out.println(Arrays.toString(copy));
                //클래스 / 인터페이스 == 네이밍컨벤션 == 첫글자가 대문자
                 int[] copy2 = new int[10];
                		 
                 System.arraycopy(origin, 0, copy2, 0, 3);
        	     System.out.println(Arrays.toString(copy2));
                 // arraycopy(원본배열,복사본배열,복사본에서복사될인덱스)
        	     int[] copy3 = Arrays.copyOf(origin,  15);
        	     System.out.println(Arrays.toString(copy3));
                
               
               
           }   

       }
