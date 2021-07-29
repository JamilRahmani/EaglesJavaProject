package javabasics_iterations;

public class ForEachExample {
	
	public static void main(String[] args) {
		
		// This is a single dimension array:
		int [] numbers = {4,5,6,567,45,34,23,98,};
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		
		// This code will work as above code 
		// enhanced loop
		// for ( data-type  pointer-to-each-index     : name-of-the-array){
		// loop body  -  remember that we create a pointer to each index / not an int to use as index number
		for (int i: numbers) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("****************");
		
		//{3,4,8,2,9,6} these numbers inside the braces are a single dimension of array:
		int [][] nums = {{1,2,3,4,5},{7,4,9,3,9},{3,4,8,2,9,6}};// This one is 2 dimension array:
		
		for (int [] row : nums) {
			for (int number: row ) { //  This is inner loop
				System.out.print(number + " ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
