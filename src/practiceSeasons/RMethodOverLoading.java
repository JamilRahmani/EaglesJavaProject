package practiceSeasons;

public class RMethodOverLoading {

	public static void main(String[] args) {
		RMethodOverLoading obj = new RMethodOverLoading();
		obj.display();
		obj.display("Batch 6 : Eagles");
		obj.display("Batch 6 : Eagles", 2021);
	}
	//method overloading
	//1 - the signature should different
	//static binding = compile time polymorphism
	
	public void display() {
		System.out.println("This is my first method\n");
	}
	public void display(String className) {
		System.out.println("This is my first method");
		System.out.println(className+"\n");
	}
	public void display(String className, int classCode) {
		System.out.println("This is my first method");
		System.out.println(className);
		System.out.println(classCode);
	}
	public void display(String className, int classCode, int year) {
		System.out.println("This is my first method");
		System.out.println(className);
		System.out.println(classCode);
	}

}
