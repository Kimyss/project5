package reference;

public class Ex1 {

	public static void main(String[] args) {
		
		Subject math = new Subject("수학", 85);
		
		Subject korean = new Subject("국어", 100);
		
		Student student = new Student(1001, "손오공", math, korean);


	}

}

class Subject{
	String subjectName;		//과목
	
	int scorePoint;			//점수
	
//		모든 멤버를 초기화하는 생성자 만들기
	
	public Subject(String su,int sc){		//생성자
		
		String subjectName = su;	
		int scorePoint = sc;
	}
}

class Student {
	int studentID; // 학번
	String student;
	Subject math; // Subject를 참조변수로 하는 변수(?) 자료형 class 복합적인 정보를 가지고있음 (과목과 점수)
	Subject korean;
	

	public Student(int studentID, String student, Subject math, Subject korean) {

		this.studentID = studentID;
		this.student = student;
		this.math = math;
		this.korean = korean;
	}

}






		