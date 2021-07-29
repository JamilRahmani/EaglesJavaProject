package notes;

public class SingleDimensionArray {

	public static void main(String[] args) {
		
		// Array is fixed in size
		double[] data = new double[10];
		data[2] = 45;
		data[4] = 87;
		data[8] = 2;
		data[3] = 35;

		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
		System.out.println(data.length);

		System.out.println(data[4]);

		// create an array of string that holds all of the days of a week
		// Sat, Sun, etc

		String[] days = new String[7];
		days[0] = "Saturday";
		days[1] = "Sunday";
		days[2] = "Monday";
		days[3] = "Tuesday";
		days[4] = "Wednesday";
		days[5] = "Thursday";
		days[6] = "Friday";

		for (int i = 0; i < days.length; i++) {
			System.out.println(days[i] + " " +i);
			days[i] = (i + 1) + ". " + days[i];
		//	days[i] = null;
		}

		for(int i = days.length -1; i>=0; i--) {
			System.out.println(days[i]);
		}
		
		// This is a single dimension array:
				int [] numbers = {4,5,6,567,45,34,23,98,};
				
				for (int i = 0; i < numbers.length; i++) {
					System.out.print(numbers[i] + " ");
				}
				System.out.println();
				
				// This code will work as above code 
				// enhanced loop
				// for ( data-type  pointer-to-each-index     : name-of-the-array){
				// loop body  -  remember that we create a pointer to each index / not an int to use as index number
				for (int i: numbers) {
					System.out.print(i + " ");
				}
				System.out.println();
		
	}
}
