package javaBasic_selection;

public class SwitchExamples {

	public static void main(String[] args) {

		String task = "cooking";
		
		System.out.println("i am working on this task now-----" + task);
		System.out.println("so the remaning tasks are :");

		switch (task) {

		case "shopping":
			System.out.println("shopping");
		case "cooking":
			System.out.println("cooking");
		case "cleaning the house":
			System.out.println("cleaning the house");
		case "studying":
			System.out.println("studying");
		case "doing assignment":
			System.out.println("doing assignment");
			break;
			}
		
	// no charged - play it in!
	// half charged - you could charge it a bit more!
	// more charged - Un-plug the phone!	
		String str = "charged";
		
		switch (str) {
		
		case "no charged":
			System.out.println("play it in");
			break;
		case "half charged":
			System.out.println("you could charge it a bit more");
			break;
		case "charged":
			System.out.println("unplug the phone");
		break;
		}
		
		System.out.println("******** Doing the same thing with an IF statement");
		if (str.equals("no charged")){
			System.out.println("play it in");
		}else if (str.equals("half charged")){
			System.out.println("you could charge it a bit more");
		}else if (str.equals("charged"));{
			System.out.println("unplug the phone");
		}
		
		double score = 70;
		
		if (score >= 95) {
			System.out.println("Grade A+");
		}else if (score >= 90) {
				System.out.println("Grade A-");
		}else if (score >= 85) {
			System.out.println("Grade B+");
		}else if (score >= 80) {
			System.out.println("Grade B-");
		}else if (score >= 75) {
			System.out.println("Grade c+");
		}	else if (score >= 70) {
				System.out.println("Grade c-");
		}else if (score >= 65) {
			System.out.println("Grade D+");
		}	else if (score >= 60) {
				System.out.println("Grade D-");
		}else {
			System.out.println("Failled");
		}

		
		
		System.out.println(str.equals("no charge"));
		

	}

}
