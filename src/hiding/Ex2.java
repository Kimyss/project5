package hiding;

public class Ex2 {

	public static void main(String[] args) {
		
		MyDate2 date = new MyDate2();
		
		date.setMonth(2);
		
		date.setDay(30);
		
		System.out.println("현재 날짜는 " + date.getMonth() + "월" + date.getDay() + "일 입니다.");
		
		date.setDay(10);
		
		System.out.println("현재 날짜는 " + date.getMonth() + "월" + date.getDay() + "일 입니다.");
		

	}

}

//		두번째 날짜 클래스. 이름이 중복되지않게 2를 붙인다. (Ex1 MtDate와 겹침)

class MyDate2{
	
	private int month;		//월		
	private int day;		//일
	
//	private 접근범위 가장 좁다 My Date 안에서만 사용가능
//	밖에서도 사용하고 싶으면 public 사용
	
	public int getMonth() {		//변수명 get 붙이고 리턴값을입력 멤버변수 그리고 month입력
		return month;
	}
	
	public void setMonth(int month) {		//변수명 set붙이고 필드명 넣는다, 저장한다의 의미이기 때문에 입력값있음. 입력값을 외부에서 받고 this.month에 저장
		this.month = month;
	}
	
	public int getDay(){
		return day;
	}
	
	public void setDay(int day) {		//void는 리턴값이 없다는 뜻이지만 경우에 따라 return 입력하여 강제종료시킬수 O
		
		if(month ==2 ) {
			if(day < 1 || day > 28) {
				System.out.println("2월에는 " + day + "일이 없습니다 !");
				return;
			}
		}
//		새입력값을 만나서 통과되면 day 만나고 그렇지 않으면 만나지않음
		
		this.day = day;	//일자변경메서드
	}
}
