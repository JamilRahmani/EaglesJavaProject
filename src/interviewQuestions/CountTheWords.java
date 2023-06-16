package interviewQuestions;

import java.util.HashMap;

public class CountTheWords {

	public static void main(String[] args) {


		//Write a Java Program to count the number of words in a string using HashMap.
	     // Declare a string and add assign value "today is the worst day i ever had in my life today"
	     // array string and remove space ; it will give you number of words in this string.
	     //you need to create a Hashmap and for Hashmap key value will be words and value will be integer of counts
	     //for loop to iterate through hasmap to check if key is repeated and add it to hasmap value.

	     String value = "today is the worst day i ever had in my life today";
	     String [] split = value.split(" "); // count characters you split without the space value.split("")
	     HashMap<String,Integer> map = new HashMap<String,Integer>();
	     // we use collection hashmap and then im gonna user for each loop
	     // then i will say contiankey 
	     for (int i=0; i<split.length; i++){
	         if (map.containsKey(split[i])){
	             int count = map.get(split[i]);
	             map.put(split[i], count+1);
	         }
	         else{
	             map.put(split[i],1);
	         }
	         }
	         System.out.println(map);
	         
	         
	         
	         // Second way to Find The count of words in String
	         String str = "aziz rahman";
	         int count = 1;
	        // int len = str.length();
	         
	         for (int i = 0; i < str.length(); i++) {
	        	 if (str.charAt(i) == ' ') {
	        		 count++;
	        	 }
	         }
	         System.out.println(count);
	         
	         
	         // Find the duplicate and also remove the repeated word, print it out only
	         // only one time and give me the count how many time its repeated in the String.
	         // Result: java, 4
	     	String [] name = {"java", "test", "java", "phython", "java","java"};
			int c = 0;
			String dup = "";
	 		 for (int i = 0; i < name.length; i++) {
					if (name[i] == "java") {
						dup = name[i];
						c++;
					}
			}
	 		System.out.println( dup+", "+ c);
	         
	         
	     }
	}


