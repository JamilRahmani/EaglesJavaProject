package practiceSeasons;

public class Calculator {

int z;
	
	public static void main(String[] args) {
//		Calculator obj1 = new Calculator();
//		Calculator obj2 = new Calculator("Welcome to Coding world. Don't worry, you will get there ;)");
//		Calculator obj3 = new Calculator(10, 20, "Result is good!");
		Calculator obj4 = new Calculator(9, 18, "All Good", "End of Code", "Good Night");
		
	}
	public Calculator() {
		System.out.println("The is my first calculator coding in class");
	}
	
	public Calculator(String result) {
		this();
		System.out.println(result);
	}
	
	public Calculator(int a, int b, String result) {
		this(result);
		z = a + b;
		System.out.println("The sum is: " + z);
	}
	public Calculator(int a, int b, String result, String endOfStatement, String goodByMessage) {
		this(a, b, result);
		System.out.println(endOfStatement +"\n"+goodByMessage);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
