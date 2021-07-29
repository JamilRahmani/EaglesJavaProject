package javabasics_iterations;

public class ForLoopExample {

	public static void main(String[] args) {
		
		// for (1 initialization ; 2 conditions ; 3 update ) { body of the loop }
		for (int x = 1; x < 5; x++) {
			System.out.println((x + 1) + ". " + x);
		}

		System.out.println("********** Example *********");
		for  (int j = 0 ; j <= 17 ; j +=3) {
			System.out.println(j);
		}
		
		// code Iteration that give us 1 to 10
		for (int a = 1 ; a < 11 ; a++) {
			System.out.println(a);
		}
		
		for (int s = 15; s >= 8 ; s--) {
			System.out.println(s);
		}
		
		for ( int i = 0; i<5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.println("i:" + i + " j:" + j);
			}
		}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
