package com.yedam.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.yedam.variable.Member;

public class MapExe2 {

	public static void main(String[] args) {
	
		Map<Member,Double> map = new HashMap<Member,Double>();
		map.put(new Member("홍길동",80), 174.8);
		map.put(new Member("조민혁",90), 178.9);
		map.put(new Member("박성진",85), 184.1);
		
		map.remove(new Member("박성진",85));
		
		Set<Entry<Member,Double>> entryset = map.entrySet();
		for(Entry<Member,Double> entry: entryset) {
			System.out.println(entry.getKey()+","+entry.getValue());
		}
		
	}

}
