package constructor;

public class Ex3 {

	public static void main(String[] args) {

	}

}


class Board {
	int no;
	String title;
	String content;
	String Writer;
	
	public Board() {
		super();
	}
//	디폴트생성자
	
	public Board(String title) {
		super();
		this.title = title;
	}
//	제목을 인자로 전달받아서 초기화하는 생성자

	public Board(int no, String title, String content, String writer) {
		super();
		this.no = no;
		this.title = title;
		this.content = content;
		Writer = writer;
	}
//	모든 멤버변수를 전달받아서 초기화하는 생성자
	
	
}
