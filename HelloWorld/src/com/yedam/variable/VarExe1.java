package com.yedam.variable;

//관례: 클래스의 이름은 대문자로 시작.
public class VarExe1 {
	//연산은 두 변수의 유형(데이터 타입)이 항상 동일...+,*,/,%
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1 =90;
		int number2=80;
		 number1 =71;
		int sum=number1+number2;
		
		System.out.println("두 점수의 합은"+sum+"입니다");
		
		double avg =(double)sum /  2.0; //자동 형변환
		System.out.println("두 점수의 평균 점수는 "+avg+"입니다");
		
	}

}
