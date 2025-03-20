package com.yedam.classes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class MethodExe2 {

	private List<Product> store; // 필드

	// 생성자
	MethodExe2() {
		init();

	}

	void init1() {
		store = new ArrayList<Product>();// new Product[10];

		try {
			Scanner scn = new Scanner(new FileInputStream("c:/temp/message.txt"));
			while (true) {
				String msg = scn.nextLine();
				String[] msgAry = msg.split(" ");
				store.add(new Product(msgAry[0], msgAry[1], Integer.parseInt(msgAry[2])));
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchElementException e) {

		}
		// 초기화 작업 끝

	}

	void init() {
		try {
			FileInputStream fis = new FileInputStream("c:/temp/object.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			store=(List<Product>)ois.readObject();
		} catch (Exception e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
		}
	}

	void save() {
		 
		try {
			FileOutputStream  fos = new FileOutputStream("c:/temp/object.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(store);
			oos.flush();
			oos.close();
			fos.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	// 종료시점에 store 정보를 message.txt에 저장
	void save1() {

		try {
			Writer writer = new FileWriter("c:/temp/message.txt");
			for (Product prd : store) {
				String msg = prd.getProductCode() + " " + prd.getProductName() + " " + prd.getPrice();

				writer.write(msg + "\n");
				writer.flush();
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	// 메소드

	boolean add(Product prd) {
		boolean result = store.add(prd);
		return result;
	}// end of add(Product prd)

	List<Product> productList(Product prd) { // 기능정의
		List<Product> list = new ArrayList<Product>();

		for (int i = 0; i < store.size(); i++) {

			if (prd.getProductName().equals("ALL") || store.get(i).getProductName().equals(prd.getProductName())) {
				if (store.get(i).getPrice() >= prd.getPrice()) {
					list.add(store.get(i));

				}

			}

		}
		return list;
	}// end of productList 상품이름,ALL로 조회

	// 삭제=> boolean remove(String code)
	boolean remove(String code) {
		for (int i = 0; i < store.size(); i++) {

			if (store.get(i).getProductCode().equals(code)) {

				store.remove(i);
				return true;

			}

		}
		return false;
	}// end of remove

	// 수정=>
	boolean modify(Product prd) {
		for (int i = 0; i < store.size(); i++) {

			if (store.get(i).getProductCode().equals(prd.getProductCode())) {
				// 상품명 수정
				if (prd.getProductName() != null) {
					store.get(i).setProductName(prd.getProductName());
				}
				// 상품가격 수정
				if (prd.getPrice() != 0) {
					store.get(i).setPrice(prd.getPrice());
				}
				return true;

			}

		}
		return false;

	}// end of modify

}
