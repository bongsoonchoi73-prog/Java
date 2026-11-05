package com.kh.chap01.abstraction.run;

import java.util.Scanner;
import com.kh.chap01.abstraction.model.vo.Character;

public class MapleStory {
	
	public static void mine(String[] args) {
		 
		//System.out.println("메이플 스토리");
		//System.out.println(" 캐릭터 명 : " + c.nickname);

		Character c =  new Character();
		Scanner sc = new Scanner(System.in);
		// c.nickname = "ㅇㅇ";
		
		System.out.println(" 캐릭터의 닉네임을 입력 > ");
		c.nickname = sc.nextLine();
		System.out.print("캐릭터 직업 입력 > ");
		c.job = sc.nextLine();
		System.out.print("헤어스타일 입력 > ");
		c.hairStyle = sc.nextLine();
		
		while(true) {
			System.out.println();
			System.out.println(c.nickname +"의 정보");
			System.out.println("직업 : " + c.job);
			System.out.println("헤어스타일 :" + c.hairStyle);
			System.out.println("레벨 : " + c.level);
			System.out.println();
			
			System.out.println("메뉴 선택 > ");
			System.out.print("1.때리기 / 2. 점프하기 / 3. 프로그램 종료 > ");
			int menuNo = sc.nextInt();
			// sc.nextLine();
			
			switch(menuNo) {
				case 1 : c.attack(); break;
				case 2 : c.jump(); break;
				case 3 : return;
			
			}
		}
	}   

} 
