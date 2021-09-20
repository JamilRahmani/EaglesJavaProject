package interviewQuestions;

public class StringReverse {

	public static void main(String[] args) {


		String name = "jamil";
		
		// Using for loop
		int len = name.length();
		String rev = "";
		
		for (int i = len-1; i>=0;i--) { 
			rev = rev + name.charAt(i);
		}
		System.out.println(rev);
		
		
		//2. Using StringBuffer Class
		StringBuffer sf = new StringBuffer("khan");// we can also use String here instead of "khan"
		System.out.println(sf.reverse());
		
		//3. Using StringBuilder Class
		StringBuilder sb = new StringBuilder("ahmed");// we can also use String here instead of "ahmed"
		System.out.println(sb.reverse());
		
		
		//This is another way to Reverse a String
		String input = "Test is here";
		String output = reverse(input);
		System.out.println(output);
		
	}
	
	private static String reverse(String input) {
		String reverse = "";
		
		if (input.isEmpty() || input == null) {
			System.out.println("Empty and null strings are not accepted");
		}
		
		if  (input.length() <= 1) {
			reverse = input;
		} else {
			
			String [] originalArray = input.split("\\s+");
			for (String item : originalArray) {    //this, is, a, test, string
			reverse = item + " " + reverse; //  this + "", is + this, a + is this, test + a is this, string + test a is this
			}
		}
		
		
		return reverse.trim();
		
		
	}

}
