package com.kh.operrater;

import java.util.Scanner;

public class OperaterController {
	
	public void artthmetic() {
		// 산술연산자 -> 이항연산자
		// % : 모듈러(Modular) => 나눗셈에서의 나머지를 구하는 연산
		
		int firstNum = 10;
		int secondNum = 2;
		System.out.println("first : " + firstNum);
		System.out.println("second : " + secondNum);
		//* 실습 -> com.kh.run 패키지를 만든 후 Run클래스 및 main매소들르 선언한 뒤
		//         main메소드에서 arithmanic메소드를 호출하여 콘송에 위 두 줄을 출력하기 시작
		
		System.out.println("first + second : " + firstNum + secondNum);
		
		System.out.println("frist + second : " + firstNum + secondNum);
		int sum = firstNum + secondNum;
	    System.out.println("first + second : " + sum);
	    System.out.print("first + second : ");
	    System.out.println(firstNum + secondNum);
	    System.out.printf("first +second : %d", firstNum + secondNum);
	    System.out.println();
	    
	    System.out.println("first - second" + (firstNum - secondNum));
	    
	    System.out.println("first X second : " + firstNum * secondNum);
	    System.out.println("first / second : " + firstNum / secondNum);
	    System.out.print("first mod second : " + firstNum % secondNum);
	    
	    System.out.println(10 / 0);
}

	// 고려은단 개수 구하기 프로그램 구현하기 실습
	// 메소드명 : presenToStudet()
	
	// 1.출력문을 아용하여 사용자에게 값을 입력 받으세요
	// 1_1. 고려은단 비타민씨를 받을 학생의 수
	// 1_2 나눠줄 수 잇는 비타민의 개수
	
	// 2. 방금 배운 산술연산자를 이용하여 결과값을 출력하세요
	// 2_1 1인당 받을 수 있는 비타민의 개수
	// 2_2 남은 비타민의 개수
	
