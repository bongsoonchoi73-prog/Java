package com.kh.chap01.abstraction.model.vo;

public class Character {
	
	public String nickname;
	public int level;
	public String  job;
	public String hairStyle;
	
	public void jump() {
		System.out.println(nickname + " 이(가) 점프합니다");
		level--;
	}
	public void attack() {
		System.out.println(nickname + "이(가)공격합니다");
		
	}
    
}
