package com.yedam.classes;
/*
 * 정적 멤버의 사용
 * 정적메소드에서 인스턴스 메소드 호출불가 /반대는 가능
 * 정보를 담는 것은 : 인스턴스 메소드
 * 기능 : 정적메소드/인스턴스
 */
public class MethodExe4 {
	static void test() {
		System.out.println("인스턴스 메소드");
	
	}
	 static void main() {
		 test();
	}
}
