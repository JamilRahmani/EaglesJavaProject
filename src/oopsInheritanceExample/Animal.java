package oopsInheritanceExample;

public class Animal {
	
	private String name;
	private int age;
	
	private int numberOfLegs;
	
	
	public Animal() {
		this.name = "";
		this.age = 0;
		this.numberOfLegs = 0;
		
	}
	
	public Animal(String name, int age, int numberOfLegs) {
		this.name = name;
		this.age = age;
		this.numberOfLegs = numberOfLegs;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	public void setNumberOfLegs(int numberOfLegs) {
		this.numberOfLegs = numberOfLegs;
	}
	
	public int getNumberOfLegs() {
		return numberOfLegs;
	}
	
	@Override
	public String toString() {
		return "Name: "+name + " | Age: " + age +" | Numbers "+ numberOfLegs;
	}
	
	
	
	
	

}
