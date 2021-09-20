package interviewQuestions;

import java.util.Iterator;

public class PaliNumber {

	public static void main(String[] args) {
		int input = 12345432;

		System.out.println(checkPal(input));

		int num = 123454321;
		System.out.println(num == revNum(num));
		
		
	}

	public static boolean checkPal(int input) {
		char[] arr = String.valueOf(input).toCharArray();
		for (int forward = 0, backward = arr.length - 1; forward < arr.length; forward++, backward--) {
			if (forward == backward || forward > backward) {
				break;
			}
			if (arr[forward] != arr[backward]) {
				// not palindrome
				System.out.println("Not palindrome");
				return false;
			}
		}
		return true;
	}

	public static int revNum(int number) {
		int reverse = 0;
		while (number != 0) {
			int remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number = number / 10;
		}
		return reverse;
	}
	
	public static boolean palinINT(int number) {
		return number == revNum(number);
	}

}
