package method;
/*
 * 합을 구하는 함수 만들고 호출하세요.
 * 두 수를 입력받아 n1부터 n2까지의 합을 반환하세요.
 * 예시)
 * 5,10 = > 5+6+7+8+9+10
 * */

public class Quiz3 {
	
	public static int sumSum(int n1, int n2) {
		for(n1 =1; n1 <= n2; n1++ ) {
		}
		return n1 + n2;
	}

	public static void main(String[] args) {
		int sum = sumSum(1, 3);
		System.out.println(sum);

	}

}
