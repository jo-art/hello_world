package com.yedam.bookApp;

import java.util.Scanner;

/*
 * 등록, 수정,삭제, 목록
 */
public class BookMain {
	//배열 저장 공간
	static Book[] bookStore = new Book[100]; 
	static Scanner scn = new Scanner(System.in);
	//순번생성
	public static int getSequenceNo() {
		int max =0;
		for(int i=0;i<bookStore.length;i++) {
			if (bookStore[i]!=null&&bookStore[i].getOrderNo()>max) {
				max =bookStore[i].getOrderNo();
			}
		}
		return max +1; //현재 마지막 번호+1
	}//end of getSequenceNo()
	
	public static void add() {
		System.out.println("제목 입력>>");
		String title =scn.nextLine();
		for(int i=0; i<bookStore.length;i++) {
			if(bookStore[i].getTitle().equals(title)) {
				System.out.println("이미 등록된 책입니다.");
				return;
				
			}
		}
		System.out.println("저자 입력>>");
		String author =scn.nextLine();
		
		System.out.println("출판사 입력>>");
		String company=scn.nextLine();
		
		System.out.println("가격 입력>>");
		String price = scn.nextLine();
		//입력항목확인
		if(title.isBlank() || author.isBlank() || company.isBlank() ) {
			System.out.println("항목 반드시 입력하세요");
			return; //메소드 종료.
		}	
						

		// 정수 변환 후 도서 객체 생성
		int priceValue = Integer.parseInt(price);
		Book book = new Book(title, author, company, priceValue,getSequenceNo());
		
		for(int i=0;i<bookStore.length;i++) {
			if(bookStore[i]==null) {
				bookStore[i]=book;
				System.out.println("도서 입력 완료");			
				break;
			} 
		}
	} //end of add()
	public static void edit() {
		System.out.println("제목 입력>>");
		String title =scn.nextLine();
		if(title.isBlank()) {
			System.out.println("책제목을 반드시 입력하세요");
			return;
		}
		System.out.println("수정할 저자 입력>>");
		String author =scn.nextLine();
		
		System.out.println("수정할 출판사 입력>>");
		String company =scn.nextLine();
		
		System.out.println("수정할 금액 입력>>");
		String price =scn.nextLine();
		
		//조회 및 수정
		boolean isExist1=false;
		
	//	for(int i=0;i<bookStore.length;i++) {
	//		if(bookStore[i]!=null && bookStore[i].getTitle().equals(title)) {
	//			System.out.println("금액 수정 >>");
	//			price=Integer.parseInt(scn.nextLine());
	//			bookStore[i].setPrice(price);
	//			System.out.println("금액 수정 완료");
	//			break;
	//		}
	//	}
		for(int i=0; i<bookStore.length;i++) {
			if(bookStore[i]!=null&&bookStore[i].getTitle().equals(title)) {
				
				if(!author.isBlank()) {
					bookStore[i].setAuthor(author);
				}
				if(!company.isBlank()) {
					bookStore[i].setCompany(company);
				}
				if(!price.isBlank()) {
					bookStore[i].setPrice(Integer.parseInt(price));
				}
				isExist1=true;
				System.out.println("수정완료");
				break;
			}
		}
		if(!isExist1) {
			System.out.println("찾을 수 없습니다");
		}
	}// end of edit
	
