package com.kh.khworld.run;

public class Run {// alt + shift + J

	public static void main(String[] args) {
		
		// MVC(Model - View - Controller)
		// 소프트웨어를 개발할 때 구조를 세 가지 요소로 분리하자
		// 라는 소프트웨어 개발방법론 / 디자인 패턴
		
		// 1.Mpdel => 데이터 담당
		// VO => 값을 담당
		// DAO -> 외부매체와의 상호작용
		// DTO => 레이어간 데이터 전송
		// Service => 비즈니스로직
		// Entity => 테이블과 매핑
		// Domain => VO + Serice
		
		// 2. View => 사용자 인터페이스 담당
		// 사용자에게 정보 표시 / 입력값을 받음
		// 모델에서 민들어진 데이터를 시각적으로 표현(프레젠테이션 로직)
		
		// 3.Controller 
		// Model하고 View의 중간다리
		// 사용자가 View에서 입력한 값을 Model에 전달
		// Model에서 일어난 처리 결과를 View로 반환
		
		// CRUD 구현
	}

}
