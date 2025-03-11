package com.yedam.variable;

public class VarExe8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 10;
		byte b1 =120;
		byte result = (byte) (b1+130); // 바이트의 범위 -128~ 127 ../형변환(casting) : (byte)없으면 숫자 연산을 int 타입으로 생각하여 자동 연산 byte보다 큰값이 들어오게 되므로 오류 발생
		System.out.println("더한 결과 :"+result);
		//byte ->int (자동형변환 : promotion)
		n1=b1;
		System.out.println(n1);
		n1 =200;
		b1=(byte)n1; //int->byte 형변환으로 가능하지만 원하는 값의 손실이 있음
		System.out.println(b1);
		for(int i=1;i<15;i++) {
			System.out.println(b1++);
		}
		
	}

}
