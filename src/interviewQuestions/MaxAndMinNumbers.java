package interviewQuestions;

public class MaxAndMinNumbers {

	public static void main(String[] args) {

		
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
		
		
		
	}

}
