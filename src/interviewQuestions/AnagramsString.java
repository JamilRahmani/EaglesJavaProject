package interviewQuestions;

import java.util.Arrays;

public class AnagramsString {

	public static void main(String[] args) {


		//1. check if the two Strings are of the same  Length
		//2. Transform the Strings to arrays of chars
		//3. Iterate through the arrays and compare the same indexed element
		
		String x = "HE is aradhya";
		String y = "is he HRADAYA";
		
		x = x.replace(" ", "");
		y = y.replace(" ", "");
		
		x = x.toLowerCase();
		y = y.toLowerCase();
		
		char a[] = x.toCharArray();
		char b[] = y.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		boolean result = Arrays.equals(a, b);
		
		if (result == true) {
			System.out.println("Strings are Anagram");
		}else {
			System.out.println("Strings are not Anagram");
		}
			
	
		
	}
	
	
}
