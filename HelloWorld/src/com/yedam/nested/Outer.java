package com.yedam.nested;

public class Outer {
	class InnerClass{ //중첩 클래스
		String name;
		void innerMethod() {
			System.out.println("중첩 클래스 내 메소드호출");
		}
		
	}
	// 메소드
	void method1() {
		InnerClass inner = new InnerClass();
		inner.name="홍길동";
		System.out.println(inner.name);
	}
	
}
