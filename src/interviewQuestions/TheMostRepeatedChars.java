package interviewQuestions;

public class TheMostRepeatedChars {

	public static void main(String[] args) {

		
		String str = "aziz";
		int count = 0;
		for(int i =0 ;i <  str.length();i++) {
			if (str.charAt(i) == 'z') {
				count++;
				System.out.println(str.charAt(i));
			}
			
		}
		System.out.println(count);
		
		
	}

}
