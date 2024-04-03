package constructor;

public class Ex2 {

	public static void main(String[] args) {
		
		Person person1 = new Person();
		person1.name = "피카츄";
		person1.height = 180;
		person1.weight = 80;

		
		Person person2 = new Person("파이리");
		person2.height = 160;
		person2.weight= 50;
		
		Person person3 = new Person("꼬부기", 170, 60);
	}

}


class Person {
//	멤버변수 객체가 살아있을떄까지 살아있음
	String name;
	int height;
	int weight;


//	생성자함수를 세개 만들기 
	public Person() {
		
	}
	
	public Person(String nm) {			//지역변수 nm 한번쓰고 사라져 사람 이름을 초기화 하는 생성자
		name = nm;
	}
	
	public Person(String nm, int he, int we) {		//사람의 이름, 몸무게, 키를 초기화시키는 생성자
		name = nm;
		height = he;
		weight = we;
	}
	
}

