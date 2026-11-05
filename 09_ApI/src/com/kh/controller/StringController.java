package com.kh.controller;

import com.kh.run.MathRun;

public class StringController {
	
	// 스트링
	String s = "";
	// 정답 = 4Byte
	// 참조자료형     => (s) 주소값
	// String 클래스 => 불변(변하지않음)
	public void method1() {
		String str1 = new String("hellow");
		String str2 = new String("hellow");
		MathRun run = new MathRun();
		
		System.out.println(run);
		System.out.println(str1);
		System.out.println(str2.toString());
		// 1.String클래스의 toString()의 경우
		// 실제 담겨있는 문자열 값을 반환하게끔 오버라이딩
		
		MathRun run2 = new MathRun();
		System.out.println(run.equals(run2));
		System.out.println(str1.equals(str2));
		// 2. String클래스의 equals()의 경우
		// 실제 담겨있는 문자열 값을 비교하게끔 오버라이딩
		
		// hashCode() 
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		// System.out.println("hello").hashCode());
		// 3. 주소값을 해싱하는게 아니라 실제 담긴 문자열 값을 기반으로 해싱을 돌리도록 오버라이딩
		
		System.out.println(str1 == str2);
	}
	
	public void method2() {
		String str1 = "hello";
		String str2 =" hello";
		// toString
		System.out.println(str1);
		System.out.println(str2);
		// equals()
		System.out.println(str1.equals(str2));
		// hashCode()
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str1 == str2);
				
	}
	
	public void method3() {
		String str1 = new String("hellow"); // 절대 금지 문법
		String str2 =" hello"; //( 사용 )
		
		// 문자열 리터럴은 대입연산자를 써서 대입할 때
		// String Pool(heap) 영역에 등록됨
		// String Pool : 동일한 내용의 문자열이 존재할 수 없음
		String str3  = str2;
		System.out.println(str2);
	    str2 +="";
	    System.out.println(str2);
	}

	 /*  public void method4() {
	    	String str = " Hellow " + " Woeld"; //사용 x
	        StrinBuffer sb = new StrinBuffer();
	        // 문자열 임시 저장공간
	        // 문자열으 불변 객체기 때문에 내용물 변경이 일어나면 새로운 공간을 계속해서 항당해서 메모리에 올림
	        // 이를 해결하기 위해 임시공간을 준비해서 입시공간(Buffer)에 쌀아다 처리하는 클래스
	    	sb.append("Hello");
	    	sb.append("World");
	    	System.out.println(sb);
	    	
	    	StringBuilder builder = new StringBuilder();
	    	builder.append("Hello");
	    	builder.append("World");
	    	System.out.println(builder);
	  	// 동시제어(Thread-safe)
	    	// Tomcat, Jetty
	    	// 내가 직접 동시성제어 구현하겠다 아니면 Builder
	    
    
          public void method5() {
        	  String str1 = " 이 또한 지나가리 ";
        	  //1. 문자열.length() : int
        	  // 문자열의 길이를 반환
        	  System.out.println*"str1의 길이 : " str1.length();
        	  
        	  Scanner sc = new Scanner(system.in);
        	  Systen.out.print("아이디를 입력하세요 >");
        	  String userId = sc.nextLine();
        	  String userId = "dasedfgr";
        	  
        	  // 아이디를 8자~15자이내로 적어주세요
        	  if(8 <= userId.length() && userId.length() <= 15);
        	   throw new RuntimeException("아이디 글자수");
		
	
	 // 2.문자열.charAt(index);
	
		char ch = strl.chatAt(0);
		System.out.println(ch);
		
		// 3. 문자열.substring(int) : String
		System.out.println(str1.substring(5));
		System.out.println(str1.substring(5,7));// 오버로딩: 한개의 클래스 내부에서 동행한 기술로 다양한 클래스를 구현하는 기법
		
		// 4.문자열.indexOf(String) : int
		// Systrm.out.println(str1.indexOf("한));
		  String[] emails = {"hong@naver.com", " kim@kh.com", "lee@gooogle.com", hahahoho@kh,com"
		  System.out.println(emails[0].substring(0,4));
		  System.out.println(wmails[1].substring(0,3);
		  
		  System.out.println(emails3].substring(0, emails[3].substring(0, emails[3].indexOf("0")));
		  System.out.println(e,e.indexOf("@")));
		  
		  
		
	
}*/
		
	
}


