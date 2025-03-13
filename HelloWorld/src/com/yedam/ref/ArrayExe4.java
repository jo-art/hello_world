package com.yedam.ref;

public class ArrayExe4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intAry= {8, 7, 6, 5, 4,3,1,2};
		//위치변경
		int temp=intAry[0]; //덮어씀
		intAry[0]=intAry[1];
		intAry[1]=temp;
		
		for(int j=0; j<intAry.length-1; j++) {
			for(int i=0;i<intAry.length-1;i++) { //전체 요소보다 -1한 요소들만 바꾸기
				//System.out.println(intAry[i]);
				// i, i+1 번째의 값이 내림차순이면 올림차순으로 바꾸는 작업
				if(intAry[i] >intAry[i+1]) {
					 temp=intAry[i];
					 intAry[i]=intAry[i+1];
					 intAry[i+1]=temp;
				}
			}
		}
		for(int i=0; i<intAry.length;i++) {
			System.out.println(intAry[i]);
		}
		
	}

}
