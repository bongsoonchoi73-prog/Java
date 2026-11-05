package com.kh.chap04.view;

import com.kh.chap04.controller.FieldController;

public class FieldView {
	
	public void check() {
		
		FieldController fc = new FieldController();
		// 1.자료형을 fc라는 식별자를 가진 지역변수 선언
		// 2. 객체 생성(new라는 키워드를 만났을 때) -> global 멤버변수 항당
		// 3. 생성된 객체의 주소값을 대입
		System.out.println(fc.global);
		
		//System.our.peintln(fc.local);
		
		fc.checkVariable(10); // checkVaariable호출 => parameter(매개변수) 초기화
		// 호출 종료 => parameter, local 지역변수 소멸
		
		System.out.println(fc.global);
		fc = null;
	    System.out.println(fc.global);
	    
	    System.out.println(fc.str);
	}

}
