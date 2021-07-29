package practiceSeasons;

public class PracticeSeason1 {

	public static void main(String[] args) {
		
		String firstname = "jamil";
		String lastname = "Rahman";
		
		System.out.println("First Name Is: "+firstname +", "+"\n Last Name is: "+lastname);
		
		int number = 1;
		
		++number;
		++number;
		number++;
		System.out.println(number);
		
		int nbrstudent = 100;
		nbrstudent -= 25;
		System.out.println(nbrstudent);
		nbrstudent += 25;
		System.out.println(nbrstudent);
		
		
		int bill1, bill2, bill3;
		bill1 = 350;
		bill2 = 350;
		bill3 = 350;
		int total = 1350;
		
		int billAmount = bill1 + bill2 + bill3;
		
		if (total == billAmount) {
			System.out.println("the Amount is calcullated accurately");
			}else {
				System.out.println("the Amount is not calculated accurately");
			}
		
		
		int student = 50;
		
		if (student < 60)
			System.out.println("your are falling");
		else
			System.out.println("you are passing");
		
		boolean blnb = 57 < 17 || !(true) && 'c' != 'd' || (true ^ false);
		if (blnb) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		int x = 50;
		
		if (x >70) {
			System.out.println("X is greater");
		}else {
			System.out.println("x is not greater");
		}

	}

}
