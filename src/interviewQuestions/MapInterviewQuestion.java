package interviewQuestions;

import java.util.HashMap;

public class MapInterviewQuestion {

	public static void main(String[] args) {

		// count the number of chars in the string
		String str = "this is just a test to see if our code can count the number of each character in this string";

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

		// we can count how many words we have in the str through the same code but the
		// sysout will be like this
		// System.out.println(str.split(" ").length);

		// foo(0);

	}

//	public static int foo(int a) {
//		int x = a+1;
//		
//		System.out.println(x);
//		if(x>10) {
//			return 0;
//		}
//		return foo(x);
//	}

}
