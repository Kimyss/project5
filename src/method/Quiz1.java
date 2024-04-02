package method;
/*
 * 사칙연산 수행하는 함수만들고 호출
 * 두 숫자를 입력받아 덧셈 뺄셈 곱셈 나눗셈 나머지출력
 * 예시 10, 5 => 15 5 50 2 0 
 * */
public class Quiz1 {
	public static void arithmetic(int n1, int n2) {
		System.out.println(n1 + "+" + n2 + "=" + (n1 + n2));
		System.out.println(n1 + "-" + n2 + "=" + (n1 - n2));
		System.out.println(n1 + "*" + n2 + "=" + (n1 * n2));
		System.out.println(n1 + "/" + n2 + "=" + (n1 / n2));
		System.out.println(n1 + "%" + n2 + "=" + (n1 % n2));
		
		System.out.println();
		
	}

	public static void main(String[] args) {
	
		arithmetic(10, 20);

	}

}
