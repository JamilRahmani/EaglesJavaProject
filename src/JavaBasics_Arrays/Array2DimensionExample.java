package JavaBasics_Arrays;

public class Array2DimensionExample {

	public static void main(String[] args) {
		
		
		// 2 Dimension array:
		int [][] nums = new int [3][3];
		nums [0][0] = 1;
		
		nums [0][1] = 2;
		nums [0][2] = 3;
		
		nums [1][0] = 4;
		nums [1][1] = 5;
		nums [1][2] = 6;
		
		nums [2][0] = 7;
		nums [2][1] = 8;
		nums [2][2] = 9;
		
		// 1 2 3
		// 4 5 6
		// 7 8 9
		
		for (int row = 0; row < nums.length; row++) {
			for (int column =0; column < nums[row].length; column++) {
				System.out.print(nums[row][column]);
			}
			System.out.println();
		}
		
		System.out.println("*****************");
		// 2 Dimension arrays Diffrent methood:
		int [][] secondnumbers = {{3,4,8,9},{34,556,76,2},{56,7,2,5,66},{9,4,7,2,4}};
		
		for (int row = 0; row < secondnumbers.length; row++) {
			for (int col = 0; col < secondnumbers[row].length; col++) {
				System.out.print(secondnumbers[row][col] + " ");
			}
			
			System.out.println();
		}
				
		// 2 Dimension arrays:
		// when ever we have 2 brackets [][], its 2 dimension array:
		String [][] userpass = new String [4][2];
		
		userpass[0][0] = "admin";
		userpass[0][1] = "pass123";
		
		userpass[1][0] = "guest";
		userpass[1][1] = "12345pass";
		
		userpass[2][0] = "firstuser";
		userpass[2][1] = "123456789";
		
		userpass[3][0] = "seconduser";
		userpass[3][1] = "65841356as";
		
		
		for(int row = 0; row < userpass.length; row++) {
			for (int col = 0; col < userpass[row].length; col++) {
				System.out.print(userpass[row][col] + "\t ");
			}
			System.out.println();
		}
		// for specific user numbers we can use this below method for (:).
		for (int i = 0; i < userpass.length; i++) {
			System.out.println(userpass[i][0] + " : " + userpass[i][1]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
