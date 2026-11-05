package com.kh.cjap02.encampsulation.model;

//필드부,생성자부,메소드부
public class CellPhone { // 스마트폰 정보 저장 클래스
	// 필드(Field)부
	/*
	 * 값을 담는 공간
	 * 
	 * 필드 == 멤버 변수
	 * 
	 * 객체들이 가져야할 공통적인 속성을 기술해 놓는 영역
	 */
	// 스마트폰 == 제품명 , 통신사, 사이즈 ,색상
	public String productName;
	public String networkprovider;
	public double size;
	public String color;

	// public void hi() {
	// System.out.println("날 불렀니?");

	// 객체의 속성 값을 기록 및 수정하는 기능의 메소드 : setter()
	// vo-> DTO( Data Transfer Object)
	// setter = 외부에서 접근 가능햐여하기 때문에 접근제한자를 public을 사용
	// set필드명으로 식벽자를 작성하며 낟타봉표기법(camelCase)를 꼭 지키도록한다
	public void setSize(double size) {
		// Parameter, 매개변수
		// 매개변수 메소드 호출 시 초기화가 강제됨
		// System.out.println(size);
		// System.out.println("setsize 35행 : " + this);
		// this 키워드 객체 내부 주소 가르킴
		// size = size;
		// Scope안에서는
		// 해당 영역안에 잇는 지역변수가
		// 식별자 우선권 가짐
		this.size = size;
		// 메소드를 반환해주는 기능의 메소드 getter() -> 중요
		/*
		 * 1.getter는 접근제한자 public 사용 2.get필드명으로 식별자를 작성하되, 낙타봉 표기법을 사용함 3.만들기
		 * 
		 */
		// 메소드 호출 후 Size필드 값을 돌려주고 싶음
	}

	public double getSize() { // 'void' 반환형 자리
		return size;
	}
	// productName필드를 기록
	// 접근제한자 - public ,?
	// 값을 받을 시 메개가 생성되어야함

	public void setProductName(String productName) {
		this.productName = productName;
	}

	/*
	 * 관례 위반 : 두 개 이상의 필드값을 변경하는 메소드의 시작이 set을 시작해선 안됨
	 */
	public void setColorAndNetworkProvidwe(String color, String abc) {

		this.color = color;
		this.networkprovider = networkprovider;
	}

	// 하나의 메소드의 값을 기록 및 수정할 수 있는 메소드
	public void setColor(String col) {
		this.color = color;
	}//networkprovider 값 기록 및 수정 메소드 만들기
	public void networkprovider(String provider) {
		this.networkprovider = networkprovider;
	}
	//productName, color, networkProvider
	public String getProductName() {
		return productName;	
	}
	public String getColor() {
		return color;
	}
	public String getNetworkProvider() {
		return networkprovider;
	}
}
