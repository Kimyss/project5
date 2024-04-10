package method;

/*
 * 빼기 메소드를 만들고 호출  3가지 필요 함수이름, 매개변수, 리턴값
 * 두 수를 '입력받아' 첫번째 수에서 두번째 수를 뺀 후 그 결과를 '반환'하세요
 * 단, 첫번째 수가 두번째 수보다 작으면 -999를 반환하고 함수를 종료하세요
 * 예시)
 * 20, 10 => 10
 * 5, 1 => 4
 * 10, 20 => 999
 * */

public class Quiz4 {
	
	public static int minus(int n1, int n2) {

//		1차로 작성
		int result = n1 - n2;		//두수의 차
		
		return result;				//결과값 반환 
		
//		조건문작성 후 리턴문 위 위치
	}
	
		
		
		
	public static void main(String[] args) {
		int num1 = 20;
		int num2 = 30;

		int result = minus(num1, num2); //함수 호출
		System.out.println(num1 + " - " + num2 + " = " + result + "입니다");

	}

}
