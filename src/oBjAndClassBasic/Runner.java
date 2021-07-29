package oBjAndClassBasic;

public class Runner {
	
	public static void main(String[] args) {
		
		//ClassName identifier = new ClassName();
		
		Student obj1 = new Student();
		obj1.age = 10;
		obj1.firstName = "Ahmed";
		obj1.lastName = "Khan";
		
		Student obj2 = new Student("Jamil", "Rahman", 27);
		Student obj3 = new Student("Abdul", "Samad", 33);
		Student obj4 = new Student("Aziz", "Rahman", 28);
		
		System.out.println(obj1.firstName + " " + obj1.lastName + " " + obj1.age);
		System.out.println(obj2.firstName + " " + obj2.lastName + " " + obj2.age);
		System.out.println(obj3.firstName + " " + obj3.lastName + " " + obj3.age);
		System.out.println(obj4.firstName + " " + obj4.lastName + " " + obj4.age);
	}

}
