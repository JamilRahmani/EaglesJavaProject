package oopsBasics;

public class Prac {

	
	public static void main(String[] args) {
		
		System.out.println("Test"+10+20);
		System.out.println(10+20+"Test");
		
		String p = "tueeter";
		
		for (char i : p.toCharArray()) {
			if (p.indexOf(i)!= p.indexOf(i)) {
			System.out.println("first non repeated char "+ i);
			break;
			}
		}
	
		        
		int[] num = {1,2,3,4,3,2,1};
		
		for (int forward = 0, backward = num.length-1; forward < num.length; forward++,backward--) {
			if(forward == backward || forward > backward) {
				System.out.println("pali number");
				break;
			}
			if(num[forward] != num[backward]){
				System.out.println("not pali");
				break;
			}
		}
		System.out.println();
	
		
		String s = "public";
		s.concat(" new");
		System.out.println(s);
		System.out.println(s.concat(" sapient"));
		
		String [] name = {"java", "test", "java", "phython", "java","java"};
		int c = 0;
		String dup = "";
 		 for (int i = 0; i < name.length; i++) {
				if (name[i] == "java") {
					dup = name[i];
					c++;
				}
		}
 		System.out.println( dup+", "+ c);
 		
		int q = 4;
		int b = 8;
		if((b-q--)>=q) {
			if((b+q)%2==1)
				System.out.println(q+b);
			else
				System.out.println("not");
		}
		
		
		
		
	}
	
}
