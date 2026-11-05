package com.kh.condition;

import com.kh.condition.ConditionIf;
import java.util.Scanner;

public class ConditionIf {

	/*
	 * if(조건식) {
	 *      조건식이 참일 경우 실행하고자 하는 코드;
	 * }
	 * 
	 * => 조건식의 결과값이 false일 경우 : if문 scope({}) 를 건너뜀
	 * => 조건식의 결과값이 true일 경우 : if 문 scope({}) 안의 코드가 수행
	 */
	public void merhod0() {
		System.out.println("메소드를 불러보세요~ 시작!");
		
		ConditionIf c = new ConditionIf();
		c.merhod0();
		/*
		if(false) {
			System.out.println("나는 if문이다");
		}
		*/
		
		if(true) {
			System.out.println("세상만사 문제없음");
		} 
		if(false) {
			System.out.println("세상만사 문제있음 ");
	  }
	}
	public void quiz() {
		
		int count = 0;// 정답 개수를 저장 할 용도의 변수
		int wrongCount = 0; // 오답을 저장 할 용도
		
		System.out.println("잼컨만들기;");
		//문제 출력한 뒤
		// 사용자에게 ㅇ 또는 x를 입력받아서
		// 정답입니다 또는 오답 출력 퀴즈
		
		System.out.println("----------------------");
		System.out.println("문제 : 토마토는 과일일까요? ");
		
		Scanner sc = new Scanner (System.in);
		System.out.print("정답을 ㅇ 또는 x로 입력하세요 > ");
		
	    char answer = sc.next().charAt(0);
	    if(answer == 'x' || answer == 'x') {
	    }
	    /*
	    // x를 입력했을 때 정답입니다
	    if(값, 연산) {
	    	
	    }
	    */
	    // ㅇ를 입력했을 때 오답입니다
        // 킹우의 수
	    // => x,X,o,O
	    // 0~9,특수문자,한자
	    if((answer != 'X') && ( answer != 'x') && ( answer != 'O') && ( answer != 'o')); {
	    	System.out.println("O 또는 X를 입력하세요");
	    }
	    
	    System.out.println("문제 : 기린은 서서 잠을 잔다.");
	    System.out.println("정답을 o/x로 입략해주세요 > ");
	    answer = sc.nextLine().charAt(0);
	    
	    if(answer == 'O' || answer == 'o') {
	    	System.out.println("정답이에용");
	         count++;
	    } 
	    if(answer == 'X' || answer == 'x'){
	    	System.out.println("오답이에용");
	    	wrongCount++;
	    }
	    if(!(answer=='O'||answer == 'o' || answer == 'X' || answer == 'x')){
	    	System.out.println("O 또는 X를 입력하세요");
	    	
	    
	    }
	    
	    //두 문제
	    //문제 풀이 후 정답, 오답 개 수출력
	    System.out.println("퀴즈 끝");
	    System.out.println("정답 : ?개");
	    System.out.println("오답 : ?개");
	    
	    //1.숙제 
	    //오늘의 퀴즈쇼 총 3개 더 추가하기
	    
	    
	    
	    }
}
