package com.kh.chep02.run;

import com.kh.chep02.model.dto.Beacelet;
import com.kh.chep02.model.dto.PrinceGoldCrown;
import com.kh.chep02.model.dto.SwedenGoldCrown;

public class Run {

	public static void main(String[] args) {
		PrinceGoldCrown pgc = new PrinceGoldCrown();
		pgc.setName("금관총 금관"); //heap 공간에  'Name' 필드가 있어야함
		System.out.println(pgc.getName());
		
		SwedenGoldCrown sgc = new SwedenGoldCrown("금총관 금관", 8.0 , 80);
		System.out.println(sgc.info());
		
		Beacelet b = new Beacelet(" 팔찌" ,120.0, 12.0);
		System.out.println(b.info());
	}
	/*
	 * 상속
	 * 
	 * - 중복이 발생하는 부분을 공토의 클래스로 뽑아서 관리
	 * => 코드를 적게 쓰고 새 클래스를 만들 수 있음 => 생산성이 향상, 가독성 향상
	 * 
	 * 단점 : 객체간의 결합도가 높아짐
	 * 
	 * 오눌날은 상속보다 합성(Compsition)을 통해 구현하는 것을 권장
	 * 
	 *  상속의 특징
	 *  
	 *  - 자바는 클래스간의 다중상속을 지원하지 않음(단일 상속만 가능)
	 *  - 명시되어있지는 않지만 자바의 모든 클래스는 object라는 클래스의 후손 클래스
	 *  
	 *  => 모든 객체는 object에 존재하는 멤버를 사용할 수 있음
	 *  => object클래스에 존재하는 메소드가 맘에 들지 않을 시 메소드를 재정
	 * 
	 */

}
