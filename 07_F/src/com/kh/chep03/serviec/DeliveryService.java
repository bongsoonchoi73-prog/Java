package com.kh.chep03.serviec;

public interface DeliveryService {

	public abstract void delivery();
	
	/*
	 * Interface
	 * 
	 * 구체클래스
	 * 추상클래스
	 * 인테페이스
	 * 
	 * -> 무조건 구현해야 하는 기능이 있을 경우
	 * -> 인터페이스를 설계 사용법만 만들어주고
	 * -> 구현하는 쪽에서 이걸 실체화하게 해줌
	 *  인터페이스는 다중구현 가능
	 */
	// 인터페이스를 구현한 모든 클래스가 동일하게 수행해야하는 메소드는 default키워드를 붙여 구현
}
