package com.yedam.inheritance;
/*
 *Friend2: friend 상속
 */
public class UnivFriend extends Friend1{
	private String univName;
	private String major;
	
	public UnivFriend() {
		super();
	}
	public UnivFriend(String name,String tel,String univName,String major) {
			super(name,tel); //부모 생성자를 가르키는것
			this.univName=univName;
			this.major=major;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"학교는"+getUnivName() +",전공"+getMajor();
	}
	//부모 메소드 -> 자식이 재정의 오버라이딩
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}
	
//	@Override
//	public void setName(String name) { // 부모 파이널 메소드는 오버라이딩 안됨.
//		// TODO Auto-generated method stub
//		super.setName(name);
//	}

	public String getUnivName() {
		return univName;
	}

	
	public void setUnivName(String univName) {
		this.univName = univName;
	}

	
	public String getMajor() {
		return major;
	}

	
	
	public void setMajor(String major) {
		this.major = major;
	}
	
	
}