	public static void delete() {
		System.out.println("삭제할 책 제목 입력>>");
		String title =scn.nextLine();
		if(title.isBlank()) {
			System.out.println("반드시 제목을 입력하세요.");
			return;
		}
		
		boolean isExist = false;
		for(int i=0; i<bookStore.length;i++) {
			if(bookStore[i]!=null && bookStore[i].getTitle().equals(title)) {
				bookStore[i]=null; //삭제
				System.out.println("삭제했습니다.");
				isExist=true;
				break;
			}
		}
		if(!isExist) {
			System.out.println("찾는 도서 없습니다");
		}
		
	} //end of delete
	public static void list() {
		//순번정렬
		//오름 차순 정렬 순번1 > 순번 2,위치를 바꾸기/ 순번 1 null인경우 바꾸기, 제외 :순번 2 null
		Book temp= null;
		for(int i=0;i<bookStore.length-1;i++) {
			for(int j=0;j<bookStore.length-1;j++) {
				if(bookStore[j+1]==null) {
					continue; //제외 :순번 2 null 변경X
				}
				if(bookStore[j]==null  || bookStore[j].getOrderNo()>bookStore[j+1].getOrderNo()) { //변경
					temp= bookStore[j];
					bookStore[j] =bookStore[j+1];
					bookStore[j+1] = temp;
				}
				
			}
		}
		int seqNo =1;
		System.out.println("순번 제목           저자    가격");
		System.out.println("=======================");
		Book[] list = searchList(null);
		for(Book books:list) {
			if(books != null) {
				
			System.out.println(seqNo++ +" " +books.showList());
			}
		}
	}
	//list와 listCompany 에서 활용할 공통메소드.
	public static Book[] searchList(String keyword) {
		Book[] list = new Book[100];
		int idx =0;
		for(int i=0; i<bookStore.length; i++) {
			if(bookStore[i]!=null)
				if(keyword ==null || bookStore[i].getCompany().equals(keyword)){
					list[idx++] =bookStore[i];
				}
		}
		return list;
	}//end of searchList.
	
	public static void listCompany() {
		System.out.println("조회할 출판사 정보");
		String company = scn.nextLine();
		
		int seqNo = 1;
		System.out.println("순번 제목           저자    가격");
		System.out.println("=======================");
		Book[] list = searchList(company);
		for(Book books:list) {
			if(books != null) {
				
			System.out.println(seqNo++ +" " +books.showList());
			}
		}
	} // end of listCompany().
	
	public static void detailInfo() {
	
		
		boolean isExist3=false;
		System.out.println("조회할 책 제목입력>>");
		String title =scn.nextLine();
		if(title.isBlank()) {
			System.out.println("책제목을 반드시 입력하세요");
			return;
		}
		for(Book books:bookStore) {
			if(books!=null&&books.getTitle().equals(title)) {
				isExist3=true;
				System.out.println(books.showBookInfo());
			} 
						
		}
		if(!isExist3) {
			System.out.println("책제목이 없습니다.");
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		init();
		boolean run= true; //반복문을 위한 논리형 데이터 타입 변수 선언

		while(run) {
			System.out.println("1.도서등록 2.수정 3.삭제 4.목록 5.상세조회 6.상세조회(출판사) 9.종료");
			System.out.print("선택>>>");
			int menu= Integer.parseInt(scn.nextLine());
			switch(menu) {
			case 1: //등록				
				add();
				break;
			case 2://수정 도서명으로 검색, 금액을 수정
				edit();
				break;
			case 3: //삭제
				//반드시 값을 입력받도록.
				delete();				
				break;
			case 4: //목록
				list();
				break;
			case 5:
				detailInfo();
				break;
			case 6: //목록(출판사)
				listCompany();
				break;
			case 9: //종료
				run=false;
			default:
				System.out.println("메뉴를 다시 선택하세요");
			
			}
		}
		System.out.println("end of prog");
	}//end of main().
	
	//init 초기값 메소드
	public static void init() {
		bookStore[0] = new Book("이것이자바다","신용권","한빛출",2000,1);
		bookStore[1] = new Book("스크림트기초","박기초","우리출",2600,2);
		bookStore[2] = new Book("Html,css","김하늘","가람출",2500,3);
		bookStore[3] = new Book("누가내머리에똥쌌니","김하늘","가람출",2500,3);
		bookStore[4] = new Book("채식주의자","김하늘","가람출",2500,3);
		bookStore[5] = new Book("간달프","김하늘","가람출",2500,3);
	}

}
