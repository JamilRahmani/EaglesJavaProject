package CollectionPractice;

import java.util.ArrayList;

public class ListPractice {
	
	public static void main(String[] args) {
		
		// For ArrayList we have to use <     > which is called generic
		ArrayList<String> ar = new ArrayList<String>();
		ArrayList<String> ar2 = new ArrayList<String>();
//		ar2.add("test");
//		ar2.add("test2");
//
//		for (int i = 1; i <= 1000; i++) {
//			if (i % 2 == 0) {
//				ar.add(i + " is Even");
//			} else {
//				ar.add(i + " is Odd");
//			}
//
//		}
//		ar.add(0, "this is what i just added");
//		ar.addAll(0, ar2);
//		ar.remove(0);
//
//		System.out.println(ar);
		
		
		String[] obj1 = new String[10];
		for (int i = 0; i < obj1.length; i++) {
			obj1[i] = i + " n";
		}
		
		String[] obj2 = new String[20];
		
		System.out.println("\n\nOBJ1");
		for (int i = 0; i < obj1.length; i++) {
			System.out.print(obj1[i] + " ,");
		}
		
		// move obj1 to obj2 happens in a loop
		for (int i = 0; i < obj1.length; i++) {
			obj2[i] = obj1[i];
		}
		
		
		System.out.println("\nOBJ2");
		for (int i = 0; i < obj2.length; i++) {
			System.out.print(obj2[i] + "  ");
		}
		
		
		// ArrayList vs. LinkedList
		// Arraylist is better with smaller datasets
		// linkedlist is better with large datasets
		// arraylist is better with searching and returning the data
		//
		
//		for (int i = 0; i < ar.size(); i++) {
//			System.out.println(ar.get(i));
//		}
//		
		
		
		
		
		
		
		
		
		
	}
	

	
}
