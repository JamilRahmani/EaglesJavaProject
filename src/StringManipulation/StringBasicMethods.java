package StringManipulation;

public class StringBasicMethods {
	
	
public static void main(String[] args) {

		
		String str = "sample String";
		
		System.out.println(str.length());
		
		//charAt(index)
		// will return the char at the index
		System.out.println(str.charAt(0));
		
		//	compareTo(anotherString)
		// this method works like equals, but it will return a negative, zero, or a positive number
		// zero mean both are equal
		System.out.println("Test".compareTo("test")); // this one will check the Upper case and Lower Case if they are not matching it will give positive number
		System.out.println("Test".compareToIgnoreCase("test"));// this one will just check that these two are matching even if its upper case or lower case.
		
		
		System.out.println("I do ".concat("remember!"));
		System.out.println("I do " + "remember!");
		
//		contains(s)
		//this will check to see if the string you call this method on contains the value you pass as an arg
		System.out.println(str.contains("St"));
		
		
//		endsWith(suffix)
		// will check to see if the string you call this method on is ending with the string that you pass in the arg
		System.out.println("endswith result " + str.endsWith("ing"));
		
		
//		equals(anObject)
		System.out.println("This".equals("this"));
		System.out.println("this".equalsIgnoreCase("This"));
		System.out.println("this".toLowerCase().equals("THIS".toLowerCase()));
		
//		indexOf(ch)
		// this method will return the index number of the char that you pass as arg
		System.out.println("test".indexOf('s'));
		String value = "est";
		System.out.println("test".indexOf(value) + " - " + ("test".indexOf(value) + value.length()-1));
		System.out.println("test".indexOf('t', 1));
		
		
		//"".isEmpty() will return true if your string is empty
		System.out.println("".isEmpty());
		String str2 = "";
		System.out.println(str2.isEmpty());
		
		
//		"".lastIndexOf(ch)
		System.out.println("test".lastIndexOf('t'));
		System.out.println("testtesttesttest".lastIndexOf("est"));
		System.out.println("testtesttesttest".indexOf("est"));
		
		
//		"".length() will return the count of chars in your string
		System.out.println("123".length());
		
		
		
//		"".replace(oldChar, newChar) it will replace the old value to the new
		System.out.println("test".replace('t', 'W'));
		
		
//		"".split(regex) this method will split your string into multiple ones and store them in an array of strings
		// the split happens based on the the value you pass in arg
		
		String [] splitTestData = "this is a test".split(" ");
		for (String string: splitTestData) {
			System.out.println(string);
		}
		System.out.println(splitTestData.length);
		
//		
//		System.out.println("this is a test".startsWith("This"));
//		System.out.println("this is a test".startsWith("is", 5));
//		
		
		// "".substring(beginIndex) will return a portion of the string
		System.out.println("this is a test".substring(5));
		System.out.println("this is a test".substring(5,7));
		
		char[] charArrayTestData = "test".toCharArray();
		for (char c : charArrayTestData) {
			System.out.println(c);
		}
		
		System.out.println("TestsdSFSDAFSsadSDSA".toLowerCase());
		System.out.println("TestsdSFSDAFSsadSDSA".toUpperCase());
		
		
		String expected = "test";
		String actual = " test ";
		System.out.println(expected.trim().equals(actual.trim()));
		System.out.println(actual);
		System.out.println(actual.trim());
}

}
