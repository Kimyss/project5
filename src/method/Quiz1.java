package method;
/*
 * 사칙연산 수행하는 함수만들고 호출
 * 두 숫자를 입력받아 덧셈 뺄셈 곱셈 나눗셈 나머지출력
 * 예시 10, 5 => 15 5 50 2 0 
 * */
public class Quiz1 {
	public static void arithmetic(int num1, int num2) {
		int add = num1 + num2;
		int minus = num1 - num2;
		int multiple = num1 * num2;
		int div = num1 / num2;
		int reminder = num1 % num2;
		
		System.out.println(add);
		
	}

	public static void main(String[] args) {
	
		arithmetic(10, 20);

	}

}
