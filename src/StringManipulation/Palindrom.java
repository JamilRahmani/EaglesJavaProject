package StringManipulation;

public class Palindrom {

	public boolean isPalindrome(String str) {

		for (int fwdIndex = 0, bckIndex = str.length() - 1; fwdIndex < str.length(); fwdIndex++, bckIndex--) {
			// check to see if the chars are not equals
			if (str.charAt(fwdIndex) != str.charAt(bckIndex)) {
				return false;
			} else {
				System.out.println(str.charAt(fwdIndex) + " " + str.charAt(bckIndex));
			}
		}
		return true;
	}

	public static void main(String[] args) {

		Palindrom p = new Palindrom();
		System.out.println(p.isPalindrome("123454321"));

		String str2 = "madam";
		StringBuilder strRev = new StringBuilder(str2);
		System.out.println(str2.equals(strRev.reverse().toString()));

		StringBuilder stb = new StringBuilder("123");
		System.out.println(stb);
		System.out.println(stb.replace(0, stb.length() - 2, "987654321"));

		String str = "tacocat";
		// [m, a, d, a, m]
		//  0  1  2  3  4
		int last = str.length() - 1;
		
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i) + " " + str.charAt(last--));
		}
		
		// we can do it like this or the above one
		for (int fwdIndex = 0, bckIndex = str.length() - 1; fwdIndex < str.length(); fwdIndex++, bckIndex--) {
			System.out.println(str.charAt(fwdIndex) + " " + str.charAt(bckIndex));
		}

		String s1 = "test";
		String s2 = "test";
		String s3 = new String("test");
		
		System.out.println(s1.equals(s3));
		System.out.println(s1 ==(s3));
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
