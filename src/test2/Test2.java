package test2;

public class Test2 {

	public static void main(String[] args) {
		
		Person person = new Person();		//person class의 객체를 생성 참조변수
		
		person.name =  "둘리";
		person.height =  170;
//		person. weight -> private이기 때문에 사용불가 밑의 class Person에서만 사용가능

	}

}

class Person{			//drfault값으로 person클래스추가
	public String name;
	int height;
	private double weight;		//멤버 변수마다 접근제어자가 다른상태  public > default > private:person class 내부에서만 사용가능
	
	public void showInfo() {
		System.out.println("이름: " + name + "키: " + height +"몸무게: " + weight);
	}
}
