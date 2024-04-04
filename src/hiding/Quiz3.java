package hiding;

// Mydate 클래스의 setMonth 메소드에 다음과 같이 조건을 추가하세요.
//
//1~12월이 들어오면 값을 변경하고,
//그외의 값이 들어오면 "잘못된 월입니다" 메세지를 출력합니다.

public class Quiz3 {

	public static void main(String[] args) {
		
		MyDate10 date = new MyDate10();
		
		date.setMonth(13);
		date.setDay(2);
		System.out.println(date.getMonth() + "월 " + date.getDay() + "일 ");
		

	}

}
//	클래스 만들시 에러나면 패키지분리 or 클래스이름변경

class MyDate10{
	private int month;			
	private int day;
	
	public int getMonth(){
		return month;
	}
	
	public void setMonth(int month){
		
		if(month < 1 || month >12) {
			System.out.println(month + "월은 잘못된 월입니다.");
			return;		//값 변경x 함수종료
		}
		
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}
	
}




