package oopsBasics;

public class StudentEncapsulated {
	private String firstName;
	private String lastName;
	private int age;
	private String ssn;
	
	public StudentEncapsulated(String ssn) {
		firstName = "";
		lastName ="";
		age = 0;
		this.ssn = ssn;
	}
	
	public StudentEncapsulated(String firstName, String lastName, int age, String ssn) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.ssn = ssn;
	}
	 public String getFirstName() {
		 return firstName;
	 }
	
//	 public String getFirstName(int pin) {
//		 if (pin == 8620) {
//		 return firstName;
//	 }else {
//		 return "Wrong pin";
//	 }
//	 }
	public void setFirstName(String firstName) {
		this.firstName = firstName;
		
	}
	
	 public String getLastName() {
		 return lastName;
	 }
	public void setLastName(String lastName) {
		this.firstName = lastName;
		
	}
	 public int getAge() {
		 return age;
	 }
	public void setAge(int age) {
		this.age = age;
		
	}
	
	public String getSSN() {
		String temSSN = "***-**-" + ssn.substring(7);//Starting from index 7 the ssn
	//	String temSSN =  ssn.substring(0, 3) + "-**-****";
	//	String temSSN =  ssn.substring(0, 3) + "-**-"+ssn.substring(7);
		return temSSN;
	}
	
	@Override
	public String toString() {
		return "{firstNamw: " + firstName + ", LastName: " + lastName+ ", SSN: " + getSSN()+"}";
	}
	
	//bean class
	//design pattern
	
	
	
	
	
	
	
	
	
	
	

}

