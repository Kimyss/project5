package reference;
/*
 * 회원(Member)을 정의하는 클래스를 만드세요.
 * 속성: 회원번호, 이름, 대여한 책1, 책2, 책3
 * 책(Book)을 정의하는 클래스를 만드세요.
 * 속성: 제목, 가격, 출판사, 페이지수
 * 
 * 도서관 회원을 생성하고, 책 3권을 추가하세요.
 * */

public class Quiz1 {

	public static void main(String[] args) {
		
		Book book1 = new Book("흥부놀부", 35000, "동화출판사", 100);
		Book book2 = new Book("시집", 18000, "시인출판사", 200);
		Book book3 = new Book("전래동화", 10000, "전래출판사", 300);

	}

}

class Member {
	int memberNo;
	String name;

	Book book1;
	Book book2;
	Book book3;

	public Member(int memberNo, String name, Book book1, Book book2, Book book3) {
		super();
		this.memberNo = memberNo;
		this.name = name;
		this.book1 = book1;
		this.book2 = book2;
		this.book3 = book3;
	}

}

class Book {
	String title;
	int price;
	String company;
	int page;

	public Book(String title, int price, String company, int page) {
		super();
		this.title = title;
		this.price = price;
		this.company = company;
		this.page = page;
	}

}

