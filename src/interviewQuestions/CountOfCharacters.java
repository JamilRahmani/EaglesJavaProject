package interviewQuestions;

import java.util.HashMap;

public class CountOfCharacters {

	public static void main(String[] args) {

		// How many time each letter is repeated In String
		String str = "this is just a test to see";

		// create a map <Character, Integer>
		HashMap<Character, Integer> data = new HashMap<Character, Integer>();

		for (int i = 0; i < str.length(); i++) {
			// System.out.println(str.charAt(i));
			// check to see if the char is already in the map,
			// if yes, increase the count
			// if no, this is the first time that you see the char, so count is 1

			if (data.get(str.charAt(i)) == null) {
				// first time that we see this char
				data.put(str.charAt(i), 1);
			} else {
				// this is a char that is already in the map
				// so we need the current count
				// increase and assign back
				data.put(str.charAt(i), data.get(str.charAt(i)) + 1);
			}

		}

		System.out.println(data);
		
		
	    //Total count of chars in a String
        String str2 = "java code";
        int count1 = 0;
        
        for (int i = 0; i < str2.length(); i++) {
       		 count1++;
        }
        System.out.println(count1);
		
	}

}
