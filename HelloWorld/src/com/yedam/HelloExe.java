package com.yedam;

import com.yedam.variable.Member;

public class HelloExe {
	// 기능을 담고 있는 함수 = main 메소드.
	public static void main(String[] args) {
		System.out.println("Hello world1");
		
		String name; // 문자 열 데이터 타입 선언
		name="조정민";
		System.out.println("이름은"+ name); //
		
		int score =100; // 정수형 데이터 타입 선언
		
		System.out.println("점수는 "+score+"점 입니다.");
		System.out.println("수정된 부분");
		//+연산자 문자열 사이 +는 연결 연산자
		
		//1.32000 변수선언과 할당
		int money =32000;
		//2. 34,32,88,23
		int []intArys = {34,32,88,23};
		String str="32";
		//4.정수변수에 저장
		int num = Integer.parseInt(str);
		//5.Hello,Nice,Good
		System.out.print("Hello,Nice,Good");
		//6. 정수 5개 저장
		int[] intAry = new int[5];
		for(int i=0;i<intAry.length;i++) {
			if(intAry[i]==0) {
				intAry[i]=(int)(Math.random()*100)+1;
				
			}System.out.println(i+"번째 값은"+intAry[i]+"입니다");
		} 
		//7. 이름 나이 연락처 선언하는 클래스 만들기
		// 홍길동 010-1234-1234,20
		class Student {
				 	public String name;
					public String pnum;
					public int age=20;
					
			public Student() {
				
			}
			public  Student(String name,String pnum,int age){
				this.name=name;
				this.pnum=pnum;
				this.age=age;
			}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public String getPnum() {
				return pnum;
			}
			public void setPnum(String pnum) {
				this.pnum = pnum;
			}
			public int getAge() {
				return age;
			}
			public void setAge(int age) {
				this.age = age;
			}
		}
		   Student h1 = new Student();
		   h1.setName("홍길동");
		   h1.setPnum("010-1234-1234");
		   h1.setAge(20);
		   
		 
			
		
		   // 배열 [3] 만들고
	        Student[] memAry = new Student[3];
	        memAry[0] = new Student("홍길동", "010-1234-1234", 20);
	        memAry[1] = new Student("김문식", "010-1234-1234", 23);
	        memAry[2] = new Student("최문식", "010-1234-1234", 24);
		
		
	        int Maxage=memAry[0].getAge();
	        String Maxname="";
		for(int i=0;i <memAry.length;i++) {
			if(Maxage<memAry[i].getAge()) {
				Maxname =memAry[i].getName();
				Maxage=memAry[i].getAge(); 
				
				
			}
			
		}
		System.out.println("나이가 가장 많은 사람은"+Maxname+",나이는"+Maxage);
		
		
		//배열 [3] 만들고
		//홍길동,010-1234-1234,20
		//김문식,010-1234-1234,23
		//최문식,010-1234-1234,24
		
		//나이가 제일많은 사람의 이름을 출력
		}
	}


	


