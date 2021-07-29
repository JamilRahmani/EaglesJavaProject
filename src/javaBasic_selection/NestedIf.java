package javaBasic_selection;

public class NestedIf {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 3;
		 
		if (x > y) {
			System.out.println("x is bigger then y");
			
			if (x >(y*2)) {
				System.out.println("x is actually bigger then twice as much of y");
				
				if (x >(y*3)) {
					System.out.println("x is much bigger then y");
				}
			}
			
		}
		

	}

}
