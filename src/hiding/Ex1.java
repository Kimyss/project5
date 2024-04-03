package hiding;

public class Ex1 {

	public static void main(String[] args) {
		MyDate date = new MyDate();
		
		date.month = 2;
		
		date.day = 31; 		//2월은 28일이나 29일가지인데 31일이 저장됨
		System.out.println("현재 날짜는 " + date.month + "월" + date.day + "일 입니다.");
	}

}

class MyDate{
	public int month;
	public int day;
}
