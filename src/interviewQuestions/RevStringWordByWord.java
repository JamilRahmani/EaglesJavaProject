package interviewQuestions;

import java.util.Iterator;

public class RevStringWordByWord {

	public static void main(String[] args) {

		

		String str = "Jamil is a tester";

		String[] splitName = str.split(" ");
		String revString = "";
		
		
		for (int i = 0; i < splitName.length; i++) {
			String word = splitName[i];
			
			for (int j = word.length() - 1; j >= 0; j--) {
				
				revString += word.charAt(j);
				
			}
			revString += " ";// limaj si a retset
		}
		System.out.println(revString);

	
		reverseWord("jamil is a tester");
	}
	
	public static void reverseWord(String str) {
		// tester a is jamil
		// jamil is a tester
		String []word = str.split(" ");
		String rev = "";
		
		for (int i =word.length-1; i >=0;i--) {
			rev += word[i];
			rev += " ";
		}
		System.out.println(rev);
		
	}

}
