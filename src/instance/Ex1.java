package instance;

public class Ex1 {

	public static void main(String[] args) {
		
		Student student = new Student();
		
		// Student 객체생성  참조변수(객체의 주소저장) 가리킴-> 객체 = new Student(생성자)   : 클래스형변수이름 = 생성자;
		
		student.studentID = 1001;			//객체의 멤버 변수를 사용해서 학번 변경
		student.studentName = "둘리";
		student.grade = 2;
		student.address = "인천 연수구";
		
		
		System.out.println("studentID = " + student.studentID);
		System.out.println("studentName = " + student.studentName);
		System.out.println("grade = " + student.grade);
		System.out.println("address = " + student.address);
		System.out.println();
		student.showStudentInfo();
		
		System.out.println("객체의 주소는" + student + "입니다");

	}

}
