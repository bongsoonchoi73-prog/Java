package com.kh.chap08.view;

import java.util.Scanner;

import com.kh.chap08.controller.FruitController;
import com.kh.chap08.model.dto.Fruit;

public class FruitView { // 화면의 입출력을 담당
 
	 // 프로그램 시작 시 메인메뉴 출력 메소드
	public void mainMenu() {
		private Scanner sc = new Scanner(String.in);
		private FruitController fc = new FruitController();
		
		while(true) {
			System.out.println("과수원 관리 프로그램입니다");
			System.out.println("1. 과일심기");
			System.out.println("2. 과일정보확인하기");
			System.out.println("3. 비료주기");
			System.out.println("4. 과일수확하기");
			System.out.println("5. 프로그램 종료하기");
			System.out.println("원하시는 메뉴를 선택해주세요 > ");
			int menuNo = sc.nextInt();
			sc.nextLine();
			
			switch(menuNo) {
			case 1 : saveFruit(); break;
			case 2 : findFruit(); break;
			case 3 : fertilize(); break;
			case 4 : harvest(); break;
			case 5 : System.out.println("프로그램을 종료합니다"); return;
			default: System.out.println("없는 명령어를 선택했습니다");
			}

		}
		
	}
	//과일을 심을 수 있는 화면을 출력해주는 기능
	private void saveFruit() {
		
		// 과일이 이미 존재하는가?
		if(fc.findFruit() != null) {
			System.out.println("과일이 이미 존재합니다");
			System.out.println("먼저 과일을 재배해주세요");
			return;
		}
		System.out.println("과일 명을 입력하시요 > ");
		String name = sc.nextLine();
		System.out.println("품종을 입력하시요 > ");
		String species = sc.nextLine();

	}
	//과일의 정보를 출력해주는 기능
	private Fruit findFruit() {
		Fruit fruit = fc.findFruit();
		if(fruit != null) {
			String info = fruit.info();
			System.out.println(info);
		} else {
			System.out.println("아직 심은 과일이 없어요");
			System.out.println("과일을 먼저 심어보세요");
		}
		private void fertilize() {
			
		}
	}
	private void harvest() {
		
		// 기획 => 뭘 만들지
		// 설계 => 어떻게 만들지
		if(fc.findFruit() != null) {
			//수학 할래요?
			System.out.println("정말 수확을 하고 싶으신가요?");
			findFruit();
			System.out.print("수확을 원하신다면 수확하기를 입력하세요 > ");
			String answer = sc.nextLine();
			
			if(answer.equals("수확하기")) {
				fc.harvest();
				
			}else {
				System.out.println("메인 메뉴로 돌아갑니다.");
				
			}
		}else {
			System.out.println("아직 과일이 존재하지 않습니다");
			System.out.println("과일을 먼저 심어보세요");
		}
		
	}
}
