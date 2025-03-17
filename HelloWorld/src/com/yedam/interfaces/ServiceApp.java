package com.yedam.interfaces;
/*
 * 메인메소드를 담고 있는 실행 클래스
 */
public class ServiceApp {
	public static void main(String[] args) {
		//MysqlDao dao = new MysqlDao();
		//OracleDao dao = new OracleDao();
		Dao dao = new MysqlDao(); // 인터페이스 타입  인터페이스 변수 = new 구현 객체();
		dao.insert(); //등록
		dao.update(); //수정
		dao.delete(); //삭제
		
	}
}
