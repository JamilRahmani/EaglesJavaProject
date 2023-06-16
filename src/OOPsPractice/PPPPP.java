package OOPsPractice;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class PPPPP {

	public void test1() {
		System.out.println("PPPPPP");
		int i = 50;
		int j = 50;
		int total = i + j;
		System.out.println(total);

	}

	String str = "jamil";

	public static int num() {
		int[] numbers = { 455, 7, 4354, 5, 345 };
		int largest = 0;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] > numbers[j]) {
					largest = numbers[i];
				}
			}
		}
		System.out.println(largest);
		return largest;
	}

	public static void main(String[] args) {

		num();

		int x = 10;
		int x2 = 20;
		String ss2 = "Test";

		System.out.println(20 + 10 + "test");
		System.out.println("test" + 20 + 10);

		// reverseWord("jamil is a tester");

		// How to reverse String word by word
		// Like this: limaj si a retset
		String str2 = "jamil is a tester";
		String[] words = str2.split(" ");
		// 1st for loop: {jamil, is , a , tester}
		// 2nd for loop {{l,i,m,a,j}, {s,i}, {a}, {r,e,t,s,e,t}}
		String rev4 = "";

		// i will run through the loop
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			// nasted loop
			for (int j = word.length() - 1; j >= 0; j--) {
				rev4 += word.charAt(j);
			}
			rev4 += " ";
		}
		System.out.println(rev4);

		// Find the second highest number
		int[] rrr = { 3, 88, 98, 34, 9876, 6, 8 };
		int smallest = rrr[0];
		// Arrays.sort(rrr);

		for (int i = 0; i < rrr.length; i++) {
			if (rrr[i] < smallest)
				smallest = rrr[i];
		}
		System.out.println(smallest);

		// System.out.println(rrr[2]);

		// ym si siht
		// siht si ym

		// ODD Numbers in string
		String s = "This is my";
		String[] dd = s.split(" ");

		for (int i = 0; i < s.length(); i++) {
			if (i % 2 != 0) {
				System.out.print(s.charAt(i));
			}
		}
		System.out.println();

		PPPPP str1 = new PPPPP();

		System.out.println(str1.str);

		// what will be the result for this question
//		String s1 = new String ("automation");
//		String s2 = new String ("AUTOMATION");
//		System.out.println(s1 == s2);

		String str = "hello";
		StringBuffer sb = new StringBuffer("hello");
		System.out.println(str.equals(sb.toString()));

		// String reverse
		String name1 = "jamil";
		int len = name1.length();
		String rev = "";

		for (int i = len - 1; i >= 0; i--) {
			rev += name1.charAt(i);
		}
		System.out.println(rev);

		// 2. Using StringBuffer Class Reverse
		StringBuffer sf = new StringBuffer("jamil");
		System.out.println(sf.reverse());

		// StringBuilder sb = new StringBuilder("jamil");
		System.out.println(sb.reverse());

		// finding each character by indexes
		String name = "this is my first java code";

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

		// Highiest value
		int[] ss = { 2, 4, 6, 456, 87, 45 };
		int highval = 0;

		for (int i = 0; i < ss.length; i++) {
			if (ss[i] > highval) {
				highval = ss[i];

			}
		}
		System.out.println(highval);

		int in = 1, j = 2, k2 = 3;
		int m = in-- - j-- - k2--;
		System.out.println(m);

		// Fibonacci
		int f1 = 0;
		int f2 = 1;
		int sum = 0;

		for (int i = 0; i <= 21;) {
			System.out.println(f1);
			sum = i + f2;
			f2 = i;
			f1 = sum;
			i = f1;
		}

		// sorted by only keys no value
		HashMap<String, String> mm = new HashMap<String, String>();
		mm.put("1", "one");
		mm.put("2", "two");
		mm.put("3", "three");
		mm.put("4", "four");
		mm.put("5", "five");

		System.out.println(mm);

		List<String> sortedKeys = new ArrayList<String>(mm.size());
		sortedKeys.addAll(mm.keySet());
		// sortedKeys.addAll(mm.values());
		// mm.values().containsAll(sortedKeys);
		System.out.println(sortedKeys);

		reverseWord("Jamil is a tester");

	}

	public static void reverseWord(String str) {
		// tester a is jamil
		// jamil is a tester
		String[] word = str.split(" ");
		String rev = "";

		for (int i = word.length - 1; i >= 0; i--) {
			rev += word[i];
			rev += " ";
		}
		System.out.println(rev);

	}

}
