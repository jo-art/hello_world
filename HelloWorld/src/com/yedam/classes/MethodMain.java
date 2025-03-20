package com.yedam.classes;

import java.util.List;
import java.util.Scanner;

public class MethodMain {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		officeApp();
	}//end of main.

	static void officeApp() { //product  
		// 목록,추가,수정,삭제.....
		boolean run = true;
		MethodExe2 m2 = new MethodExe2(); // 기능정의
		
		Scanner scn = new Scanner(System.in);
		// 사용자 입력 받아서 1. 목록,2.추가,3.수정,4.삭제.....9.종료 구현

		while (run) {
			System.out.println("1.목록 2.추가 3.수정 4.삭제 9.종료");
			System.out.println("선택>>");
			int menu = scn.nextInt();
			scn.nextLine(); // 입력 버퍼 비우기
			switch (menu) {
			case 1:
				
				
				Product prd = new Product();
				prd.setProductName("ALL");
				List<Product> list= m2.productList(prd);
				for(int i=0; i<list.size();i++) {
					
					System.out.println(list.get(i).showList());
				}
				break;
			case 2:	
				
				System.out.print("상품코드명입력 >>");
				 String code= scn.nextLine();
			
				
				System.out.print("상품명입력 >>");
				String name= scn.nextLine();
				
				System.out.print("가격입력>>");
				int price = Integer.parseInt(scn.nextLine());
			
//				prd1.setProductCode(price);
				Product addprd = new Product(code,name,price);
				 if(m2.add(addprd)) {
					 System.out.println("등록성공");
				 } else {
					 System.out.println("등록실패");
				 }
				 break;
			case 3 :
				System.out.print("상품코드명입력 >>");
				code= scn.nextLine();
			
				
				System.out.print("상품명입력 >>");
				 name= scn.nextLine();
				
				System.out.print("가격입력>>");
				 price = Integer.parseInt(scn.nextLine());
				 Product mprd = new Product(code,name,price);
				 if(m2.modify(mprd)) {
					 System.out.println("변경 완료");
				 }else {
					 System.out.println("변경 실패");
				 }
				 
				 break;
			case 4:
				//상품코드로 조회해서 삭제하는 것.
				System.out.print("상품코드명입력 >>");
				code= scn.nextLine();
			
			
				 if(m2.remove(code)) {
					 System.out.println("삭제 완료");
				 }else {
					 System.out.println("삭제 실패");
				 }
				
				break;
				
			case 9:
				System.out.println("프로그램 종료");
				run=false;
				m2.save();
				break;
			default:
				System.out.println("메뉴를 다시 선택하세요");
			}
			

		}

	}
		
		
	
	void method4() {
		//MethodExe4 m4 = new MethodExe4();
		MethodExe4.main();	
	}
	void method3() {
		//삼품코드:m001, 상품 명:만년필,가격:10000원
		//MethodExe3 m3 = new MethodExe3(); //정적 선언후 인스턴스 생성하지않고 호출
				
		System.out.println(MethodExe3.gugudan(3,7));
		MethodExe3.printStar(5, "💙" ); 
		MethodExe3.printCard();
	} // 구구단
	
	void method2() {
		MethodExe2 m2 = new MethodExe2();
//		 if(m2.add(new Product("M001","만년필",10000))) {
//			 System.out.println("등록성공");
//		 }
//		 if(m2.remove("B001")) {		
//		System.out.println("삭제성공");
//		 }
		//상품코드,상품명,가격. modify(Product prod) 
		//상품코드는 중복값 없어야한다. 
		Product prod = new Product("A001",null,2000);
		if(m2.modify(prod)) {
			System.out.println("수정성공");
		}
		 Product search = new Product();
		 search.setProductName("지우개");
		 search.setPrice(1500);
		 List<Product> list =m2.productList(search); //기능호출
		 for(int i=0; i<list.size();i++) {
			
				  System.out.println(list.get(i).showList());
			 
		}
	}//프로덕드 등록/목록
	
	void method1() {
		MethodExe1 m1 =new MethodExe1(); //생성자 호출 new:힙영역에 저장된 주소 반환하는 연산자
		//System.out.println(m1);
		//메소드 호출.
		int n=5;
		m1.printString(n,"🧡");
		
		double result =m1.sum(n,10.5); //더블은 인트보다 데이터범위가 크므로 내부적으로 n을 더블로 형변환 후 처리
		
		System.out.println(result);
		
		int sum=m1.sum(new int[] {10,20,30,40,50});
		System.out.println(sum);
		
		double dsum=m1.sum(new double[] {10.2,21.5,30.4});
		System.out.println(dsum);
	} 

}
