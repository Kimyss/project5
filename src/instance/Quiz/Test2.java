package instance.Quiz;

public class Test2 {

	public static void main(String[] args) {
		
		Order orderman = new Order();
		
		orderman.orderNo = 1234;
		
		orderman.day = "2024. 4. 2";
		
		orderman.name = "꼬부기";
		
		orderman.address = "서울시 서초구 방배동";
		
		orderman.showOrderInfo();
		System.out.println(orderman);
				

	}

}
