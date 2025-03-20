package com.yedam.bookApp;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

/*
 * 등록, 수정,삭제, 목록
 */
public class BookMain {

	// 2. 정적필드.할당
	private static BookMain instance = new BookMain();
	// 싱글톤 1. 생성자 private 선언

	private BookMain() {

	}

	// 3. 외부에서 호출할 수 있는 getInstance
	public static BookMain getInstance() {
		return instance;
	}

	// 배열 저장 공간
	//private Book[] bookStore = new Book[100];
//	private static User[] user = new User[3];
//	static {
//		user[0] = new User("a001", "조정민", "a002");
//		user[1] = new User("b001", "김웅", "b002");
//		user[2] = new User("c001", "조정", "a002");
//
//	}
	private Scanner scn = new Scanner(System.in);
//jdbc 처리
	BookJdbc dao = new BookJdbc();
	// 순번생성
//	int getSequenceNo() {
//		int max = 0;
//		for (int i = 0; i < bookStore.length; i++) {
//			if (bookStore[i] != null && bookStore[i].getOrderNo() > max) {
//				max = bookStore[i].getOrderNo();
//			}
//		}
//		return max + 1; // 현재 마지막 번호+1
//	}// end of getSequenceNo()

	private void add() {
		
		System.out.println("도서코드 입력>>");
		String bookcode = scn.nextLine();
		System.out.println("제목 입력>>");
		String title = scn.nextLine();
//		for (int i = 0; i < bookStore.length; i++) {
//			if (bookStore[i] != null && bookStore[i].getTitle().equals(title)) {
//				System.out.println("이미 등록된 책입니다.");
//				return;
//
//			}
//		}
		System.out.println("저자 입력>>");
		String author = scn.nextLine();

		System.out.println("출판사 입력>>");
		String company = scn.nextLine();

		System.out.println("가격 입력>>");
		String price = scn.nextLine();
		// 입력항목확인
		if (title.isBlank() || author.isBlank() || company.isBlank()) {
			System.out.println("항목 반드시 입력하세요");
			return; // 메소드 종료.
		}
		

		Book book = new Book();
		book.setBookCode(bookcode);
		book.setTitle(title);
		
		book.setAuthor(author);
		book.setCompany(company);
		book.setPrice(Integer.parseInt(price));
		
		if (dao.insert(book)) {
			System.out.println("등록성공");
		}else {
			System.out.println("등록예외");
		}
		
	} // end of add()

	private void edit() {
		System.out.println("도서코드 입력>>");
		String bookcode = scn.nextLine();
		if (bookcode.isBlank()) {
			System.out.println("도서코드 반드시 입력하세요");
			return;
		}
		System.out.println("수정할 저자 입력>>");
		String author = scn.nextLine();

		System.out.println("수정할 제목 입력>>");
		String title = scn.nextLine();

		System.out.println("수정할 금액 입력>>");
		String price = scn.nextLine();
		
		// 조회 및 수정
		
//		update 
		Book book = new Book();
		book.setBookCode(bookcode);
		book.setTitle(title);
		
		book.setAuthor(author);
		book.setPrice(Integer.parseInt(price));
		if (dao.update(book)) {
			System.out.println("수정성공");
		}else {
			System.out.println("수정예외");
		}
	}// end of edit

	private void delete() {
		String bookcode="";
		while(true) {
			System.out.println("도서코드 입력>>");
			bookcode = scn.nextLine();
			if (!bookcode.isBlank()) {
				
				break;
			}
			System.out.println("도서코드 반드시 입력하세요");
			
			
			
		}
		
			if (dao.delete(bookcode)) {
				System.out.println("삭제완료");
			}else {
				System.out.println("삭제 실패");
			}
	

	} // end of delete

	private void list() {
		// 순번정렬
		// 오름 차순 정렬 순번1 > 순번 2,위치를 바꾸기/ 순번 1 null인경우 바꾸기, 제외 :순번 2 null
		Book temp = null;
		
		int seqNo = 1;
		System.out.println("순번  코드     제목             저자    가격");
		System.out.println("=======================");
		List<Book> list = searchList("");
		for (Book books : list) {
			if (books != null) {

				System.out.println( seqNo++ +" " + books.showList());
			}
		}
	}

	// list와 listCompany 에서 활용할 공통메소드.
	private List<Book> searchList(String keyword) {
		List<Book> list=dao.list(keyword);
		
		return list;
	}// end of searchList.

	private void listCompany() {
		System.out.println("조회할 출판사 정보");
		String company = scn.nextLine();

		int seqNo = 1;
		System.out.println("순번 제목           저자    가격");
		System.out.println("=======================");
		List<Book> list = searchList(company);
		for (Book books : list) {
			if (books != null) {

				System.out.println(  seqNo++ +" " + books.showList());
			}
		}
	} // end of listCompany().

	private Book searchBook(String title) {
		return dao.select(title);
	}
	private void detailInfo() {

		
		System.out.println("조회할 책 제목입력>>");
		String title = scn.nextLine();
		if (title.isBlank()) {
			System.out.println("책제목을 반드시 입력하세요");
			return;
		}
		Book result = searchBook(title);
		if(result ==null) {
			System.out.println("조회결과 없음");
			return;
		}
		System.out.println(result.showBookInfo());
	}
		


	// 아이디, 비밀번호 입력.
	private User login(String id, String pw) {
		MemberJdbc dao =  new MemberJdbc();
		return dao.login(id, pw);
//		for (int i = 0; i < user.length; i++) {
//			if (user[i] != null && user[i].getUserId().equals(KuserId) && user[i].getPassword().equals(Kpassword)) {
//
//				return true;
//
//			}
//		}
//
//		return false; 
		//주석 처리는 배열을 이용해 로그인처리.
	}

	public void main(String[] args) { // 정적메소드
		// TODO Auto-generated method stub

		while (true) {
			System.out.println("아이디 입력>>");
			String id = scn.nextLine();
			System.out.println("비밀번호 입력>>");

			String pw = scn.nextLine();
			
			//User클래스, 맵타입을 활용해서..
			User user =login(id,pw);
			
			if (user != null) {
				System.out.println(user.getUserName()+",환영합니다. 로그인 성공했습니다.");
				break;
			}
			System.out.println("로그인 실패! 다시 시도해주세요");
		}

		

		boolean run = true; // 반복문을 위한 논리형 데이터 타입 변수 선언

		while (run) {

			System.out.println("1.도서등록 2.수정 3.삭제 4.목록 5.상세조회 6.상세조회(출판사) 9.종료");
			System.out.print("선택>>>");
			int menu = 9;

			// 예외처리
			while (true) {
				
				try {
					menu = Integer.parseInt(scn.nextLine());
					break;
				} catch (NumberFormatException e) {
					System.out.println("정수/숫자를 입력해야합니다");
				}
				
				
			}

			switch (menu) {
			case 1: // 등록
				add();
				break;
			case 2:// 수정 도서명으로 검색, 금액을 수정
				edit();
				break;
			case 3: // 삭제
				// 반드시 값을 입력받도록.
				delete();
				break;
			case 4: // 목록
				list();
				break;
			case 5:
				detailInfo();
				break;
			case 6: // 목록(출판사)
				listCompany();
				break;
			case 9: // 종료
				run = false;
			default:
				System.out.println("메뉴를 다시 선택하세요");

			}
		}
		System.out.println("end of prog");
	}// end of main().

	// init 초기값 메소드


}
