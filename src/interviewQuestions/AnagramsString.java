package interviewQuestions;

import java.util.Arrays;
import java.util.Iterator;

public class AnagramsString {

	public static void main(String[] args) {

		// 1. check if the two Strings are of the same Length
		// 2. Transform the Strings to arrays of chars
		// 3. Iterate through the arrays and compare the same indexes element

		String x = "He is aradhya";
		String y = "he is HRADAYA";
		
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
		} else {
			System.out.println("Strings are not Anagram");
		}

		
		
		System.out.println("*************************************************");
		
		
		boolean anagram = true;  // booleans like this are usually called a flag
		
		// check the length of each word = both should match
		if (a.length != b.length) {
			anagram = false;
		}

		// we have loop through the first array and check each char in the second array
		out: for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					// this is when we find a match char
					b[j] = ' '; // so in here, we have found the char and used it, so we are going to erase it
					continue out; // now we are moving to the next index in the outer array
				}
			}
			// since we got out odd the inner loop and did not find a matching char, 
			// we know that these two sentences are not anagram
			// so we are setting the boolean of anagram to false and breaking the out loop which will 
			// stop the whole thing 
			anagram = false; //
			break out;
		}
		System.out.println(anagram);

	}

}
