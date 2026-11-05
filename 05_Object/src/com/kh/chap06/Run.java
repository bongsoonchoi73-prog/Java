package com.kh.chap06;

import com.kh.chap06.controller.MethodController;

public class Run {

	public static void main(String[] args) {
		
	    MethodController m1 = new MethodController();
	    
	    // 학습방법 => 소리 내어 읽기
	    
	    int a = m1.add(2, 3);
        int b = m1.add(3, 5);
	    System.out.println(a);
	}
	public int fn(int num) {
		return num * 2;
	
	}
	public String retrunStr() {
		return "반환값";
	}
	
		
	}

