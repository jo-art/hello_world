package com.yedam.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.yedam.variable.Member;

public class SetExe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Set<String> set= new HashSet<String>();
			set.add("Hello");
			set.add("World");
			set.add("Hello");
			//반복자 요소
			Iterator<String> iter =set.iterator();
			while(iter.hasNext()) {
			      String result=	iter.next();
			      System.out.println(result);
			}
			
			//Set<member>
			Set<Member> members= new HashSet<>();
			members.add(new Member("홍길동",80));
			members.add(new Member("김민규",80));
			members.add(new Member("홍길동",80));
			
		   Iterator<Member> miter= members.iterator();
		   while(miter.hasNext()) {
			   Member result=miter.next();
			   System.out.println(result.toString());
		   }
		   //int =>Integer
		   
		   int[] intAry= {10,20,30,40,20,10};
		   Set<Integer> intArys = new HashSet<Integer>();
		   //set으로 중복 제거된 값 
		  for(int i=0; i<intAry.length;i++) {
			  intArys.add(intAry[i]);
			  
		  }
		  //반복문 ->list저장
		  List<Integer> list2 = new ArrayList<>();
		   //int배열에서 중복된 값 제거한 결과 list 추가.
		   //List 반복문 활용 출력
		  Iterator<Integer> iterator = intArys.iterator() ;//반복자
		  while(iterator.hasNext()) {
			  list2.add( iterator.next());
			  
		  }
		  // 반복문 출력
		  for(int i=0; i<list2.size();i++) {
			  System.out.println(list2.get(i));
		  }
		  
		  
		  //list2.forEach(num-> System.out.println(num)); 반복문 출력가능 
	}

}
