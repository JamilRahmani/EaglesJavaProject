package interviewQuestions;

public class RevStringWordByWord {

	public static void main(String[] args) {

		// Reverse String word by word
		String str = "Jamil is a tester";

		// [Jamil, is, a, tester]
		String[] words = str.split(" ");
		String revString = "";
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			String revWord = "";

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
