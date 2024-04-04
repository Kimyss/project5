package hiding;

public class Ex3 {

	public static void main(String[] args) {
		
		Person person = new Person();
		

	}

}

class Person {
//	??private사용? 안하면?
	
	private String name;
	private int height;
	private double weight;

//	이클립스의 메서드 자동완성기능
//	source 메뉴 - generate getter and setter

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

}
