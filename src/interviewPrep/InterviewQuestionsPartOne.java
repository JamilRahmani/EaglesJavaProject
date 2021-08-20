package interviewPrep;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class InterviewQuestionsPartOne {

	public static void main(String[] args) {
		
		
		// Reverse String
		String name = "jamil";
		// 
		int len = name.length();
		
		String rev = "";
		
		for (int i =len-1; i >= 0; i--) {
			rev += name.charAt(i);
		}
		System.out.println(rev);
		
		StringBuffer sb = new StringBuffer("jamil");
		System.out.println(sb.reverse());
		
		System.out.println("*********Swapeer*****************");
		
		int a = 10;
		int b = 20;
		int c ;
		c = a;
		a = b;
		System.out.println("value of A" +a);
		System.out.println("value of B" +b);
		System.out.println("value of C" +c);
		
		int d = 50;
		int f = 60;
		d = d + f;
		f = d-f;
		d = d - f;
		System.out.println("value of D" +d);
		System.out.println("value of F" +f);
		
		System.out.println("***********split the words using HashMap****************");

		String str = "test to test out this test";
		 
		String[] words = str.split(" ");
		
        Map<String, Integer> hashMap = new HashMap<>();
 
        for (String word : words) {
            // containsKey(key) will return a boolean value
            // i.e. true if it contains the key and false if
            // it doesn't.
            if (hashMap.containsKey(word))
                hashMap.put(word, hashMap.get(word) + 1);
 
            else
                hashMap.put(word, 1);
        }
 
        System.out.println(hashMap);
        
		
		System.out.println("************is it Prime number or not***************");
		
		int num = 29;
	    boolean flag = false;
	    for (int i = 2; i <= num / 2; ++i) {
	      // condition for nonprime number
	      if (num % i == 0) {
	        flag = true;
	        break;
	      }
	    }

	    if (!flag) {
	      System.out.println(num + " is a prime number.");
	    }else {
	      System.out.println(num + " is not a prime number.");
	  }
	    
	
		System.out.println("***************Palindrome***********************");
		
		String palin = "dad";
		String reverse = "";
		
		for (int i = palin.length()-1;i >= 0; i--) {
			reverse += palin.charAt(i);
		}
		
		if (palin.equals(reverse)) {
			System.out.println("This is Palindrome");
		}else {
			System.out.println("This is not Palindrome");
		}
		
		System.out.print(palin+ " ");
		System.out.println(reverse);
		
		System.out.println("**************Fibonacci**************************");
		
		int [] fibNums = new int [10];
		fibNums[0]= 0;
		fibNums[1] = 1;
		for (int i = 2; i <fibNums.length; i++) {
			fibNums[i] = fibNums[i-1] + fibNums[i-2];
			System.out.println(fibNums[i]);
		}
		
		
		System.out.println("***********ArrayList with advance loop****************");
		
		ArrayList ar = new ArrayList();
		
		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add(40);
		
		Iterator<Integer> it= ar.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		
	}

}
