package com.yedam.variable;

//(datatype)
class Student{
	String name;
	int score;
	double height;
}

public class VarExe2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="홍길동";
		int score =100;
		
		Student s1 = new Student(); //인스턴스 생성.
		s1.name="조정민";
		s1.score=100;
		s1.height =190.8;
		Student s2 = new Student(); //인스턴스 생성.
		s2.name="최우식";
		s2.score=92;
		s2.height =185.8;
		
		
		
		
		/////////// 배열
		int[] scores = {89,77,60,score}; //정수를 담는 배열
		int sum=0;
		for(int i=0;i<scores.length;i++) {
			sum = sum + scores[i];
		} 
		System.out.println("점수의 합 :"+sum);
		
		String[] names = {"박승호","김주승",name};
		for(int i=0; i<names.length;i++) {
			System.out.println("이름 =>"+names[i]);
		}
		Student[] students = {s1,s2};
		for(int i=0; i<students.length; i++) {
			System.out.println("이름 :"+students[i].name
					+",점수:"+students[i].score
					+",키:"+students[i].height);
		} // end of main
		
	}

}
