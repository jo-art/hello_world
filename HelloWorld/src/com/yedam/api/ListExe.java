package com.yedam.api;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * list 컬렉션
 */
public class ListExe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열 : int[],String[],Member[] => intAry[0]
		//컬렉션 :list<integer>,list<String>,list<member>
		//intlist.get(0),intlist.add(30)
		List<Integer> intlist = new ArrayList<Integer>();
		intlist.add(100);
		intlist.add(150);
		intlist.add(200);
		intlist.add(100);
		
		for(int i=0;i<intlist.size(); i++) {
			System.out.println(intlist.get(i));
		}
		
		//set 컬렉션. 무순서, 중복된 값 저장 불가능
		Set<Integer> intSet = new HashSet<Integer>();
		intSet.add(100);
		intSet.add(150);
		intSet.add(200);
		intSet.add(100);
		System.out.println("-----------");
		for(Integer num: intSet) {
			System.out.println(num);
		}
		
		//set<Member> 
		
		Set<Member> members = new HashSet<Member>();
		members.add(new Member("홍길동",50));
		members.add(new Member("조현철",25));
		members.add(new Member("김윤숙",21));
		members.add(new Member("조현철",25)); //hashcode=age,equals => 동등객체----> 객체 해시코드
		System.out.println("-----------");
		
		for(Member mem : members) {
			System.out.println(mem.toString());
		}
		


	}

}
