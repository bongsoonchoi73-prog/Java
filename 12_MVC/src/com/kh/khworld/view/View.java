package com.kh.khworld.view;

import java.util.Scanner;

import com.kh.khworld.controller.Controller;

//시각적인 부분 입/ 출력
	// HTML, CSS 이런걸 안배움

public class View {
	private Scanner sc = new Scanner(System.in);
	private Controller c = new Controller();
	
	public void mainMenu() {
		while(true) {
			System.out.println();
			System.out.println("놀이기구 관리 프로그램");
			System.out.println(" 1. 놀이기구 전체 조회");
			System.out.println(" 2.놀이기구 추가");
			System.out.println(" 0.프로그램 종료");
			System.out.println();
			System.out.print("사용하실 메뉴번호를 입력해주세요");
					int menu = 0;
					
				
		}
	}

}
