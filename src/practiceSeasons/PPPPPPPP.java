package practiceSeasons;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class PPPPPPPP {
	

	public static void main(String[] args) {

		
		// what will be the result for this question
		String s1 = new String("automation");
		String s2 = new String("AUTOMATION");
		System.out.println(s1 = s2);

		
		String str = "hello";
		StringBuffer sb = new StringBuffer("hello");
		System.out.println(str.equals(sb.toString()));
		
		String name1 = "jamil";

		// Using for loop
		int len = name1.length();
		String rev = "";

		for (int i = len - 1; i >= 0; i--) {
			rev += name1.charAt(i);
		}
		System.out.println(rev);

		// 2. Using StringBuffer Class
		StringBuffer sf = new StringBuffer("jamil");
		System.out.println(sf.reverse());

		//StringBuilder sb = new StringBuilder("jamil");
		System.out.println(sb.reverse());

		// finding each character by indexes
		String name = "this is my first java code";

		HashMap<Character, Integer> fun = new HashMap<Character, Integer>();

		for (int i = 0; i < name.length(); i++) {
			System.out.print("indexes: " + i + " " + name.charAt(i));

			System.out.println();
		}

		System.out.println(name.length());

		int y = 0;
		for (int i = 10; i > y; i--) {
			System.out.println(i);
		}

		HashSet<Integer> h = new HashSet<Integer>();

		h.add(13);
		h.add(20);
		h.add(15);
		h.add(137);
		h.add(201);
		h.add(152);

		Iterator<Integer> it = h.iterator();

		while (it.hasNext()) {

			System.out.println("index numbers: " + it.next());
		}

		for (int i = 0; i < h.size(); i++) {
			System.out.println("index number: " + i + "values : " + h.iterator());
		}

		int[] ss = { 2, 4, 6, 456, 87, 45 };
		int highval = 0;

		for (int i = 0; i < ss.length; i++) {

		}

		int in = 1, j = 2, k = 3;
		int m = in-- - j-- - k--;
		System.out.println(m);
	}
	
	

}
