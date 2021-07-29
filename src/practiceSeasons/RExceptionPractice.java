package practiceSeasons;

public class RExceptionPractice {

	public static void main(String[] args) throws Exception {

		studentInfo(20, 1500);
		studentName("Asadullah");
		studentName("Asadullhanjan");
		

	}

	public static void studentInfo(int studentAge, int StudentIncome) throws Exception {
		if (studentAge < 18 || StudentIncome > 2000) {
			throw new Exception("Student is not eligible for financial aid");
		} else {
			System.out.println("Student is eligible for financial aid");
		}
	}

	public static void studentName(String name) throws Exception {
		int nameLength = name.length();
		if (nameLength > 10) {
			throw new Exception("Name lenght is more then 10 characters");
		}
	}
	
	
	
	
	

}
