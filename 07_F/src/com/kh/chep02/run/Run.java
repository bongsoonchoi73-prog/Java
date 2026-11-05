package com.kh.chep02.run;

import com.kh.chep02.model.info.*;
import com.kh.chep02.model.dto.Main;
import com.kh.chep02.model.dto.Salad;
import com.kh.chep02.model.factory.CookFactory;
import com.kh.chep02.model.info.JjamBbong;

public class Run {
	public static void main(String[] args) {

       Main m = new Main(" 조규철");
       m.cooking();
       
       
       
       Salad s = new Salad("이승철");
       s.cooking();
       
      // Cook c = new Cook("요리사);")
    	
}
	// 추상화란 => 요구사항들 중에서 공통점을 찾고, 공통점에서 필요없는 것 제거
	// 정보은닉
	
	//JjamBbong jb = new JjamBbong();
	//jb.makeJjamBbong();
	
	//Jajang jj = new Jajang();
	//jj.makeJajsng();
	
	//Fried f = new FriedRice();
	//f.fried();
	//CookFactory cf = new CookFactroy(); 1.교체와 변경이 쉬워짐
	//Fried f = cf.creatrRice(); 2.또 더룬 Fired타입을 추가도 쉬워짐
	//f.fried(); // cookFactory를 거치면 모두 다 같은 Fired 취급
	
	// 다형성 : 부모타입으로 상속받은 다양한 자식 객체를 다를 수 있는 기술
	// 의존성주입할 때 처음부터 다시 설명해드림
	// => 정보은닉을 통한 유연성 확보
	/*
	 * 1. 코드의 수정이 쉬움
	 * 2. 기능의 추가가 쉬움
	 * 3. 기능의 교체도 쉬움
	 * 
	 */
}