package com.kh.suvway.model.run;

import java.util.ArrayList;
import java.util.List;

import com.kh.suvway.model.dto.Sandwich;

public class Run {

	public static void main(String[] args) {
		
		List<Sandwich> bin = List.of(
                                        new Sandwich("램", 8000, "양고기")
                                      , new Sandwich("에그마요", 5000, "달걀")
                                      , new Sandwich("스파이시 쉬림프", 7500," 쉬림프")
                                      , new Sandwich("폴드포크 바베큐", 7000, "돼지고기")
                                      , new Sandwich("스파이시 이탈리안", 6500, " 페퍼로니")
                                      , new Sandwich("스테이크 $ 치즈", 8000, "소고기")
                                      );
	}
/*ndwichFiler beefFilter = s -> s.getMaterial().contains("소고기");
	
	for(Sandwich s : bin) {
		if(beefFiler.test(s)) {
			System.out.println(s.getName());
		}
	}
   Sndwichfilter expensiveFilter = s -> s.getPrice() >= 7500;
	for(Sandwich s :bin) {
		if(expensiveFilter.test(s)) {
			System.out.println(s.getName());
		}
	}
     predicate<Sndwich> isPork = s -> s.getMaterial(). equals("돼지고기");
    for(Sandwich s : bin) {
    	 if(isPork.test(s)) {
    		 System.out.println(s.getName());
    	 }
     } */
	
}
