package interviewQuestions;

public class FactorialNumber {

	public static void main(String[] args) {

		
		factorial(4);
		
	}
	public static void factorial(int num) {
		// Multiplying
		int result=num;
		for (int i=num; i>=2; i--) {			
			result *= i-1;
		}
		System.out.println(num + " Multiplication Factorial is: " + result);
		result=num;
		int a =0;
		
		// With addition
		for (int i=num; i>=2; i--) {
			for(int j=i; j>=2; j--) {				
				result = result + a;
				//System.out.println(result);
			}
			a=result;			
		}	
		System.out.println(num + " Addition Factorial is: " + result);
		
	}

}
