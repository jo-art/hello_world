package com.yedam.classes;

public class MethodMain {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//삼품코드:m001, 상품 명:만년필,가격:10000원
		MethodExe3 m3 = new MethodExe3();
		System.out.println(m3.gugudan(3,7));
		m3.printStar(5, "💙" );
		m3.printCard();
		
	}//end of main.
	
	
	
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
		 Product[] list =m2.productList(search); //기능호출
		 for(int i=0; i<list.length;i++) {
			 if(list[i]!=null) {
				  System.out.println(list[i].showList());
			 }
		}
	}
	
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
