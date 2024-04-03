package constructor;
/*
 * 자동차(Car)을 정의하는 클래스를 만드세요.
 * 속성: 제조사, 모델명, 색, 최고속도
 * 디폴트 생성자와 모든 멤버변수를 입력받는 생성자를 추가하세요
 * 
 * 모든 생성자를 사용하여 두개의 인스턴스를 생성하고 모든 값을 초기화하세요
 * (현대, 쏘나타, 흰색, 200)
 * (기아, 레이, 검정색, 150)
 * */

public class Quiz2 {

	public static void main(String[] args) {
		
		Car sonata = new Car();
		sonata.factory = "현대";
		sonata.modelName= "소나타";
		sonata.color = "흰색";
		sonata.maxSpeed = 200f;
		
		
		
		Car ray = new Car("기아", "레이", "검정", 150f);
		
		System.out.println();

	}
}

class Car{
	String factory;
	String modelName;
	String color;
	float maxSpeed;


public Car(){
	
}

public Car(String fa, String mn, String col, float ms) {
	String factory = fa;
	String modelName = mn;
	String color = col;
	float maxSpeed = ms;
}
}