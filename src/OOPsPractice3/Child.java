package OOPsPractice3;

public class Child extends Parent{
	
	
	private double grade;
	private int numberOfClasses;
	
	
	public Child() {
		super();
		this.grade = 0.0;
		this.numberOfClasses = 0;
	}
	
	// with this(): we are calling the default constructor from the same class 
	public Child(double grade) {
		this();
		this.grade = grade;
	}
	
//	public Child(double grade, int numberOfClasses, String name) {
//		super(name);
//		this.grade = grade;
//		this.numberOfClasses = numberOfClasses;
//	}
	
	public Child(double grade, int numberOfClasses, String name, int age) {
		this();
		this.grade = grade;
		this.numberOfClasses = numberOfClasses;
		super.setName(name);
		super.setAge(age);
	}
	
	public String toString() {
		return "Name: " + super.getName() + "\n" + "Age: " + super.getAge() + "\n"+ "Grade: "+ grade + "\n"+"Class: " + numberOfClasses;
	}
	

}
