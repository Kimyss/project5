package method;
/*
 *	나누기 함수 만들고 호출하세요
 *	두 수 '입력받아' 첫째수에서 두번째수를 나눈 몫을 '출력' return값 없어도 O
 *	단, 두번째 수가 0이면
 *	"나누는 수는 0이 될수 없습니다." 출력 후 함수종료 return; 반환 / 함수종료역할
 */

public class Quiz5 {
	public static void divide(int n1, int n2) {
		if(n2 == 0) {
			System.out.println("나누는 수는 0 될수 없습니다");
			return;
		}

		int result =  n1 / n2;
		System.out.println(result);
}

	public static void main(String[] args) {
		
		divide(10, 5);

	}

}
