package com.yedam.ref;

import java.awt.Color;

public class ArrayExe3Calender {
	
	public static int getFirstDay(int month) {
		switch(month) {
		case 1:
			return 3;
		case 2:
			return 6;
		
		case 3:
			return 6;
		case 4:
			return 2;	
		default :
			return 1;
		}
	}
	//2025년 기준으로 월의 마지막날 반환.
	public static int getLastDay(int month) {
		int date =31; // 기본값 31 1,3,5,7,8,10,12월
		switch(month) {
		case 2:
			date=28;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			date=30;
		}
		return date;
	}
	

	public static void main(String[] args) {
		//2025년 기준 월정보 => 1일의 위치를 반환하는 메소드
		
		// TODO Auto-generated method stub
		//3월 1~31 달력 콘솔 출력 (print: 옆으로 쭉 출력 vs println : 줄바꿈 )
		String[] days= {"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
		for(String day:days) {
			if (day.equals("Sun")  ) {
                System.out.print("\u001B[31m " + day + "\u001B[0m"); // 빨간색
            } 
			else {
                System.out.print(" " + day);
            }
			
		}
		System.out.println();// 줄바꿈
		int month=3;
		//3월 1일이 토요일
		int space = getFirstDay(month); //1일의 위치 값
		int lastDate =getLastDay(month);// 말일의 값
		for(int i=0;i<space;i++) { // 공백갯수만큼 빈칸.
			System.out.print("    ");
		}
		//날짜 출력."1"-> 1:Integer.parseInt()
		for(int d=1; d<=lastDate;d++) {
			
			if (month == 3 && d == 21) {
		        System.out.print(" 테스트"); // 자리 맞추기 위해 공백 추가
		    } else if(String.valueOf(d).length()==1) {// 1 --->"1" String.valueOf()
		    	  System.out.print("   " + d); // 숫자를 문자값으로 변환한 길이가 1인 경우 공백 세번 넣기
			}else if(String.valueOf(d).length()==2) {
				 System.out.print("  " + d);// 숫자를 문자값으로 변환한 길이가 2인 경우 공백 두번 넣기
			}
			
			if((space+d)%7==0) {//7일이 지나면 줄바꿈
				
				System.out.println(" ");
			}
		
		}
		
		
		
	}

}
