package StringManipulation;

public class StringEqualityExample {

	public static void main(String[] args) {

		
		String str1 = "testing";
		String str2 = "testing";
		System.out.println(str1 ==str2);
		
		
		String str3 = "esting";
		String str4 = new String ("testing");
		System.out.println(str3 == str4);
		System.out.println(str3.equals(str4));
		System.out.println(str2.contentEquals(str3));
		
		System.out.println(str1.indexOf('n', 0));
		System.out.println(str1.lastIndexOf('t'));

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
