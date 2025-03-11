package com.yedam.variable;

import java.util.Scanner;

//예금, 출금, 잔고
public class VarExe5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run =true; // true or false 값 만 들어오는 boolean data type
		int balance =0; //예금액을 저장하는 잔고 변수
		//예금할 수 있는 한도가 10만원, 잔고가 0보다는 크도록		
		int amt=0;
		Scanner scn = new Scanner(System.in);
		while(run) {
			System.out.println("1.예금 2.출금 3.잔고확인 4.종료");			
			int menu= scn.nextInt();
			switch(menu) {
			case 1 : 
				System.out.println("금액을 입력하세요:");
					amt = scn.nextInt();
				if(balance+amt>100000) {
					System.out.println("10만원을 초과합니다 입금할 수 없습니다.");
				}else {
					balance=balance+amt;
				}
				break; //case 1 종료
			case 2 : 
				System.out.println("출금액을 입력하세요:");
				amt = scn.nextInt();
				
				if(balance<amt) {
						System.out.println("잔액 초과,출금할수 없습니다.");
				}else {
						balance=balance-amt;
				}	
				break; //case 2 종료
			
			case 3 :
				System.out.println("현재 잔고는"+balance+"입니다.");
				break; //case 3 종료
			
			case 4 :
				run=false;
			}
		} System.out.println("end of prog");
	}// end of main();

}
