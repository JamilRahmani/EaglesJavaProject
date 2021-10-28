package interviewQuestions;

import java.util.Iterator;

public class RevStringWordByWord {

	public static void main(String[] args) {

		
		// Reverse String word by word
		//			  limaj si a retset
		String str = "Jamil is a tester";

		// [Jamil, is, a, tester]
		String[] words = str.split(" ");
		String revString = "";
		
		// 1st for loop: {jamil, is , a , tester}
		// 2nd for loop {{l,i,m,a,j}, {s,i}, {a}, {r,e,t,s,e,t}}
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			String revWord = "";
			// 2nd for loop {{l,i,m,a,j}, {s,i}, {a}, {r,e,t,s,e,t}}
			for (int j = word.length() - 1; j >= 0; j--) {
				revWord += word.charAt(j);
			}
			revString += revWord + " ";// avaj gnimmargorp
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
