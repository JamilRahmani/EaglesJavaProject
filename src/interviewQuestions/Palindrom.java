package interviewQuestions;

public class Palindrom {

	public static void main(String[] args) {
		
		//1. we will get input string "bob"
		//2. create a temprev string "boj"
		//3. compare the two
		//4. if equal = print yes, if not print not No
		//5. char at (index)
		
		String input = "dad";
		String temprev = "";
		
		for (int i =input.length()-1; i >=0; i--) {
			temprev += input.charAt(i);
		//	System.out.print(input.charAt(i));
		}
		
		if (input.equals(temprev)) {
			System.out.println("yes"); // its palindrome
		}else {
			System.out.println("No"); // its not palindrome
		}
		
		System.out.print(input +" ");
		System.out.println(temprev);
		
	
		
		
		

	}

}
