package javabasics_iterations;

public class ArrayExample {
public static void main(String [] args) {
	
	int [] nums = {108,290,9,7,39,13,87,36,3};
	
	System.out.println(nums.length);
	
	for (int i = 0; i < 5; i++) {
		System.out.println(nums[i]);
		
	}
	
	String [] todolist = {"jamil", "rahman", "kdr", "yes"};
	
	for (int i = 0; i < todolist.length; i++) {
		System.out.println(todolist[i]);
	}
	
	String[] toDoList = { "research the topics", "read slides", "do assignments", "practice with the group", "attend the class" };
	for(int i = 0; i < toDoList.length; i++) {
		System.out.println((i + 1) + ". " +toDoList[i]);
	}
	
	for (int j = 0; j < 5; j++) {
		for(int i = 0; i < toDoList.length; i++) {
			System.out.println((i + 1) + ". " +toDoList[i]);
		}
		
	}
	
	int [] numbers = {1,21,1,512,1,51,85,1,2,156,5,1,5,3,6,1,4,6,};
	int largest = numbers[0];
	int smallest = numbers[0];
	int sum =0;
	double avg = 0;
	
	for (int i =0; i <numbers.length; i++) {
		if (numbers[i] > largest) {
			largest = numbers[i];
		}
	}
	for (int i =0; i <numbers.length; i++) {
		if (numbers[i] < smallest) {
			smallest = numbers[i];
		}
	}
	
	// This is the second way to find large and small numbers in one loop
//	for (int i =0; i <numbers.length; i++) {
//		if (numbers[i] > largest) {
//			largest = numbers[i];
//		}else if (numbers[i] < smallest) {
//			smallest = numbers[i];
//		}
//		//sum += numbers[i];
//		
//	}
	avg = sum / numbers.length;
	
	System.out.println("Largest " +largest);
	System.out.println("Smallest " +smallest);
//	System.out.println("Sum " + sum);
//	System.out.println("Average " + avg);
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

	
}
