package com.yedam.bookApp;

import java.util.Scanner;

/*
 * 실행클래스
 */
public class BookApp {
	
	public static void main(String[] args){
//		BookMain mainApp1 = BookMain.getInstance();
//		//mainApp.main(args);
//		BookMain mainApp2 = BookMain.getInstance();
//		
//		mainApp1.add(); //1번에 등록
//		mainApp1.list(); //목록
//		
//		mainApp2.list(); //2번목록
//		
		Scanner scn= new Scanner(System.in);
		BookMain mainApp =BookMain.getInstance();
		System.out.println("아이디 입력>>");
		String userId =scn.nextLine();
		System.out.println("비밀번호 입력>>");
		
		String userpw =scn.nextLine();
		if(mainApp.login(userId, userpw)) {
			mainApp.main(args);
		}else {
			System.out.println("🚨 로그인 실패로 인해 프로그램을 종료합니다.");
		}
		
		// 숙제:
				// 1번) BookMain의 main메소드를 통해서만 기능활용하도록 하세요.
				// User 클래스를 생성하고
				// BookMain에 User[]을 선언해서 회원을 3명 등록하기.
				// BookMain에 login메소드를 선언하고 매개값으로 아이디와 비밀번호를 입력받도록 한다.
				// login메소드는 User[]에 등록된 회원중에서 입력받은 아이디와 비밀번호가 있으면 로그인성공 아니면 실패.
				// login성공 했을 경우에만 1번) main메소드를 실행하도록 한다
	}
	
	
}
