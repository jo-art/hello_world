package com.yedam.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * 1. 데이터베이스와 관련된 라이브러리 //오라클  ojdbc 데이터베이스 연결, 쿼리, 실행결과.
 * 2. 커넥션 객체. (세션 불러오기)
 * 3. statement(PreparedStatement)쿼리실행.
 * 4. ResultSet (조회), int(입력, 수정,삭제)
 */
public class DaoExe {
	public static void main(String[] args) {
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String userId="scott";
		String userPw="tiger";
		String sql="select EMPNO,ENAME,JOB,MGR,HIREDATE,SAL\r\n"
				+ "from emp\r\n"
				+ "order by empno desc";
		try {
			Connection conn = DriverManager.getConnection(url,userId,userPw);
			System.out.println("연결성공");
			Statement stmt = conn.createStatement();
			conn.setAutoCommit(false); // 옵션 : 자동커밋 사용여부 :false (사용불가)
			int r =stmt.executeUpdate("delete from emp where empno=9998"); //executeUpdate 자동커밋.
			if(r>0) {
				System.out.println("삭제성공.");
				conn.commit(); // 커밋처리.
			}
			ResultSet rs=stmt.executeQuery(sql); //쿼리작성 -->실행
			
			// 결과값 출력
			while(rs.next()) {
				System.out.println(rs.getInt("EMPNO")+","+rs.getString("ENAME")+","+rs.getString("JOB")); //데이터베이스의 컬럼값 을 int타입으로 반환
			}
			System.out.println("--end of data--");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
