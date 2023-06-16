package interviewQuestions;

public class MaxAndMinNumbers {

	
	public static int num() {
		int [] numbers = {1,21,1,512,1,51,85,1,2,156,5,1,5,3,6,1,4,6,};
		int largest = numbers[0];
		
		for (int i =0; i < numbers.length; i++) {
			if (numbers[i] > largest) {
				largest = numbers[i];
			}
		}
		System.out.println(largest);
		return largest;
		
		
	}
	

	public static void main(String[] args) {

		num();
		int [] numbers = {1,21,1,512,1,51,85,1,2,156,5,1,5,3,6,1,4,6,};
		int largest = numbers[0];
		int sum = 0;
		int ave = 0; 
		
		
		for (int i =0; i <numbers.length; i++) {
			if (numbers[i] > largest) {
				largest = numbers[i];
				sum += numbers[i];
			}
			ave = sum / numbers[i]; 
		}
		
		System.out.println(largest);
		System.out.println(ave);
		System.out.println(sum);
		

		
		
		
	}

}
