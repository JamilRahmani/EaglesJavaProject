package CollectionPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ListMethodPractice {

	public static void main(String[] args) {

		/*
		 * 1 2 3
		 * 4 5 6
		 * 1 5 3
		 * 4 5 9
		 * 9 2 5
		 * 1 1 2
		 * 2 1 1
		 * 1 2 1
		 */
		ArrayList<ArrayList<Integer>> data = new ArrayList<ArrayList<Integer>>();
		data.add(new ArrayList<Integer>());
		data.get(0).add(1);
		data.get(0).add(2);
		data.get(0).add(3);
		data.add(new ArrayList<Integer>());
		data.get(1).add(4);
		data.get(1).add(5);
		data.get(1).add(6);
		data.add(new ArrayList<Integer>());
		data.get(2).add(1);
		data.get(2).add(5);
		data.get(2).add(3);
		data.add(new ArrayList<Integer>());
		data.get(3).add(4);
		data.get(3).add(5);
		data.get(3).add(9);
		data.add(new ArrayList<Integer>());
		data.get(4).add(9);
		data.get(4).add(2);
		data.get(4).add(5);
		data.add(new ArrayList<Integer>());
		data.get(5).add(1);
		data.get(5).add(1);
		data.get(5).add(2);
		data.add(new ArrayList<Integer>());
		data.get(6).add(2);
		data.get(6).add(1);
		data.get(6).add(1);
		data.add(new ArrayList<Integer>());
		data.get(7).add(1);
		data.get(7).add(2);
		data.get(7).add(1);
		// sum numbers in each inner list and return the largest sum
		// do i need to store the sums ?
		// create an int that keeps track of the current max
		// create an temp int for sum of the numbers
		// loop through the outer list and sum the numbers in each index
		// compare the result to the max
		int tempSum = 0;
		int largest = data.get(0).get(0);
		int secondLargest = 0;
		for (int i = 0; i < data.size(); i++) {
			System.out.println(data.get(i));
			// go through the inner list and sum the numbers
			for (int j = 0; j < data.get(i).size(); j++) {
				tempSum += data.get(i).get(j);
			}
			// we have the sum of the numbers in the inner list
			if (tempSum > largest) {
				// this is when the sum is the new largest
				largest = tempSum;
			} else if (tempSum > secondLargest && tempSum < largest) {
				// this is when the sum is more than the second largest and less than the
				// largest
				// basically the new value for second largest
				secondLargest = tempSum;
			}
			// print the sum
			System.out.println(tempSum);
			// refresh the tempSum to zero for the next line
			tempSum = 0;
		}
		System.out.println("the largest sum found is " + largest);
		System.out.println("the second largest sum found is " + secondLargest);
		System.out.println("******************************");
		System.out.println(data);
		String temp = "";
		ArrayList<String> nums = new ArrayList<String>();
		// find if inner arrays are duplicates
		// duplicate: if the inner array has the same digits, its duplicate
		for (int i = 0; i < data.size(); i++) {
			Collections.sort(data.get(i));
			System.out.println(data.get(i));
			for (int j = 0; j < data.get(i).size(); j++) {
				temp += data.get(i).get(j);
			}
			nums.add(temp);
			temp = "";
		}
		System.out.println(nums);
		// we have the list of strings with all of the numbers
		// we need to find the duplicates
		for (int i = 0; i < nums.size(); i++) {
			for (int j = i + 1; j < nums.size(); j++) {
				if (nums.get(i).equals(nums.get(j))) {
					System.out.println("duplicate on indexes " + i + " and " + j + " " + data.get(i));
				}
			}
		}
	
	
	
		
		
		
		
	}

}
