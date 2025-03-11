package com.yedam.variable;

import java.util.Scanner;

public class VarExe6 {
	public static void test() {
		//임의의 정수 1~50까지 임의의 값		
		
		 // 0<= x <1 실수 값// 1<=x<51
		// 학생의 점수 (30~100)	
		// 정수(int)--->5개 저장
		int [] num = new int[500]; // 배열 선언
		
		for(int i=0;i<num.length;i++) { 
			num[i]=(int)(Math.random()*71)+30;				 
			if(num[i]==100) { //나머지가 1인 경우 // 홀수의 값 출력
				System.out.println(i+"번째 값:"+num[i]);
			}
			
		}
		
	}// end of test()
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m1 =new Member();// member 인스턴스 생성
		m1.setName("조정민") ;
		System.out.println(m1.getScore());
		Member m2 =new Member();// member 인스턴스 생성
		m2.setName("최민수");
		Member m3 =new Member();// member 인스턴스 생성
		m3.setName("김병수");
		Member m4 =new Member();// member 인스턴스 생성
		m4.setName ("박인만");

		
		// 70~100사이의 임의 값을 점수 지정
		
		//점수가 가장 높은 사람의 이름을 출력
		
		// 베얄
		
		Member[] members = {m1,m2,m3,m4};
		for(int i=0; i<members.length;i++) {
			int score=(int)(Math.random()*31)+70;
			members[i].setScore(score);
			
		}
		// 조회 이름을 입력 -> 점수 출력
		Scanner scn = new Scanner(System.in);
		System.out.println("조회할 이름 입력>>");
		String search = scn.nextLine();
		// for 반복문 활용.member[i].name.equals(search)	
		for(int i=0;i<members.length;i++) {
			if(members[i].getName().equals(search)) {
				System.out.println("학생 점수는"+members[i].getScore());
			}
		}
		
//		// 점수 출력
//	    for (int i = 0; i < members.length; i++) {
//            System.out.println(members[i].name + "," + members[i].score);
//        }
//			
//	    int max = members[0].score;
//		String name=members[0].name;
//		for(int i=1; i<members.length;i++) {
//			
//			if(max<members[i].score) {
//				max=members[i].score;
//				name=members[i].name;
//			} 	
//		}
//		System.out.println("최고 점수"+name);
//		
			
		
			
	}// end of main()

}// class