	public void presentToStudent() {
		Scanner sc = new Scanner(System.in); 
	
		// System.out.println("학생의 수를 입력하세요 > ");
				
		int studentCount = sc.nextInt();
		System.out.println("입력받은 학생 수 : " + studentCount);
		
		// System.out.println("입력받은 비타민 수 : " + vitaminCount);
		int vitaminCount = sc.nextInt();
		System.out.println("한 사람 당 받을 수 있는 개수" + (vitaminCount / studentCount));
		System.out.println("남은 비타민의 개수 : " + (vitaminCount % studentCount));
	}
		public void increase() {
			/*
			 * 증강연산자 : 단한연산자로 한 번에 1증가하거나 / 1감소하는 연산을 함
			 * 
			 * [표현법] : ++ 값을 1증가
			 *          -- 값을 1감소 시킴
			 *          
			 *  증감,감소 순서 차이에 따라 연산자의 위치 달라짐
			 *  전위연산 / 후위연산
			 */
         int num = 10;
         System.out.println(num);
         num++;
		 System.out.println(num);
		}
		public void compound() {
			
			// = 대입연산자
			
			long veryBingNumberCount = 1000L;
			veryBingNumberCount = veryBingNumberCount + 1658;
			// 복합대입연산자
			// 자기자신과 산술연산을 수행한 후 그 결과를 자기자신에게 다시 대입하는 용도
			veryBingNumberCount += 1;
			System.out.println(veryBingNumberCount);
		}
		public void logicalNagatio(boolean ture) {
				// 논리 부전 연산자 : 논리값(ture,false)을 반대로 바꿔주는 연산자
				System.out.println(!ture);
			}
			public void comparison() {
				/*
				 * 관계연산자(비교 연산자)
				 * 
				 * 두 개의 값을 가지고 비교하는 이항 연산자
				 * 비교연산을 한 결과 -> ture,false
				 * 특정 조건을 제시 할 수 잇는 조건문에서 조건식으로 사용 할 것
				 * 
				 * 종류
				 * 
				 * 1. 동등비교 : 일치함을 비교
				 * a == b : a와 b가 일치합니까?
				 * a != b : a와 b가 일치하지 않습니까?
				 * 
				 * 2.대소비교 : 크고 작음을 비교
				 * a < b : a가 b보다 작습니까?
				 * a > b : a가 b보다 큽니까?
				 * a <= b : a가 b보다 작거나 같습니까?
				 * a >= b : a가 b보다 크거나 같습니까?
				 * 
				 * 결과는 항상 true / false
				 */
			// System.out.println(1 == 2);
					
			int firstNum = 10;
			int secondNum = 25;
				
			System.out.println(firstNum < secondNum);
			System.out.println(firstNum == secondNum);
			
			System.out.println("firstNimber가 짝수입니까?");
			// ture
			// 1번 짝수 확인반법 => 연산
			// 짝수 홀수 구분법 ==> 제일 쉬운방법 ==> 2로 나눴을 때 0과 같음 ==> 짝수
			
			System.out.println(true);
			System.out.println((firstNum % 2) == 0);
			}
			public void logical() {
				/*
				 * 논리 연산자 : 두 개의 논리값을 연산하는 연산자
				 * 
				 * [ 표현법 ]
				 * 
				 * 논리값 논리연산자 논라값 => 논리값
				 * 
				 * 종류
				 * 
				 * 1. AND 연산
				 * 좌항 우항의 값이 모두 true여야만 최종 결과값이 ture
				 *
				 * 
				 * 2. OR 연산
				 * 하나라도 true 일 경우 모두 같은 결과값
				 */
				//사용자에게 한 개의 정수값을 입력받음
				//입력한 정수 값이 0보다 크면서 짝수인지 판별
				//결과 출력
			
			Scanner sc = new Scanner(System.in);
			System.out.println("정수를 압력해주세요 > ");
			
			int num = sc.nextInt(); 
			//System.out.println(num > 0);
			//System.out.println(num % 2 == 0);
			boolean result = (num > 0 ) && (num % 2 == 0 );
			System.out.print("입력값이 0보다 크면서 짝수입니까? > " + result);
			}
			public void andOper() { 
				//사용자에게 정수값을 하나 입력 받은 후
				//입력 받은 정수값을 변수에 대입하고
				// 큰솔창에 출력해보세요
				
				Scanner sc = new Scanner(System.in);
				
				int num = sc.nextInt();
				System.out.println("입력한 정수값 : " + num);
			    // 사용자가 입력한 정수가 1~5 사이의 값인지 확인해서 출력
				// 1.값, 2. 연산 
				// 1 : 사용자가 입력한 값, 1, 5
				// 2 : 대소비교연산 1 <= 사용자가 입력한 값 <= 5
				// System.out.println( 1 <= num <= 5 );
			
				boolean result = num >= 1 && num <= 5;
				System.out.println(" 입력값이 1부터 5사이의 값인가요?" + result);
			}
				public void orOper() {
					// 사용자에게 한 글자를 입력 받아서
					// 입력받은 글자가 'A' 또는 'a'인지 확인해서 출력하기
					Scanner sc = new Scanner(System.in);
					System.out.print("한 글자만 입력하세요 > ");
					char letter = sc.nextLine().charAt(0); //index : 0부터 시작
					System.out.println(letter);
					
					// 1.값 => 'a' , 사용자가 입력한 한 글자
					// 2.연산 => 동등비교연산 == 
					boolean result = (letter == 'a') || (letter == 'A');
				    System.out.println("사용자가 입력한 값이 에이인가요 > " + result);
					
				}
				public void tip() {
					int num = 10;
					
					boolean result = false && (num > 0);
					boolean result2 = num < 0 && num == 10;
				}
				/*
				 * 삼항연산자 : 피 연산자 3개
				 * => 3개의 값과 1개의 연산자로 구성됨(조건문의 형식으로 사용됨)
				 * 
				 * 조건문: 값에 따라 연산 처리 방식
				 *     결과값이 ture일 경우 첫 문장을 처리
				 *     결과값이 false일 경우 다음 문장 처리
				 *
				 * 
				 */
				public void triple() {
					// 조건식 ? 조건식이 ture일 경우 결과값 : 조건식이 flase일 경우 결과값
					// 영화루 => 메뉴판 
					System.out.println("영화루에 오신것을 환영합니다");
					System.out.println("---메뉴를 선택해주세요---");
					System.out.println("1.고추간짜장");
	                System.out.println("2.고추 짬뽕");
					System.out.println("번호를 입력해주세요 > ");
					//
					// 사용자가 메뉴번호로
					// 1번을 입력하면 고추간짜장을 주문하셨습니다.
					// 2번을 입력하면 고추짬뽕을 주문하셨습니다.
				Scanner sc = new Scanner (System.in);
				int menuNo = sc.nextInt();
				// System.out.println(menuNo);
					
				String selected = menuNo == 1 ? "고추간짜장을 주문하셨습니다" 
				                :  menuNo == 2 ? " 고추짬뽕을 주문하셨습니다."
				                : "없는 메뉴입니다." ;
					
				System.out.println(selected);
					
				}			
				
			
		
			
			
			
		
		
		
	}

	
	


