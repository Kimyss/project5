package instance;

public class Student {
	
//	학생(Student)이 가지는 속성 멤버변수 작성
	
	int studentID;			//학번
	
	String studentName;		//이름

	int grade;				//학년
	
	String address;			//주소
	
	
	
//	학생의 모든 정보 보여주는 함수 선언 (메소드)
	public void showStudentInfo() {
		System.out.println
		("학번: " + studentID + ", 이름:" + studentName + ", 학년:"+ grade + ", 주소:" + address);
	}
		
// 껍데기 : 메인함수에서 갖다쓰기 위한 함수(?)	
}
