package instance.Quiz;

public class Test3 {

	public static void main(String[] args) {
		
		Book book1 = new Book();
		
		book1.title = "자바프로그래밍";
		book1.price = 20000;
		book1.company = "한빛컴퍼니";
		book1.pageNo = 300;
		
		book1.showBookInfo();
		System.out.println(book1);

		
		Book book2 = new Book();
		
		book2.title = "스프링";
		book2.price = 15000;
		book2.company = "한빛컴퍼니";
		book2.pageNo = 500;
		
		book2.showBookInfo();
		System.out.println(book2);
		
	}
}
		

