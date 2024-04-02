package instance.Quiz;

public class Order {
	
	int orderNo;
	
	String day;
	
	String name;
	
	String address;
	
	public void showOrderInfo() {
		System.out.println("주문번호: " + orderNo + " 주문날짜: " + day + " 주문자 이름: " + name + " 배송지: " + address);
	}
	

}
