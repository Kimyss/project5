package instance.Quiz;

public class Test {

	public static void main(String[] args) {
		Person person1 = new Person();
		
		person1.name = "james";
		person1.age = 40;
		person1.isMarried = true;
		person1.child = 3;
		
		person1.personInfo();
		System.out.println(person1);


	}

}
