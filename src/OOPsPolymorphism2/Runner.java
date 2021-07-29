
package OOPsPolymorphism2;

public class Runner {
	
	
	// i wanna design a method that will take an object of student or teacher
		// and perform something with it
	
//	public void printName(Student obj) {
//		System.out.println(obj.getName());
//	}
//	
//	public void printName(Teacher obj) {
//		System.out.println(obj.getName());
//	}
	
	//This is the best way to do it cuz we dont have to do the same thing again and again
	public void printName(Person obj) {
	System.out.println(obj.getName());
}

	public static void main(String[] args) {
		
		Student st1 = new Student("Khan", 44, 7.8);
		Teacher t1 = new Teacher("Ahmed", 35, 4, "CS");
		
		Runner r = new Runner();
		
		r.printName(t1);
		
	}

}
