package com.yedam.nested;

public class MainExe {
	public static void main(String[] args) {
	Outer outer = new Outer();
	outer.method1();
	
	//Inner 클래스의 타입.
	Outer.InnerClass inner = outer.new InnerClass();
	inner.innerMethod();
	
	}
	
}
