package OOPsPractice2;

public class AzizPractice {

	public static void main(String[] args) 
	{
		
		for (int i = 3; i >= 1;i--) {
			System.out.println("I - "+i);
			for (int j = 1; j <= 3; j++) {
				System.out.println("J + "+ j);
			}
		}
		
		String str = "test";
		String str2 = "Test";
		String str3 = new String("test");
		String str4 = new String("test");
		
		System.out.println(str==str2);
		System.out.println(str2==str3);
		System.out.println(str2.equals(str3));
		System.out.println(str3.equals(str4));
		

		
		
		
		
		
	}
	
		
}



