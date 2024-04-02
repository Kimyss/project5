package instance.Quiz;

public class Car {
	
	boolean status;		//현재상태
	
//	현재상태를 *변경*하는 메소드 선언
	public void setStatus(boolean stt) {
		status = stt;
	}
	
//	현재상태를 *출력*하는 메소드 선언
	public void showStatus() {
		System.out.println(status);
	}


}
