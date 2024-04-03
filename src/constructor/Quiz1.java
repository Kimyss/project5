package constructor;

/*
 * 책(Book)을 정의하는 클래스를 만드세요.
 * 속성: 제목, 가격, 출판사, 페이지수
 * 디폴트 생성자와 모든 멤버변수를 입력받는 생성자를 추가하세요
 * 
 * 모든 생성자를 사용하여 두개의 인스턴스를 생성하고 모든 값을 초기화하세요
 * (스프링부트, 30000, 한빛출판사, 200)
 * (자바프로그래밍, 10000, 금빛출판사, 300)
 * */

public class Quiz1 {

	public static void main(String[] args) {
		
		Book book1 = new Book();
		book1.title = "스프링부트";
		book1.price = 30000;
		book1.company = "한빛 출판사";
		book1.pageNum = 200;
		
		
		Book book2 = new Book("자바프로그래밍", 10000, "금빛출판사", 300);
				
		
	}

}

class Book {
	String title;
	int price;
	String company;
	int pageNum;

	public Book() {
	}
	
	public Book(String ti, int pr, String co, int pa) {
		title = ti;
		int price = pr;
		String company = co;
		int pageNum = pa;
			
	}
	

}
	
