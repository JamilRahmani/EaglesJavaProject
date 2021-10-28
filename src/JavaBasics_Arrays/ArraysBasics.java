package JavaBasics_Arrays;

public class ArraysBasics {

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
			days[i] = (i) + ". " + days[i];
		//	days[i] = null;
		}

		for(int i = days.length -1; i>=0; i--) {
			System.out.println(days[i]);
		}
		
		
		
		String[] Months = new String[12];

		int line = 1;
		Months[0] = ": January";
		Months[1] = ": Febuary";
		Months[2] = ": March";
		Months[3] = ": April";
		Months[4] = ": May";
		Months[5] = ": June";
		Months[6] = ": July";
		Months[7] = ": August";
		Months[8] = ": September";
		Months[9] = ": October";
		Months[10] = ": November";
		Months[11] = ": December";

		for (int e = 0; e < Months.length; e++) {
			System.out.println(line++ + Months[e]);
		}
		
		

	}
}
