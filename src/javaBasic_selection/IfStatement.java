package javaBasic_selection;

public class IfStatement {

	public static void main(String[] args) {
		
	int age = 19;
		
	if (age >21) {
	System.out.println("Age is more then 21, the person can drive");
			
	} else {
	 System.out.println("Age is not more then 21. the person can not drive");
	
	 int nOfDoor = 4;
		
	    if (nOfDoor > 2) {
	    	System.out.println("The car should fit 2 person");
	    } else {
	    	
	    System.out.println("meh" );
	     }
		
	  int door = 4;
	  
	  if (door >= 4) {
		  System.out.println("it could fit more then that 4 person");
	  } 
		 
	  
		int grade = 55;
		if(grade >= 90) {
			System.out.println("you got an A");
		} else if (grade >= 80) {
			System.out.println("you got a B");
		} else if (grade >= 70) {
			System.out.println("you got a C");
		} else if (grade >= 60) {
			System.out.println("you got a D");
		} else {
			System.out.println("Failled");
		}
//       IF Statement can be done this way too
	double score = 99;
		
		if (score >= 90) {
			System.out.println( "you got A" + ((score >= 95) ? "+": "-" ));
		}else if (score >= 80) {
			System.out.println("you got B" + ((score >= 85) ? "+": "-"));
		}else if (score >= 70) {
			System.out.println("you got C" +((score >= 75) ? "+" : "-"));
		}else if (score >= 60) {
			System.out.println("you got D" + ((score >= 65) ? "+" : "-"));
		} else {
			System.out.println("You falilled");
		}
		
	  
		boolean attendingTheClass = true;
		double participation = 75.8;
		double scores = 89.7;
		
		if (attendingTheClass == true && participation > 60 && scores > 80) {
			System.out.println("student is doing good");
		}
		
		
		
		
		
		
		
		
		
		
		
	  
	  
	  }	
			
		}
				

	}


