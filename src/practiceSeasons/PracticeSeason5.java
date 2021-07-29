package practiceSeasons;

public class PracticeSeason5 {
	
		int employeeID;
		String employeeName;
		public static void main(String[] args) {
			
			//We are creating obejct of our class inside the main method
			PracticeSeason5 object = new PracticeSeason5();
			object.employeeID = 111;
			object.employeeName = "David";
			System.out.println(object.employeeID + " " +object.employeeName);
			
			//Calling the sum method
			System.out.println(Sum(2, 3));
			
			//calling studentInfo method
			System.out.println(studentInfo("FirstName: David LastName: John Subject: Java University: George Masson"));
		}
		public static int Sum(int a, int b) {
			return a + b;
		}
		public static String studentInfo(String sudentInfo) {
			return sudentInfo;	
		}
	

}
