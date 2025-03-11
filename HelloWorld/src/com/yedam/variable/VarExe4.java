package com.yedam.variable;

import java.util.Scanner;

public class VarExe4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = new int[3]; // 정수 3개 공간을 담을 수 있는 크기를 가지고 있는 배열이 선언 {0,0,0}
		
		//사용자에게 점숙를 입력하세요.
		int sum=0;
		double avg=0.0;
		for(int i=0;i <scores.length;i++) {
			Scanner scn = new Scanner(System.in);
			System.out.print("점수를 입력하세요>");
			
			int score = scn.nextInt(); //메소드 (함수)
			scores[i]= score;
			sum = sum+scores[i];
			
		} avg = sum*1.0 /scores.length;
		System.out.print("합은"+sum +"입니다.");
		System.out.print("평균은"+ avg+"입니다.");	
	}

}
