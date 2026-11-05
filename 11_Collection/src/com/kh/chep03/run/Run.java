package com.kh.chep03.run;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.kh.chep03.model.vo.Shop;

public class Run {

	public static void main(String[] args) {
		// HashSet
		// Value값 저장, index개념 없음
		// 중복 x, 순서 보장  X
		List<String> list = new ArrayList();
		System.out.println(list);
		Set<String> set = new HashSet();
		
		set.add("안녕하세요");
		set.add( new String("특징"));
		set.add( new String("반갑습니다"));
		set.add("특징");
		
		System.out.println(set); //중복 x, 순서보장 x
		// 저장소, 특징
		// User lee = new User("황서정");
		// User hong = new User("홍길동");
		// 1번 : 배열, 2번 : 리스트, 3번 : 셋
		
		//요소 개수
		System.out.println(set.size());
		Set<Shop> shops = new HashSet();
		shops.add(new Shop("양춘옥","곰탕",13000));
		
		System.out.println(shops);
	}

}
