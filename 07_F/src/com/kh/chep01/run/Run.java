package com.kh.chep01.run;

import com.kh.chep01.Child1;
import com.kh.chep01.Parent;

public class Run {

	public static void main(String[] args) {
		
		Parent p =  new Parent();
		//p.PrintParent();
		
		//Child1 c1 = (Parent)new Child1();
		//c1.printChild();
	//	c1.printParent();
		
		Child1 p2 = new Child1();
		
		 p2.printParent();
		//p2.printChild();
		// 상속이란?
		 
		 // 필드 / 메소드 => 안중요함
		 // 상속을 통해 부모클래스로부터 상속받을 수 있는 가장 중요한 것은?
		 // = > 타입 (자료형)
		// ((Child1)p2).printChild();
		 /*
		  *  상속 구조일 때만 가능
		  * 1.UpCasting
		  * 2.DownCasting
		  * 
		  */
		 //Parent p3 = new string();
	}
	
	// 취업준비
	//

}
