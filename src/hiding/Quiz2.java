package hiding;
//자동차(Car)을 정의하는 클래스를 만드세요.
//속성: 제조사, 모델명, 색, 최고속도
//기능: 각 멤버변수의 getter와 setter
//
//자동차 클래스를 사용하여 다음 정보를 가지는 인스턴스를 생성하세요.
//이때, 자동차의정보는 setter를 사용해서 변경하세요.
//(현대, 소나타, 흰색, 200)
//자동차의 정보를 출력하세요.
//이때, 자동차의 정보는 getter를 사용해서 출력하세요.

public class Quiz2 {

	public static void main(String[] args) {
		
		Car sonata = new Car();
		sonata.setModelName("소나타");
		sonata.setCompany("현대");
		sonata.setColor("흰색");
		sonata.setMaxSpeed(200);
		
		System.out.println(sonata.getModelName());
//		나머지 출력문작성요망

	}

}

class Car{
	private String company;
	private String modelName;
	private String color;
	private int maxSpeed;
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	public String getModelName(){
		return modelName;
	}
	public void setModelName(String modelName1) {
		modelName = modelName1;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
}