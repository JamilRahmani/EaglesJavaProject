package interviewQuestions;

import java.util.Arrays;

public class SecondLargestNumber {

	public static void main(String args[]) {

		
	        
		String s = "test java with selenium";
		s.isEmpty();
		
	
		   
		System.out.println(s.isEmpty());

		
		// 1st way to find Second Highest number
		int[] num1 = { 54, 66, 63, 74, 23 };

		int len = num1.length;

		Arrays.sort(num1);
		
		
		System.out.println(num1[len - 2]);

		// 2nd way to find the second highest number
		int[] num = { 54, 66, 63, 74, 23 };
		int largest = num[0];
		int secondLargest = 0;
		int thirdLargest = 0;
		
		for (int i = 0; i < num.length; i++) {
			if (num[i] > largest) {
				thirdLargest = secondLargest;
				secondLargest = largest;
				largest = num[i];
			} else if (num[i] > secondLargest) {
				thirdLargest = secondLargest;
				secondLargest = num[i];
			} else if (num[i] > thirdLargest) {
				thirdLargest = num[i];
			}
		}
		
		
		
		
		System.out.println(Arrays.toString(num));
		System.out.println("The Laregst number: " + largest);
		System.out.println("The second Laregst number: " + secondLargest);
		System.out.println("The Third Laregst number: " + thirdLargest);

		
		
		// *******************************************************************
		int a[] = { 11, 52, 5, 6, 13, 21, 8 };
		int b[] = { 44, 66, 99, 77, 33, 22, 55 };
		System.out.println("Second Largest: " + getSecondLargest(a, 6));
		System.out.println("Second Largest: " + getSecondLargest(b, 7));

	}

	public static int getSecondLargest(int[] a, int total) {
		int temp;
		for (int i = 0; i < total; i++) {
			for (int j = i + 1; j < total; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a[total - 2];
	}

}
