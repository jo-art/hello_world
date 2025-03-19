package com.yedam.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.yedam.bookApp.Book;

public class MapExe {
	//Map : 키와 값으로 구성된 Map
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//선언
		Map<Integer,String> map=new HashMap<Integer,String>();
		//객체 추가
		map.put(100,"홍길동");
		map.put(101,"김민수");
		map.put(102,"김혁수");
		map.put(101,"김민식");//동일한 키일 경우 , 마지막 value값을 저장
		//삭제
		map.remove(100);
		Set<Entry<Integer,String>> eset = map.entrySet();
		for(Entry<Integer,String> entry :eset) {
			System.out.println(entry.getKey()+","+entry.getValue());
		}
		
		
		
		boolean run=true;
		if(run)
			return;
		
		
		Map<String,Book> books =new HashMap<String,Book>(); //북객체를 담음.
		//삽입
		books.put("B001", new Book("이것이자바다","신용권","한빛출판사",20000));
		books.put("B002", new Book("자바스크립트","신용권","가람출판사",25000));
		books.put("B003", new Book("HTML/CSS","신용권","한빛출판사",28000));
		//검색
		Book result =books.get("B001");
		//키 set 반환 
		Set<String> keyset=books.keySet();
		for(String key:keyset) {
			System.out.println("key:"+key+",val:"+books.get(key).showList());
		}
		
		
		//키:값(Entry)반환.
		Set<Entry<String,Book>> entryset=books.entrySet();
		for(Entry<String,Book> entry :entryset) {
			System.out.println("key:"+entry.getKey()+",val"+entry.getValue().showList());
		}
		//삭제
	
		// {키: 값}
		Gson gson = new GsonBuilder().setPrettyPrinting().create(); //자바객체 --> 문자열
		String json = gson.toJson(books);  //맵의 구조를 파악하기위해 json ,gson이라는 라이브러리를 가져옴.
		System.out.println(json); //객체 출력
		
		
		
		
		
	}

}
