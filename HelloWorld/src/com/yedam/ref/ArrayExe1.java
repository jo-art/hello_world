package com.yedam.ref;

public class ArrayExe1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intAry= {10,20,30};
		for(int i=0; i<3; i++ ) {
			System.out.println(intAry[i]);
		}
		//intAry= {40,50,60); 재할당 할 때
		intAry= new int[] {40,50,60};
		System.out.println("---------구분선------------");
		//배열 사이즈 
		intAry = new int[10]; //{0,0,....,0}
		intAry[3]=30; //3번째 배열 데이터에 30으로 변경
		intAry[9]=90; //9번째 배열 데이터에 90으로 변경
		
		//인덱서 범위를 벗어난 값 넣을 경우 예외 밸상 intAry[10]=100;-->구문상 오류아님  Index 10 out of bounds for length 10
		//at com.yedam.ref.ArrayExe1.main
		
		intAry[1]=100;
		intAry[0]=(int)(Math.random()*100)+1;
		for(int i=0;i<intAry.length;i++) {
			if(intAry[i]==0) {
				intAry[i]=(int)(Math.random()*100)+1;
				
			}System.out.println(i+"번째 값은"+intAry[i]+"입니다");
		} 
		System.out.println("---------구분선------------");
		// 홀수값의 합 구하기.
		//"홀수 값의 합은  ~입니다."
		
		int sum=0;
		for(int i=0;i<intAry.length;i++) {
			if(intAry[i]%2==1) {
				sum = sum+ intAry[i];
			}
			
		} System.out.println("홀수값의 합은" + sum +"입니다.");
		
		
	}

}
