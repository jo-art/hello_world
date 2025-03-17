package com.yedam.api;

public class SystemExe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++) {
			if(i  == 5) {
				System.out.println("종료합니다.");
				//break;
				System.exit(0);
			}
		}
		System.out.println("end of prog");
		
	}
	
	

}
