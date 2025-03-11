package com.yedam.variable;

import java.util.Scanner;

// 사용자 입력값 읽어드리는 방식.
//Scanner class.
public class VarExe3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("이름을 입력하세요>");
		String name = scn.nextLine(); //메소드 (함수)
		
		System.out.print("점수 입력하세요>");
		int score = scn.nextInt(); //메소드 (함수)
		
		System.out.print("키 입력하세요>");
		double height = scn.nextDouble(); //메소드 (함수)
		
		System.out.println("입력한 값:"+name
				+",점수 :"+score
				+",키:"+height);
	}

}
