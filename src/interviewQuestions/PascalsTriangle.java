package interviewQuestions;

public class PascalsTriangle {

	public static void main(String[] args) {


		for (int[] row : triQuestion(10)) {
			for (int i : row) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
	public static int[][] triQuestion(int n) {
		int[][] result = new int[n + 1][];
		if (n < 0) {
			System.out.println("Invalid Input");
			return null;
		} else if (n == 0) {
			result[0] = new int[] { 1 };
			return result;
		} else if (n > 0) {
			result[0] = new int[] { 1 };
			result[1] = new int[] { 1, 1 };
			if (n == 1) {
				return result;
			}
		}
		for (int i = 2; i < result.length; i++) {
			int[] temp = new int[i + 1];
			temp[0] = 1;
			temp[temp.length - 1] = 1;
			for (int j = 1; j < temp.length - 1; j++) {
				temp[j] = result[i-1][j-1] + result[i-1][j];
			}
			result[i] = temp;
		}
		return result;
	
	}

}
