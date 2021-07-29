package OOPsPolymorphism2;

public class Teacher extends Person{
	
	private int numberOfClasses;
	private String major;
	
	
	

	public Teacher() {
		super();
		this.numberOfClasses = 0;
		this.major = "";
	}
	
	public Teacher(String name, int age, int numberOfClasses, String major) {
		super(name, age);
		this.numberOfClasses = numberOfClasses;
		this.major = major;
	}

	
	public int getNumberOfClasses() {
		return numberOfClasses;
	}

	public void setNumberOfClasses(int numberOfClasses) {
		this.numberOfClasses = numberOfClasses;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
}
