package javabasics_iterations;

import java.util.Iterator;

public class ContinueAndBreakExamples {

	public static void main(String[] args) {

		// break will stop the iteration
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			if (i == 5) {
				break;
			}
		}

		// continue will skip that one iteration
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				System.out.println("continue");
				continue;
			}
			System.out.println(i);
		}

		
		
		
		
		
		
		
		
	}

}
