package SPracStudentInfoManagement;

public class RunnerStudentPracticeSea {

	public static void main(String[] args) {

		
		StudentPracticeSeason obj1 = new StudentPracticeSeason();
		obj1.firstName[0] = "David";
		obj1.lastName[0] = "John";
		obj1.classes[0] = "Java";
		obj1.classes[1] = "SQL";
		obj1.classes[2] = "API";
		obj1.printStudentInfo();
		
		StudentPracticeSeason obj2 = new StudentPracticeSeason();
				
		obj2.firstName[1] = "Ahmed";
		obj2.lastName[1] = "Khan";
		obj2.classes[1] = "Java";
		obj2.classes[2] = "SQL";
		obj2.classes[3] = "API";
		obj2.printStudentInfo();
		
		StudentPracticeSeason obj3 = new StudentPracticeSeason();
		
		obj3.firstName[2] = "Ahmed";
		obj3.lastName[2] = "Khan";


		obj3.printStudentInfo();
		
		
		
		
		
		
		
		
	}

}
