
package interviewQuestions;

public class FibonacciSequenceQuestion {

	public static void main(String[] args) {

		// 0,1, 1, 2, 3, 5, 8, 13, 21, 34

		// loop generate first 10 numbers in the seq

		int[] fibNums = new int[10];
		fibNums[0] = 0;
		fibNums[1] = 1;
		// the result of current index number will be the sum of your last two index
		// numbers
		// 0,1,2,3,4,5,6, 7, 8, 9
		// 0,1,1,2,3,5,8,13,21,34
		for (int i = 2; i < fibNums.length; i++) {
			fibNums[i] = fibNums[i - 1] + fibNums[i - 2];
			System.out.print(fibNums[i]+" ");
		}

	}

}
