package com.yedam.inheritance;
/*
 * 친구1: 이름 ,연락처
 */
public class Friend1 extends Object{
	
	private String name;
	private String tel;
	
	public Friend1() {
		//getter,setter
	}
	public Friend1(String name,String tel) {
		this.name=name;
		this.tel=tel;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "이름은"+getName()+",연락처는"+getTel();
	}

	public String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
}
