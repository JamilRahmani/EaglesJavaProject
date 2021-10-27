package MIxed;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListAndLinkedListRunTimeExample {

	public static void main(String[] args) {
		
		

		ArrayList arrayList = new ArrayList();
		LinkedList linkedList = new LinkedList();
		
		for (int i =0 ; i< 1000000; i++) {
			arrayList.add(i);
			linkedList.add(i);
		}
		
		final long startTimeAL = System.nanoTime();
		//arrayList.get(100);
		arrayList.remove(10);
		final long endTimeAL = System.nanoTime();
		
		final long startTimeLL = System.nanoTime();
		//linkedList.get(100);
		linkedList.remove(10);
		final long endTimeLL = System.nanoTime();
		
		
		long totalTimeAR = endTimeAL - startTimeAL;
		long totalTimeLL = endTimeLL - startTimeLL;
		
		
		System.out.println("Total LinkedList execution time: " + totalTimeLL);
		System.out.println("Total ArrayList execution time: " + totalTimeAR);
		
		
		
		
		
		
		
		
		
	}

}
