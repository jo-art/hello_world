package com.yedam.bookApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/*
 * ojdbc를 활용.
 */
public class BookJdbc {
	//커넥션 객체 생성 .
	Connection getConnect() {
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String userId="scott";
		String userPw="tiger";
		
		try {
			Connection conn = DriverManager.getConnection(url,userId,userPw);
			return conn;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}
	//추가
	public boolean insert(Book book) {
		 Connection conn=getConnect();
		 String sql ="insert into tbl_book(book_code,book_title,author,company,price)\r\n"
		 		+ "values(book_seq.nextval,?,?,?,?)";
		 try {
			//Statement stmt = conn.createStatement();
			 PreparedStatement stmt = conn.prepareStatement(sql);
			 stmt.setString(1, book.getTitle());
			 stmt.setString(2, book.getAuthor());
			 stmt.setString(3, book.getCompany());
			 stmt.setInt(4, book.getPrice());
			int r= stmt.executeUpdate(); //쿼리
			if(r>0) {
				return true; //등록성공.
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		 return false; //등록 실패.
	}
	//수정
 public boolean update(Book book) {
	 Connection conn =getConnect();
	 String usql ="update tbl_book "
	 		+ "set book_title=nvl('?',book_title) "
	 		+ ",price=? "
	 		+ ",author=nvl('?',author) "
	 		+ ",company=nvl('?',company) "
	 		+ "where book_code='?'";
	 try {
		 PreparedStatement stmt = conn.prepareStatement(usql);
		 stmt.setString(1, book.getTitle());
		 stmt.setInt(2, book.getPrice());
		 stmt.setString(3, book.getAuthor());
		 stmt.setString(4, book.getCompany());
		 stmt.setString(5, book.getBookCode());
		 int u= stmt.executeUpdate();
		if(u>0) {
			return true;
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	 return false;
 }
	
	//삭제
	public boolean delete(String bookCode) {
		Connection conn1 = getConnect();
		String sql1 ="delete from tbl_book\r\n"
				+ "where book_code='"+bookCode+"'";
		 
		try {
			Statement dstmt = conn1.createStatement(); 
			int d =dstmt.executeUpdate(sql1); //쿼리
			if(d>0) {
				return true;  //삭제성공.
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;//삭제실패
		
	}
	//목록
	
	public List<Book> list(String company){
		
		List<Book> list = new ArrayList<Book>();
		Connection conn=getConnect();
		String sql="select *\r\n "
				+ "from tbl_book\r\n "
				+ "where company=nvl(?,company)\r\n " 
				+ "order by book_code";
		try {
			PreparedStatement psmt = conn.prepareStatement(sql); 
			psmt.setString(1, company);
			ResultSet rs= psmt.executeQuery();
			
			while(rs.next()) {
				Book book = new Book();
				book.setAuthor(rs.getString("author"));
				book.setBookCode(rs.getString("book_code"));
				book.setCompany(rs.getString("company"));
				book.setPrice(rs.getInt("price"));
				book.setTitle(rs.getString("book_title"));
				list.add(book); //컬렉션 저장
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
		
		
	} // end of 목록
	
public List<Book> tlist(String title){
		
		List<Book> tlist = new ArrayList<Book>();
		Connection conn=getConnect();
		String sql="select *\r\n "
				+ "from tbl_book\r\n "
				+ "where title=nvl(?,title)\r\n " 
				+ "order by book_code";
		try {
			PreparedStatement psmt = conn.prepareStatement(sql); 
			psmt.setString(1, title);
			ResultSet rs= psmt.executeQuery();
			
			while(rs.next()) {
				Book book = new Book();
				book.setAuthor(rs.getString("author"));
				book.setBookCode(rs.getString("book_code"));
				book.setCompany(rs.getString("company"));
				book.setPrice(rs.getInt("price"));
				book.setTitle(rs.getString("book_title"));
				tlist.add(book); //컬렉션 저장
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return tlist;
		
		
	} // end of 목록
	
	//단건조회

	public Book select(String title) {

		
		Connection conn = getConnect();
		String sql = "select *\r\n " + "from tbl_book\r\n " + "where book_title =?";
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, title);
			ResultSet rs = psmt.executeQuery();

			if (rs.next()) {
				Book book = new Book();
				book.setAuthor(rs.getString("author"));
				book.setBookCode(rs.getString("book_code"));
				book.setCompany(rs.getString("company"));
				book.setPrice(rs.getInt("price"));
				book.setTitle(rs.getString("book_title"));
				return book;
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null; //조회결과 없다.

	}// end of 단건조회
	
	
	
	
	
	
}//end of 클래스
