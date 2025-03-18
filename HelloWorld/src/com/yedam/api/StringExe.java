package com.yedam.api;
/*
 * 스트링 클래스
 */
public class StringExe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="Hello, world";
		str= new String("Hello, world");
		byte[] bAry = str.getBytes();
		for(int i=0; i<bAry.length;i++) {
			System.out.println(bAry[i]);
		}
		
		byte[] bstr = {72,101,108,108,111,44,32,119,111,114,108,100};
		String msg= new String(bstr,7,5);
		
			System.out.println(msg);
		char result= msg.charAt(0);
		System.out.println((int)result);
		//String:"", char :' '
		if(result == 'W') {
			//비교구문
		}
		//indexof 문자 포함 여부 조사
		int idx=msg.indexOf('o'); //문자열 찾기 주어진 문자열이 포함되어있지않으면 -1 리턴
		if(idx != -1) {
			// 처리 (존재여부를 처리하기위해 indexOf)
		}
		String[] names= {"홍길동","홍길승","김민규","박홍길","홍만수"};
		int cnt = 0;
		//length 문자열 길이
		for(int i=0;i<names.length;i++) {
			if(names[i].indexOf("홍")==0) {
				cnt++;
			}
		}
		System.out.println("\"홍\"을 성으로 갖는 이름의 갯수" +cnt);
		//substring 문자열 잘라내기
	   System.out.println("Hello,World".substring(3,7));
	   
	   //replace() 문자열 대치
	   String oldStr="자바 프로그래밍";
	   String newStr=oldStr.replace("자바", "Java");
	   System.out.println(oldStr);
	   System.out.println(newStr);
	   //알파벳 소대문자 변경
	   String original1 ="Java Programming";
	   String original2 ="JAVA Programming";
	   String lowerCase=original1.toLowerCase();
	   String upperCase=original1.toUpperCase();
	   
	   String lostr1= original1.toLowerCase();
	   String lostr2= original2.toLowerCase(); 
	   System.out.println(lowerCase);
	   System.out.println(upperCase);
	}

}
