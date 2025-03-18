package com.yedam.classes;

import java.util.ArrayList;
import java.util.List;

public class MethodExe2 {

	private List<Product> store; //필드
	
	//생성자
	MethodExe2(){
		store = new ArrayList<Product>();//new Product[10];
		store.add( new Product("A001","지우개",500));
		store.add(new Product("B001","샤프1000",1000)) ;
		store.add(new Product("C001","연필500",800));
		store.add(new Product("D001","지우개",1000));
	}
	
	
	//메소드
	
	boolean add(Product prd) {
		boolean result = store.add(prd);
		return result;
	}//end of add(Product prd)
	
	List<Product> productList(Product prd) { //기능정의
		List<Product>  list = new ArrayList<Product>();
		
		
		for(int i=0;i<store.size();i++) {
			
				if(prd.getProductName().equals("ALL") ||  store.get(i).getProductName().equals(prd.getProductName())) {
				if(store.get(i).getPrice() >=prd.getPrice()) {
					list.add( store.get(i));
				 
				}
					
				}
			
		}
		return list;
	}//end of productList 상품이름,ALL로 조회
	
	//삭제=> boolean remove(String code)
	boolean remove(String code) {
		for(int i=0;i<store.size();i++) {
			
			if(store.get(i).getProductCode().equals(code)) {
				
					store.remove(i);
					return true;
				
			}
			
		
		}
		return false;
	}// end of remove
	
	//수정=>
		boolean modify(Product prd) {
			for(int i=0;i<store.size();i++) {
				
				if(store.get(i).getProductCode().equals(prd.getProductCode())) {
					//상품명 수정
					if(prd.getProductName() != null) {
						store.get(i).setProductName(prd.getProductName());
					}
					//상품가격 수정
					if(prd.getPrice()!=0) {
						store.get(i).setPrice(prd.getPrice());
					}
					return true;
					
			}
			
		}
			return false;
		
		
	}//end of modify

}
