package GroupPractice;


public class GP {

	public static void main(String[] args) {

		String str3 = "Freshta";
		String rev = "";
		for(int i = str3.length()-1; i >= 0; i--) {
			rev += str3.charAt(i);
		}
		System.out.println(rev);
	
		StringBuffer s = new StringBuffer("Freshta");
		String str = "Ghazal12";
		String str2 = "Freshta";
		
		// ==  will check the reference number in the stack
		//.equal  is checking the value
		if (str2 != (s.toString())) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		int k = 0;
		while (k < str.length() ) {
			System.out.println(str.charAt(k));
			k++;
		}
		
		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i) + " ");
		}
		
		
		
		
		
		
		
	}

}
