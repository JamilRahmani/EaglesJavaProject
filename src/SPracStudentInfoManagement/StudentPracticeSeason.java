package SPracStudentInfoManagement;

public class StudentPracticeSeason {
	

		int[] studentID;
		String[] firstName;
		String[] lastName;
		String[] classes;
		double[] classFee;
		double totalFee;
		
		public StudentPracticeSeason() {
			studentID = new int[10];
			firstName = new String[10];
			lastName = new String[10];
			classes = new String[10];
			classFee = new double[10];
			totalFee = 0.0;
		}
				public void printStudentInfo() {
			for(int i = 0; i < studentID.length; i++) {
				if(firstName[i] != null) {
					System.out.println("Student ID: "+(i+1));
				}
			}
			for(int i = 0; i < firstName.length; i++) {
				if(firstName[i] != null) {
					System.out.println("Student FirstName: "+firstName[i]);
				}
			}
			for(int i = 0; i < lastName.length; i++) {
				if(lastName[i] != null) {
					System.out.println("Student LastName: "+lastName[i]);
				}
			}
			for(int i = 0; i < classes.length; i++) {
				if(classes[i] != null) {
					System.out.println("Class Student is Enrolling into: "+classes[i]);
					if(classes[i].equals("Java")) {
						System.out.println("Java Fee is: "+ 600);
						classFee[i] = 2000;
						classFee[i] -= 250;
					}else if(classes[i].equals("SQL")) {
						System.out.println("SQL Fee is: "+500);
						classFee[i] = 500;
					}else if(classes[i].equals("Selenium")) {
						System.out.println("Selenium Fee is: "+700);
						classFee[i] = 700;
					}else if(classes[i].equals("API")) {
						System.out.println("API Fee is: "+900);
						classFee[i] = 900;
					}
					
					totalFee += classFee[i];
				}
			}
			System.out.println("Total of Fee is: "+totalFee+ "\n");
			for(int i = 0; i < classFee.length; i++) {
				if(classFee[i] != 0) {
				}
			}
		}
	
	
	
	
	
	
	
	
	
	
	
	
}
