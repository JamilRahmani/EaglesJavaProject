package oopsInheritanceExample;

public class Birds extends Animal {
	
	private boolean canFly;
	
	//we inherit these variables
//	private String name;
//	private int age;
//	private int numberOfLegs;
	
	
	public Birds() {
		super();
		this.canFly = false;
	}
	
	// The job of any constructor is to initialize all of the variables of that class
	public Birds(boolean canFly) {
		this();
		
		this.canFly = canFly;
		
	}
	public Birds(String name) {
		this();
		super.setName(name);
		canFly = false;
	}
	
	public Birds(String name, int age, int numberOfLegs, boolean canFly) {
		super(name, age, numberOfLegs);
		this.canFly = canFly;
	}
	
	public String toString() {
		return "Name: "+super.getName() + " | Age: " + super.getAge() +" | Numbers: "+ super.getNumberOfLegs()+ " | Can fly: "+canFly;
	}
	
	
	
	
	
	
	

}
