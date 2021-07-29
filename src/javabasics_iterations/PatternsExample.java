package javabasics_iterations;

public class PatternsExample {

	public static void main(String[] args) {
	
		// 1 
		// 1 2 
		// 1 2 3
		// 1 2 3 4
		// 1 2 3 4 5
		
		for ( char j = 1; j<= 5;j++) {
			for (int i = 1; i <= j; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		
			for (int f = 1; f<=17; f++) {
				for (int x = 2; x<=17; x++) { 
				System.out.print(x + " ");
			}
			System.out.println();
		}
		
		    //5 4 3 2 1
			//5 4 3 2 
			//5 4 3 
			//5 4  
			//5 
			for (int a = 1; a <= 5; a++) {
				for (int x = 5; x >=a; x--) {
				System.out.print(x +" ");
			}
			System.out.println();
		}
			
			//1
			//2 3
			//4 5 6
			//7 8 9 10
			//11 12 13 14 15
			int temp = 1;
			for ( char j = 1; j<= 5;j++) {
				for (int i = 1; i <= j; i++) {
					System.out.print(temp++ + "\t");
				}
				System.out.println();
			}
			int size = 5;
			
			for (int x =1; x <= size;x++) {
				for (int y =1;y<=x;y++) {
					System.out.print(x +" ");
					
			}
				System.out.println();
			}
		
			for(int line = 4; line>=1; line--) {
				for (int num =1; num<=line;num++) {
					System.out.print(line + " ");
					
			}
				System.out.println();
			
			}
		
	
			
			
			
		
		
	}

}
