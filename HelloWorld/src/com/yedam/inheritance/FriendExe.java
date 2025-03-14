package com.yedam.inheritance;
/*
 * 상속
 * 친구1: 이름 ,연락처
 * 친구2: 이름, 연락처, 학교,학과
 * 친구3: 이름, 연락처 , 회사, 부서
 */
public class FriendExe {

	public static void main(String[] args) {
		Friend1[] friends =new Friend1[10];
		Friend1 f1 = new Friend1();
		f1.setName("홍길동");
		f1.setTel("010-1234-1234");
		System.out.println(f1.toString());
		// TODO Auto-generated method stub
		
		UnivFriend f2 = new UnivFriend(); //인스턴스 생성
		
		f2.setName("김자식");
	    f2.setTel("010-1234-1234");
	    f2.setUnivName("우리학교");
	    f2.setMajor("역사학과");
	    
	    //System.out.println(f2.toString());
	    
	    CompanyFriend f3 = new CompanyFriend("김자식","010-1408-1235","대구은행","DB설계");
//	    f3.setName("김자식");
//	    f3.setTel("010-1234-1234");
//	    f3.setCompany("대구은행");
//	   f3.setDept("DB설계");
	    System.out.println(f3.toString());
	    
	    
		// 부모 클래스의 변수에 자식인스턴스 대입 가능
	    friends[0] = f1;
		friends[1] = f2;
		friends[2] = f3;
		for(int i=0; i<friends.length;i++) {
			if(friends[i]!=null) {
				System.out.println(friends[i].toString());
			}
		}
		
		//형변환
		int num=20;
		double num2 =num; //자동형변환
		num =(int)num2;// 강제 형변환
		Friend1 f4=new CompanyFriend("김무열","010-1111-1111","자회사","인사팀");
		Friend1  f5=new Friend1("박성길","010-7408-7139");
		CompanyFriend cf=(CompanyFriend) f4; //부모클래스 자식클래스에 대입 
		if(f4 instanceof CompanyFriend) {
			cf = (CompanyFriend)f4;
			System.out.println(cf.getCompany());
		}else {
			System.out.println("Casting할수 없습니다.");
		}
		
		System.out.println(cf.getCompany());
	}//end of main

}
