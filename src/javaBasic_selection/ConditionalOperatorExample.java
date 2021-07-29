package javaBasic_selection;

public class ConditionalOperatorExample {
	
	public static void main(String [] args) {
		
		double grade = 50;
		String s = "The student is ";
		
	//	s += (grade >= 60) ? "passing. " : "failling. ";
		
		if (grade >= 60) {
			s += "passing";
		}else {
			s += "failling ";
		}
		
		if (grade >= 60) {
			s = s + "passing";
		}else {
			s = s + "failling";
		}
		System.out.println(s);
		
		int age = 25;
		
		System.out.println((age >= 21) ? "the person can drive": "can not drive");
		
		
		double bill = 19.88;
		
		System.out.println((bill > 25) ? "Qualifies for the 10% discount" : "no discount");
		
		if (bill > 25) {
			System.out.println("Qualifies for the 10% discount");
		}else {
			System.out.println("no discount");
		}
		
		
		
		
		
		
		
		
		
	}

}
