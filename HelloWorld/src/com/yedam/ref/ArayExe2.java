package com.yedam.ref;

import com.yedam.variable.Member;

public class ArayExe2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strAry = {"Hello","World","20","23.4"}; //문자열 배열에선 문자열 데이터 타입만 담을수 있음 , 직접 지정
		//확장 for.
		for(String str : strAry) {
			System.out.println(str); //문자열 배열의 요소를 가져오는 변수 str
		}
		//문자열 크기 지정
		strAry = new String[10]; //{null,null....,null}
		strAry[0]= new String("Nice"); //스트링 클래스로 인스턴스 생성
		for(String str : strAry) {
//			System.out.println(str); //문자열 배열의 요소를 가져오는 변수 str
		}
		// Member 클래스/
		System.out.println("---------구분선------------");
		Member[] memAry = new Member[10]; // {null,null....,null}
		memAry[0]=new Member(); //인스턴스 생성(객체생성)
		//값 할당
		memAry[0].setMember("홍길동",80);  // 클래스 배열명. 메소드명(전달할 데이터들) --> 타클래스에서 선언한 기능 사용법
		memAry[0].setScore(105);
		memAry[0].showInfo(); 
		
		memAry[1]=new Member();  //멤버 클래스 생성자 없고, 이 문구 없이 실행 하면 예외 발생 (구문상 옳지만 컴파일러 오류):Cannot invoke  because "memAry[1]" is null !널값을 참조하는지 안하는지 확인해야함
		memAry[1].setMember("박민동",85);// 클래스 배열명. 메소드명(전달할 데이터들) --> 타클래스에서 선언한 기능 사용법
		memAry[1].setScore(95);
		memAry[1].showInfo(); 
		
		
		memAry[2] = new Member("최민길",77); // 멤버클래스에 생성자 호출하면서 필드값 바로 지정 가능
		memAry[2].showInfo(); 
		
		System.out.println("---------구분선------------");
		for(int i=0; i<memAry.length;i++) {
			//if(memAry[i] !=null)
				//memAry[i].showInfo(); 
		}
	}

}
