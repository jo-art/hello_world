package com.yedam.classes;

public class MethodExe2 {

	private Product[] store; //필드
	
	//생성자
	MethodExe2(){
		store = new Product[10];
		store[0]= new Product("A001","지우개",500);
		store[1]= new Product("B001","샤프1000",1000);
		store[2]= new Product("C001","연필500",800);
		store[3]= new Product("D001","지우개",1000);
	}
	
	
	//메소드
	// 매개변수로 객체가 온상황
	boolean add(Product prd) {
		for(int i=0; i<store.length;i++) {
		  if(store[i]==null) {
			  store[i]=prd;
			  return true;			
		  }
		}
		return false;
	}//end of add(Product prd)
	
	Product[] productList(Product prd) { //기능정의
		Product[] list = new Product[10];
		int idx=0;
		
		for(int i=0;i<store.length;i++) {
			if(store[i] != null) {
				if(prd.getProductName().equals("ALL") ||  store[i].getProductName().equals(prd.getProductName())) {
				if(store[i].getPrice() >=prd.getPrice()) {
					list[idx++] = store[i];
				 
				}
					
				}
			}
		}
		return list;
	}//end of productList 상품이름,ALL로 조회
	
	//삭제=> boolean remove(String code)
	boolean remove(String code) {
		for(int i=0;i<store.length;i++) {
			if(code.equals("ALL")) {
				store[i] = null;
			}
			if(store[i]!=null&&store[i].getProductCode().equals(code)) {
				
					store[i] = null;
					return true;
				
			}
			
		
		}
		return false;
	}// end of remove
	
	//수정=>
		boolean modify(Product prd) {
			for(int i=0;i<store.length;i++) {
				
				if(store[i]!=null&&store[i].getProductCode().equals(prd.getProductCode())) {
					//상품명 수정
					if(prd.getProductName() != null) {
						store[i].setProductName(prd.getProductName());
					}
					//상품가격 수정
					if(prd.getPrice()!=0) {
						store[i].setPrice(prd.getPrice());
					}
					return true;
					
			}
			
		}
			return false;
		
		
	}//end of modify

}
