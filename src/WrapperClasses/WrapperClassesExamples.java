package WrapperClasses;

public class WrapperClassesExamples {

	public static void main(String[] args) {

//  primitive data type -----  Wrapper data type
//		byte					Byte        
//		short					Short
//		int						Integer
//		long					Long
//		float					Float
//		double					Double
//		char					Character
//		boolean					Boolean
		
		int x = 10;
		String str = "20";
		
		System.out.println(x+str); //1020
		System.out.println(x + Integer.valueOf(str));
	
		
		
	}

}
