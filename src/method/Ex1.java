package method;

public class Ex1 {
	
//	매개변수가 없고 반환값이 없는 메소드
	public static void method1() { 		//void: 리턴값(리턴타입) method1 : 메소드이름 ():매개변수
		System.out.println("매개변수와 반환값이 둘 다 없는 메소드 입니다");
		return;		//생략가능
	}
	
//	매개변수가 없고 반환값이 있는 메소드
	public static String method2() {	//반환값이 있으면 return뒤의 값과 일치 해야한다 String타입 - "매개변수~입니다"
		return "매개변수가 없지만 반환값이 있는 메소드입니다.";
	}
	
//	매개변수가 있고 반환값이 없는 메소드			//반환값x -> return값 : void		(,) :매개변수
	public static void method3(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println("sum : " + sum);
	}
	
//	매개변수가 있고 반환값이 있는 메소드			//반환타입: int타입 메소드이름: method4 (,): 매개변수 
	public static int method4(int num1, int num2) {
		return num1 + num2;
	}

	public static void main(String[] args) {
//		메인함수안에서 함수호출
		method1();		//함수이름();  
		String str = method2();  //매개변수는 없지만 return 있어. 함수호출 하고 결과값 받아. 그래서 앞쪽에 미리 변수 선언. 리턴값을 저장하는 구조
		method3(1,2);	//함수이름(매개변수타입,매개변수타입);
		int i = method4(1,2);	//
//		**인자의 갯수, 타입이 맞아야 한다**
		

		
		

	}

}
