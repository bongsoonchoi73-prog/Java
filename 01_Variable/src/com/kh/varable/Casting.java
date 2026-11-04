package com.kh.varable;

public class Casting {
	/*
	 * Type Casting(자료형변환) : 자료형을 바꾸는 개념
	 * 1. =(대입 연산자)를 기준으로 왼쪽 / 오른쪽 같은 자료형이어야 한다.
	 * => 같은 자료형에 해당하는 리터럴 값만 대입 할 수 잇음
	 * => 자료형이 다를 경우? => 바뀌어야함
	 * 
	 * 2.같은 자료형들끼리만 연산이 가능함
	 * => 자료형이 다른데 연산이 하고 싶으면 둘 중 하나를 나머지 하나와 동일하게 맞춤
	 * 
	 * 3.연산의 결과도 동일한 자료형이어야 한다.
	 * => 1 + 1 = 2(정수), 1,1 + 1.1 = 2.2(실수)
	 * 
	 * 
	 * 
     */
    // Promotion 자동형변환
	public void autoCasting() {
		/*
		 * 
		 */
		int intNum = 10;
		System.out.println(intNum);
		double doubleNum = intNum; // -> 자동형변환
		System.out.println(doubleNum);
		System.out.println(intNum);
		
		intNum = (int)doubleNum; // 강제형변환
		
		int bigInt = 120;
		long smallLong = bigInt;
		System.out.println(smallLong);
		
		double d = 111.34234;
		System.out.println((int)d);
		
		// long(정수,8byat)-> float(실수,4byat) -> 예외상황
		long longNumber = 1000L;
		long floatNumber = longNumber;
	    System.out.println(floatNumber);
	    // 4byatd의 float형이 long형보다 표현 할 수 잇는 값의 범위가 더 넓다
	    
	    //1.00000001 2.00000002 3.00000003
	    //char(2Byte,문자) -> int(4Byat, 정수)
	    
	    char ch = 'a';
	    System.out.println(ch);
	    int num = ch;
	    System.out.println(num);
	    char character = 97;
	    System.out.println(character);
	}
}
