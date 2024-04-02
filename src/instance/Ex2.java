package instance;

public class Ex2 {

	public static void main(String[] args) {
		
//		첫번째 학생 생성
		Student student1 = new Student();				//Student 자료형 student1 참조변수 
		
		student1.studentID = 1001;			//객체의 멤버 변수를 사용해서 학번 변경
		student1.studentName = "둘리";
		student1.grade = 2;
		student1.address = "인천 연수구";
		
		student1.showStudentInfo();
		
		System.out.println("객체의 주소는" + student1 + "입니다");
		
//		두번째 학생 생성
		Student student2 = new Student();				//Student 자료형 student1 참조변수 
		
		student2.studentID = 1002;			//객체의 멤버 변수를 사용해서 학번 변경
		student2.studentName = "조커";
		student2.grade = 3;
		student2.address = "고담시";
		
		student2.showStudentInfo();
		
		System.out.println("객체의 주소는 " + student2 + "입니다");
		
		
//		클래스:설계도 -> 모든 인스턴스(객체)의 주소는 다르다
		
		
	}

}
