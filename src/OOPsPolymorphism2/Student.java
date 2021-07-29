package OOPsPolymorphism2;

public class Student extends Person{
	
	private double gpa;
	

	public Student() {
		super();
		this.gpa = 0.0;
	}

	public Student(String name, int age, double gpa) {
		super(name,age);
		this.gpa = gpa;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	

}
