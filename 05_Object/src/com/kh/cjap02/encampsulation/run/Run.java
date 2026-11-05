package com.kh.cjap02.encampsulation.run;

public class Run {

	private static Object cp;
	private static String size;

	public static void main(String[] args) {
	     //CellPhone클래스 이용해서 객체 생성 = > 메모리(heep)에 적제
          //CellPhone cp = new CellPhone();
         // cp.hi();
         // new CelllPone().hi();
         //자바에서 변수 공간에 대입 할 수 있는 값의 종류 10가지
         // 기본 자료형 8개
         // 참조 자료형 null 값, 주소값
         // System.out.println(co.prodctName);
          //cp.productName =" 아이폰 pro";
	      //cp.name ="ㅎㅎ"
	      //System.out.println(co.saiz);
	  
	      //캡슐화(encampsulation)*******************************
          // 접근제한자를 public -> privte바꿈
	      // 접근제한자 불가능
	      // 속성(데이터)과 해당 데이터를 조작하는 행동(메소드)를 하나 단위로 묶는 것
		  
		  // 클래스 내부 숨기기 => 정보은닉
	
	      //cp.setSize(4.0); //size 필드의 값을 세팅
	      //argument
	      //System.out.println(xp.size);
	      //cp.getSize();
     
		

         
			//String name = cp.getProductName();
            //String color = cp.getColor();
            //String np = cp,getNetworkProvider();
            
            //System.out.println("스마트폰 = [제품명 : " + name
            		       //  + ", 색상 : " + color
		                   //+ ", 사이즈 : " + size + "인치"
            		       //+ " + 통신사 : " + np + "]");
    }  
	/*             ****************************************************
	 * accesssModifier(접근제한자 / 접근제어자)
	 * 
	 * public => 어디서든 접근 가능(같운다른 페키지,클래스 외부/ 내부)
	 * 
	 * protected => 같은 페키지라면 무조건 접근 가능
	 *           => 다른 페키지라면 상속구조인 클래스로만 가능
	 *           => 상속은 chep07에서 배울 것.
	 * default => (package friendly) 나랑 같은 패키지에서만 접급 가능
	 * 
	 * private => 오직 클래스 내부
	 *
	 * 
	 */
}