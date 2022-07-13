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
		
		String [] strArray =  {"test","not","test","test","test"};
		
		boolean duplicate = false;
		
		for (int i  = 0; i<strArray.length; i++) {
			for (int j = i +1; j<strArray.length;j++) {
				if (strArray[i] == strArray[j]) {
					
					System.out.println(i + " And "+ j + " Contains duplicate");
				}
			}
		}
		
		String name = "this is my first java code";
		String [] len = name.split(" ");
		String reverse = "";
		
		for (int i = 0; i < len.length; i++) {
			String word = len[i];
			for (int j = word.length()-1 ;j >=0; j--) {
				reverse += word.charAt(j);
				
			}
			reverse += " ";
		}
		System.out.println(reverse);
		
		
		
		
		
		
	}
	
		
}



