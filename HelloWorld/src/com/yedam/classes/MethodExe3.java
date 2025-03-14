package com.yedam.classes;

public class MethodExe3 {

	// 구구단 출력
	static String gugudan(int num, int toNum) {
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

	static void printStar(int cnt, String str) {
		
		for(int j=1; j<=cnt; j++) {
				for(int i=1; i<j; i++) {					
					System.out.print(str);
				  
			}	System.out.println();
		}
	}

	static void printCard() {
		// TODO Auto-generated method stub
		int[] intAry = new int[16];
		// 1~16까지의 임의수 할당
		int indx =0;
		for (int i = 0; i < intAry.length-1; i++) {
			int temp = (int) (Math.random() * 16) + 1;
			//이전에 생성된 값인지 체크
			boolean dup=false;
			
			// 카드 중복된 값 나오지 않도록
			for(int j=0;j<i;j++) {
				if(intAry[j]==temp)
				dup=true;
				indx++;
			}
			if(dup) {
				
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

