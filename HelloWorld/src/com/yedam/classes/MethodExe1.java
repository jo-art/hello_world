package com.yedam.classes;

public class MethodExe1 {//라이브러리 클래스
	
	//return 타입 메소드이름(매개변수...){
	//실행블록}
	
	
	 void printString(int times,String str){
		 for(int i=1; i<=times;i++) {
			 System.out.println(str);
		 }
		 
	 }
	 //두 정수의 합
	 int sum(int n1,int n2) {
		 int result =0;
		 result = n1+n2;
		 return result;
	 }
	 //두 실수의 합 
	 double sum(double n1, double n2) {
		 return (n1+n2);
	 }
	 
	 //같은 메소드명으로 재정의,오버로딩
	 
	 //배열의 합
	 int sum(int []ary) {
		 int result=0;
		 for(int i=0; i<ary.length;i++) {
			 result= result +ary[i];
		 }
		 return result;
	 }
	 
	 //배열을 매개변수로 받는 합 sum ,double타입의 매개값
	 double sum(double []ary) {
		 double result =0;
		 for(int i=0;i<ary.length;i++) {
			 result = result +ary[i];
		 }
		 return result;
	 }
	 
}//end of MethodExe1 class
