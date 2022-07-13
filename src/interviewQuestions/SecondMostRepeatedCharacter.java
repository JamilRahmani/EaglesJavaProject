package interviewQuestions;

public class SecondMostRepeatedCharacter {

	
static final int no_Of_Chars = 256;
	
	static char getSecondMostFreq(String str) {
		int [] count = new int [no_Of_Chars];
		int i;
		for(i=0; i< str.length(); i++) 
			(count[str.charAt(i)])++;
		
		int first = 0, second = 0;
		for (i = 0; i <no_Of_Chars; i++) {
			if (count[i] > count[first]) {
				second = first;
				first = i;
			}else if (count[i] > count[second] && count[i] != count[first])
				second = i;
			
		}
			
		return (char)second;
		
		
	}
	
	public static void main(String[] args) {
		
		String s = "success";
		char res = getSecondMostFreq(s);
		
		if (res != '\0')
			System.out.println("Second most char is " + res);
		else
			System.out.println("No most frequent char");
			

	}

}
