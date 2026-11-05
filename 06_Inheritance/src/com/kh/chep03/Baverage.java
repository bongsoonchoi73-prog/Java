package com.kh.chep03;

public class Baverage { // <- 부모클래스
  private String name;
  private String volume;
  private String color;
  
  
  public Baverage() {}
  public Baverage(String name, String volume, String color) {
	super();
	this.name = name;
	this.volume = volume;
	this.color = color;
	
  }
  public String getName() {
	return name;
  }
  public void setName(String name) {
	this.name = name;
  }
  public String getVolume() {
	return volume;
  }
  public void setVolume(String volume) {
	this.volume = volume;
  }
  public String getColor() {
	return color;
  }
  public void setColor(String color) {
	this.color = color;
  }
  public String info() {
	  return "음료의 정보 = 이름" + name
			 +" 용량" + volume
			 +" 색깔 "+ color;
  }
   public String toString() {
		  return "하이";
	  }
   public String toString1 () {
		  return "음료의 정보 = 이름" + name
				 +" 용량" + volume
				 +" 색깔 "+ color;
  }
}
