package reference;

public class Ex3 {

	public static void main(String[] args) {
		
		int num = 10;
		method1(num);		//값 전달
		System.out.println(num);
		
		Subject math = new Subject("수학", 100);
		method2(math);
		System.out.println(math);

	}

	public static void method1(int n) { // 추가 메소드 1개 매개변수로 기초타입사용
		n = 5;
	}

	public static void method2(Subject sub) { // 추가메소드 2개	매개변수로 참조타입사용
		sub.scorePoint = 50;
	}

}
