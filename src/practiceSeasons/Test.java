package practiceSeasons;

public class Test {

	// what is constructor?
	//what does construtor returns?
	// A constructor is instance of a class
	
	// Default constructor/non-parameterized constructor
	
	//parameterized constructor
	
		//Instance or Global Variable
		private String city;
		//Local Variable inside a constructor
		Test(){
			String lastName = "David";
			System.out.println(lastName);
		}
		//Local Variable inside a block
		static {
			String subject = "Java";
			System.out.println(subject);
		}
		//Local Variable inside a method
		public static void main(String[] args) {
			String name = "Ahmed";
			System.out.println(name);
		}
	
	
}
