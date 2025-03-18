package com.yedam.api;

import java.util.Calendar;

public class CalenderExe {
	public static void main(String[] args ) {
		Calendar cal = Calendar.getInstance(); //2025-03-18
		cal.set(Calendar.YEAR, 2024);
		cal.set(Calendar.MONTH, 1);//2월
		cal.set(Calendar.DATE, 10);
		cal.set(2023, 2,5); //2023년 3월 5일
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)); //1월이 0부터 시작. 
		System.out.println(cal.get(Calendar.DATE));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK)); //요일 일요일 -->1 월 -->2 화 --->3
		System.out.println(cal.getActualMaximum(Calendar.DATE));
		
		//년 월  입력 ==> 1일의 요일 정보 변환 , 말일을 반환 
		getDay(2025,7); //7월달의 1일의 요일알려주는 메소드
		System.out.println(getDay(2025,7));
		getLastDate(2025,7);
		System.out.println(getLastDate(2025,7));
	}
	
	static String getDay(int year,int month) {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month-1,1);
		int day= cal.get(Calendar.DAY_OF_WEEK);
		switch(day){
			case 1:
				return "일요일";

			case 2:
				return "월요일";	
			case 3:
				return "화요일";		
				
			case 4:
				return "수요일";	
			case 5:
				return "목요일";
			case 6:
				return "금요일";
			case 7:
				return "토요일";	
				default:
					return "알수 없음";
					
		}
		
	
	}
	static String getLastDate(int year,int month) {
		Calendar cal = Calendar.getInstance();
		int lastyoil = cal.getActualMaximum(Calendar.DATE);
		return (month+1)+"월의 마지막 요일의 날짜는" +lastyoil+"입니다";
	} //막일
}
