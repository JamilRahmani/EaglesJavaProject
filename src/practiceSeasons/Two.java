package practiceSeasons;

public class Two extends One{
	
public static void main(String[] args) {
		
		//upcasting
		 One obj = new Two();
		 obj.display();
		 //down casting
		 Two obj2 = (Two) new One();
		 obj2.display();
	}
	//runtime polymorphism
	//dynamic binding
	
	public void display() {
		System.out.println("This is from class two\n");
	}
	public void display(String className) {
		System.out.println("This is from class two");
		System.out.println(className+"\n");
	}
	public void display(String className, int classCode) {
		System.out.println("This is from class two");
		System.out.println(className);
		System.out.println(classCode);
	}

}
