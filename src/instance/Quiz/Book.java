package instance.Quiz;

public class Book {
	
	String title;
	
	int price;
	
	String company;
	
	int pageNo;
	
	public void showBookInfo() {
		System.out.println("제목: " + title + " 가격: " + price + " 출판사: " + company + " 페이지수: " + pageNo);
	}

}
