package com.yedam.bookApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemberJdbc {

	// 커넥션 생성 메소드
	Connection getConnect() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userId = "scott";
		String userPw = "tiger";

		try {
			Connection conn = DriverManager.getConnection(url, userId, userPw);
			return conn;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}// end of getConnect

	// 로그인처리.
	public User login(String id, String pw) {
		// id,pw 조회
		Connection conn = getConnect();
		String sql = "select * from tbl_member " + "where user_id=? " + "and password=?";
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);
			ResultSet rs = psmt.executeQuery();
			// 조회결과 있으면
			if (rs.next()) {

				User user = new User(rs.getString("user_id"), rs.getString("user_name"), rs.getString("password"));
				
				return user;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null; // 조회결과 없으면
	}

	public List<Map<String, String>> memberList() {
		List<Map<String, String>> list = new ArrayList<Map<String, String>>();
		Connection conn = getConnect(); // db session
		String sql = "select * from tbl_member ";

		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			ResultSet rs = psmt.executeQuery();
			while (rs.next()) {
				// userId,password,userName 저장할 컬렉션

				Map<String, String> map = new HashMap<String, String>();
				map.put("userId", rs.getString("user_id"));
				map.put("password", rs.getString("password"));
				map.put("userName", rs.getString("user_name"));
				list.add(map);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	// 맵 타입으로 [{userid:"user01"},{userpassword:"1111"}>저장

}
