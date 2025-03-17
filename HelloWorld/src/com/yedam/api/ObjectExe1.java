package com.yedam.api;

class Member{
	String name;
	int age;
	
	 Member() {}
	Member(String name,int age){
		this.name=name;
		this.age=age;
	}
	@Override
	public boolean equals(Object obj) {
		//비교 대상(매개값 )Member 타입.
		if(obj instanceof Member) {
			Member target =(Member) obj;
			return this.name.equals(target.name)&& this.age ==target.age;
		}
		return false;
	}
	
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return age;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "이름:" +name+",나이:"+age;
	}
}
public class ObjectExe1 {
	public static void main(String[] args) {
		
		
		Object obj1 = new Object(); //물리적 위치
		Object obj2 = new Object();
		//비교
		System.out.println(obj1 == obj2);
		//논리적비교
		System.out.println(obj1.equals(obj2));
		
		Member m1 = new Member();
		Member m2 = new Member();
		m1.name="홍길동";
		m1.age=20;
		m2.name="홍길동";
		m2.age=19;
		System.out.println(m1==m2);
		System.out.println(m1.equals(m2));
		//비교
		
	}
}
