package GroupPractice;

public class IncrementAndDecrement {

	public static void main(String[] args) {

		String str = "Freshta";
		String str2 = "";
		
		for (int i = str.length()-1; i >=0; i--) {
			str2 += str.charAt(i);
		}
		System.out.println(str2);
		
		
		for (int i = -1; i >= -10; i--) {
			System.out.println(i);
		}

		int a = 10;
		int b = ++a;// 1+a= 11
		
		System.out.println(a);

		System.out.println(++a);
		//System.out.println(a);

		
		System.out.println(a);
		System.out.println(b);
		
		int c = 10;
		int d = c++;// c=10 c+1=11
		System.out.println(c);
		System.out.println(d);
		
	}

}
