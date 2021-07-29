package oBjAndClassBasic;

public class ReferencingExample {

	public static void main(String[] args) {

		Student obj1 = new Student("jamil", "Rahman", 27);
		Student obj2 = obj1;
		Student obj3 = obj2;
		
		
		
		obj2.firstName = "Khan";
		obj3.lastName = "Jan";
		
		System.out.println(obj1.firstName+obj1.lastName+obj1.age);
	}

}
