package com.kh.chep02.model.dto;

public class Salad extends Cook{
     public Salad(String name) {
    	  super(name);
     }
     @Override
     public void cooking() {
    	 System.out.println("샐러드를 만들어요");
     }
}
