package com.yedam.api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date today = new Date();
		System.out.println(today.toString());
		
		
		//출력 포맷 지정
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String Formatstr =sdf.format(today);
		System.out.println(Formatstr);
		
		try {
			Date tday = sdf.parse("2000-01-01 10:00:00"); //문자 -> date 객체.생성해주는 메소드 :parse
			System.out.println(tday);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
