package com.kh.suvway.model.service;

import com.kh.suvway.model.dto.Sandwich;

@FunctionalInterface // 함수형이고 람다를 쓸 용도
	public interface SndwichFilter{
		boolean test(Sandwich s);
		// void aaa();
	}


