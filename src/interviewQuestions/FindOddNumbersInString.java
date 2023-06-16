package interviewQuestions;

public class FindOddNumbersInString {

	public static void main(String[] args) {


		String s = "Let's code together";
		
		
		
		//If you want to find ODD number use == sign. 
		//if you want to find EVEN number use != sign.
		for (int i = 0; i < s.length(); i++) {
			if (i % 2 == 0) {
				System.out.print(s.charAt(i));
			}
		}
		
		
		
		
		
		
		
		
	}

}
