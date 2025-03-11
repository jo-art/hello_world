package com.yedam.variable;

public class Member { //public : 공용, 다른 클래스에서 접근가능 vs private :개인 , 다른 클래스에서 접근 못하도록 숨김 접근제어자
	//클래스 : 필드(값을 저장)
	private String name;
	private int score;
	
	//클래스 : 생성자(실체 생성)
	//컴파일러 기본생성자 생성.
	//생성자 오버로딩
	public Member() {
		// 기본 생성자는 반드시 정의해야함
	} 
	public Member(String name, int score) {
		this.name = name;
		this.score =score;
	}
	//생성자 자체가 인스턴스를 생성함
	
	//클래스 : 메소드(기능) = 반환값 메소드명(매개값)
	public void showInfo() { //반환되는 값이 없을 때 void
		System.out.println("이름은 "+ name +", 점수는"+ score);
		
	}
	public void setMember(String name, int score) {
		
		this.name = name;
		this.score=score;
		
	}
	public  String getName() {
		 return name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		if(score<0 || score>100) {
			System.out.println("적정값을 입력하세요.");
			return; // 메소드 안 리턴은 메소드를 종료시키는 것.
		}
		this.score=score;
		  
	}
}
