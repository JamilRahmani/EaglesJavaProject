package interviewQuestions;

public class GiveWordsFromString {

	public static void main(String[] args) {

		String str = "This is my first java program";
		String [] findWord = str.split(" "); 
		
		for(int i =0; i < findWord.length; i++) {
			System.out.println(findWord[i]);
		}
		
		
		
	}

}
