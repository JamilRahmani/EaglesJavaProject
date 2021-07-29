package javaBasics;

public class BreakKeyWord {

	public static void main(String[] args) {
		
		int [] nums = {2,1,6,1,43,3,7,9,15};
		
		for (int i = 0 ; i < nums.length;i++) {
			if (nums[i] > 7) {
				break;
			}
			System.out.println(nums[i]);
		}

	}

}
