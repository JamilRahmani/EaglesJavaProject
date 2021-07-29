package oopsBasics;

public class RunnerEncapsulation {
	
public static void main(String[] args) {
	

	StudentEncapsulated obj = new StudentEncapsulated("Khan", "jan", 25, "123-45-6789");
	//
	System.out.println(obj.getFirstName());
	
	obj.setFirstName("David");
	System.out.println(obj.getFirstName());
	//**-**-6789
	System.out.println(obj.getSSN());
	
	System.out.println(obj);
	
	
	
	
	
	
	
}
}
