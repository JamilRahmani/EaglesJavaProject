package practiceSeasons;

public class PracticeSeason2 {

	public static void main(String[] args) {
     
		// single selection statement
		if (3 < 6) {
			System.out.println("yes it is single selection statement");
		}else if (14 < 6) {
			System.out.println("more then one IF statement is a multi selection");
		}
		
		char x = 'J';
		x = 'D';
		String d = "mmmm";
		d = "FFFF";
		System.out.println(x + d);

		// if condition //99.99%

		int a = 10;
		if (a < 1) {
			System.out.println("1");
		} else if (a < 2) {
			System.out.println("2");
		} else if (a <= 10) {
			System.out.println("10");
		} else if (a < 3) {
			System.out.println("3");
		} else {
			System.out.println("The end of the system");
		}
		
		// Switch statement // Faster? Switch is faster
		
		int y = 2;
		switch (y) {
		case 1:
			System.out.println("1");
		break;
		case 10:
			System.out.println("10");
			break;
		case 2:
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");
		
		}
		
	// while loop
		int nofstudents = 10;
		while (nofstudents <= 15) {
		System.out.println(nofstudents + " :yes it is");
		++nofstudents;
		}
		
		
	// Do While loop	
		
		int nofteacher = 2;
		do {
			System.out.println(nofteacher + " Damn Damn");
			nofteacher++;
		} while (nofteacher >=20);
		System.out.println(nofteacher + " printed at anytime");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
