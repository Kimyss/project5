package method;
/*
 * 두 수를 비교 하는 함수를 만들고 호출하세요
 * 둘 중에 더 큰수를 구하고 반환하세요 반환하세요 말없었으면 반환할 필요 없는 문제
 * 예시) 
 * 10 , 5 = >10
 * 2, 7 = > 7
 * 100 ,200 => 200
 * 
 * 메인함수에서 추가작업을 할 것인지 판단 추가작업필요할 시 return; 
 * */

public class Quiz2 {
	public static int max(int n1, int n2) {
		
		  if(n1 > n2) {
			return n1;
		  }else if(n1 == n2) {
			return n1;
		}else {
			return n2;
		}
	}

	public static void main(String[] args) {
		int maxNum = max(2, 1);
		System.out.println(maxNum);

	}

}
