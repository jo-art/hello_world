package com.yedam.bookApp;

/*
 * 책 제목,저자, 출판사, 가격,
 */
public class Book {
	// 필드 = 속성.
	private String title; // 책제목
	private String author; //저자
	private String company; //출판사
	private int price; //가격
	private int orderNo; // 순번
	
	//기본생성자
	public Book(){}

	//필드를 매개값으로 받음.생성자 선언
	private  Book(String title, String author,String company,int price) {
		this.title=title;
		this.author=author;
		this.company=company;
		this.price=price;
			
	}
	
	
	public Book(String title, String author, String company, int price, int orderNo) {

//		this.title = title;
//		this.author = author;
//		this.company = company;
//		this.price = price;
		this(title,author,company,price); //this:생성된 인스턴스
		this.orderNo = orderNo;
	}
	
	private void getInstance() {
		// TODO Auto-generated method stub

	}
	
	//메소드
	public String showList() {
		return title+" "+author+" "+price;
	}
	public String showListWithNo() {
		return orderNo+" "+ title+" "+author+" "+price;
	}
	//전체 도서 정보 출력 메소드
	public String showBookInfo() {
		String msg="제목은"+title+"/ 저자는"+author+"/ 출판사는"+company+"/ 가격은"+price ;
		return msg;
	}
	
	//정보 가져오는 메소드.
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public String getCompany() {
		return company;
	}
	public int getPrice() {
		return price;
	}
	
	//셋메소드
	public void setTitle(String title){
		this.title=title;
	}
	public void setAuthor(String author){
		this.author=author;
	}
	public void setCompany(String company){
		this.company=company;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	//순번메소드
	public int getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}
	
	
}
