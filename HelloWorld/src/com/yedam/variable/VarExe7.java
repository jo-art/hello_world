package com.yedam.variable;

import java.util.Scanner;
//추가,수정,삭제,목록 출력.
public class VarExe7 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		boolean run = true;
		//member 정보 값을 저장하는 배열 저장
		Member[] storage = new Member[100]; //클래스 타입의 매열 초기값은{null,null,...,null}
		storage[0] = new Member("홍길동",83);
		storage[1] = new Member("김민혁",86);
		storage[2] = new Member("한수아",90);
		while(run) {
			System.out.println("1.등록 2.수정 3.삭제 4.목록 출력 5.평균 6.종료");	
			System.out.print("선택>>");
			
			int menu= Integer.parseInt(scn.nextLine()); //1 엔터. // 문자열 타입을 숫자형으로 
			switch(menu) {
			case 1:// 추가
				System.out.print("이름입력>>");
				String name= scn.nextLine(); 
				System.out.print("점수입력>>");
				int score = Integer.parseInt(scn.nextLine());
				Member member = new Member(); //인스턴스 생성.
				//member.name =name;
				//member.score=score; -> 변수를 private으로 지정해둔 경우 
				member.setMember(name, score);
				//빈공간에 값을 할당 ,
				
				for(int i=0; i<storage.length;i++) {
					if(storage[i]==null) {
						storage[i]=member;
						break; //for 반복문 종료.
					}
				}
				
				break; // 스위치 case 1에 대한 종료.
			case 2: //수정
				System.out.print("변경할 이름입력>>");
				name= scn.nextLine();
				boolean isExist = false; // 존재여부 체크
				for(int i=0; i<storage.length;i++) {
					if(storage[i]!=null && storage[i].getName().equals(name)) {
						System.out.print("변경할 점수입력>>");
						score = Integer.parseInt(scn.nextLine());
						storage[i].setScore(score);
						System.out.println("변경되었습니다.");
						isExist = true; //체크 확인
						break;
					}
				}
				
				if(!isExist) {
					System.out.println("찾는이름이 없습니다.");
				}
				break;
			case 3: //삭제	이름 입력 조회 후 => null대입
				System.out.print("조회할 이름입력>>");
				 name= scn.nextLine();
				 boolean isExist1 = false;
				for(int i=0;i<storage.length;i++) {
					if(storage[i]!=null && storage[i].getName().equals(name)) {
						storage[i]=null; //삭제
						System.out.println("삭제되었습니다.");
						isExist1 = true; //체크 확인
						break;
					} 
					
				}
				if(!isExist1) {
					System.out.println("찾는이름이 없습니다.");
				}
				break;
			case 4://츨략
				for(int i=0;i<storage.length;i++) {
					if(storage[i] != null) {
						System.out.println(storage[i].getName()+" "+storage[i].getScore());
					}
				}
				break;
			case 5: //평균
				// 학생들의 점수 합을 구하고 학생수만큼 나누면
				//평균입니다.
				int sumScore=0;
				int count=0;
				for(int i=0; i< storage.length; i++) {	
					if(storage[i] != null) {
						//sumScore=sumScore+storage[i].getScore();
						sumScore+=storage[i].getScore();
						count++;
					}
					
				} // 합 구하기
				double avg=sumScore*1.0/count; //평균값 구하기
						
				System.out.println("평균값 "+avg);
				
				
				break;
				
			case 6:	// 종료
				run =false;
			}
			
				
		}
		System.out.println("end of prog.");
	}//end of main();
}
