
package interviewQuestions;

public class FibonacciSequenceQuestion {
	
	public static void main(String[] args) {
		
		
	// 0,1, 1, 2, 3, 5, 8, 13, 21, 34
		
		// loop generate first 10 numbers in the seq
		
		int [] fibNums = new int [10];
		fibNums[0] = 0;
		fibNums[1] = 1;
		
		for (int i = 2; i < fibNums.length; i++) {
			fibNums[i] = fibNums[i-1] + fibNums[i-2];
			System.out.println(fibNums[i]);
		}
		
		
	}

}
