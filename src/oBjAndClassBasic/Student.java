package oBjAndClassBasic;

public class Student {
	
	String firstName;
	String lastName;
	int age;
	
	// what is constructor?
		//what does construtor returns?
		// A constructor is instance of a class
	
	// acces--modifier name-of-the-class (argument) { body of the method }
	// the job of the constructor is to initialize all of the variable in your class
	
	//default constructor/ non-parameterized constructor
	public Student() {
		firstName = "";
		lastName = "";
		age = 0;
		
		
	}
	
	//Parameterized Constructor
	public Student (String fName, String lName, int studentAge) {
		firstName = fName;
		lastName = lName;
		age = studentAge;
		
		
	}

}
