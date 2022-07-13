package GroupPractice;

import OOPsPolymorphism2.PPPractice2;

public class Concatination {

	public static void main(String[] args) {

		
		// +: this is a logical operator that called concatenation
		// .concat: this is a build in method
		String str = "java is my language";
	
		System.out.println(str.replace(str, "Hello"));
		System.out.println(str.endsWith("age"));
		System.out.println(str.substring(0, 4));
		System.out.println("java".concat( " is my first code"));
		System.out.println(str.substring(3));
		System.out.println(str.charAt(3));
		
		
		
		String str2 = "this";
		
		for (int i = 0; i < str.length(); i++) {
		}
		if (str.equals(str2)) {
			System.out.println("yes they are equal: " + str + " = " + str2 );
		}else {
			System.out.println("they are not equal");
		}
		
		System.out.println(str.equalsIgnoreCase(str2));
		
		System.out.println(str);
		
		System.out.println(str.substring(11, 16));
		
		System.out.println(str.charAt(8));
		
	System.out.println(str.concat(" code"));

		System.out.println(10 + 20);
		System.out.println("value: "+ (10 + 20));
		
		
		
		
		
	}

}
