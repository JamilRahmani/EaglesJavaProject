package oopsInheritanceExample;

public class Mammals extends Animal {

	private String hairColor;
	private String eyeColor;
	
	public Mammals() {
		super (); 
		hairColor = "";
		eyeColor = "";
	}
	
	public Mammals(String name, int age, int numberOfLegs, String hairColor, String eyeColor) {
		super(name, age, numberOfLegs);
		this.hairColor = hairColor;
		this.eyeColor = eyeColor;
	
	}
	
	public String toString() {
		return "Name: "+super.getName() + " | Age: " + super.getAge() +" | Numbers "+ super.getNumberOfLegs() +" | Hair Color: "+ hairColor+ " | Eye Color: "+eyeColor;
	}
	
	
}
