package com.yedam.classes;

public class MethodExe5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//상수 선언
		int num1=10;
		num1=20;
		
		final int num2=20;
		num2=30; //상수는 변경 불가능

		final Product p1 = new Product();
		p1.setProductCode("A001");
		
		p1.setProductCode("B001");
		p1 =new Product();// 상수 .새로운 객체 재선언 X
	}

}
