package com.kh.chap05.model.dto;

public class Member {
	// 필드
	private String userId;
	private String userPwd;
	private String nickName;
	private Object setUserId;
	
	// 생성자
	// 생성자(Constructor) : 객체 생성 시 초기화를 담당하는 요소
	/*
	 * 생성자 두 가지 관점
	 * 
	 * 기술 : 객체가 생성될 때 어떤 상태로 시작을 해야하는가?
	 * 개념 : 객체가 생성이 될꺼면 처음부터 유효해야 하는?
	 */
	//메소드
	
	public void setUserId(String uerId) {
		System.out.println(uerId);
	}
	public void setUserPwd(String userPwd) {
		System.out.println(userPwd);
	}
	public void srtUsernickName(String vickName) {
		System.out.println(vickName);
	}
	public char[] info() {
		// TODO Auto-generated method stub
		return null;
	}// 기본생성자(매개변수가 존재하지 않음)
	 // 클래스 내부에 생성자가 하나도 없으면 기본생성자를 자동으로 만들어줌
	
	/*
	 * 접근제한자 클래스식별자() {
	 * 
	 * }
	 */
      //public Member() {
	//	System.out.println("기본 생성자 호출");
	
	//}
//	public Member(userId) {
//		System.out.println("아이디 값 초기화");
//	}

	public Member(String userId, String userPwd){
		
		this.setUserId = userId;
		this.userPwd = userPwd;
		
	}
    /*
     * 1.생성자는 반드시 클래스 명과 동ㅇㄹ해야함(대/소분자)
     * 2.변환형이 존재해선 안됨
     * 3.매개변수생선자를 명시적으로 작성하면 기본생성자를 만들어주지 않음
     * 4.
     */

}