package com.yedam.classes;

public class MethodExe3 {

	// 구구단 출력
	String gugudan(int num, int toNum) {
		//
		int result = 0;
		String str = "";
		for (int j = num; j <= toNum; j++) {
			for (int i = 1; i <= 9; i++) {
				result = j * i;
				// System.out.println(j + "*" + i + "은" + result+"\n");
				str += j + "*" + i + "은" + result + "\n";
			}
		}
		return str;

	}

	void printStar(int cnt, String str) {
		
		for(int j=1; j<=cnt; j++) {
				for(int i=1; i<j; i++) {					
					System.out.print(str);
				  
			}	System.out.println();
		}
	}

	public void printCard() {
		// TODO Auto-generated method stub
		int[] intAry = new int[16];
		// 1~16까지의 임의수 할당
		boolean existCard = false;
		for (int i = 0; i < intAry.length-1; i++) {
			intAry[i] = (int) (Math.random() * 16) + 1;
			// 카드 중복된 값 나오지 않도록
			if(intAry[i] == intAry[i+1]) {
				existCard=true;
				intAry[i+1] += (int) (Math.random() * 16) + 1;
			}
		}
		

		// 출력
		for (int i = 0; i < intAry.length; i++) {
			System.out.printf("%3d", intAry[i]);
			if (i % 4 == 3) {
				System.out.println();
			}
		}
	}
	
	

}

