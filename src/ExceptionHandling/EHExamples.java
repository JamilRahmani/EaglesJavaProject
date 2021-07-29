package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class EHExamples {
	
	public static void main(String[] args) {
		
		int x = 10;
		int y = 0;
		
		try {
		System.out.println(x/y);
		}catch (ArithmeticException e) {
			System.out.println("your dividing by zero");
			e.printStackTrace();
		}
		
		
		
		try{
		      int data =800/0;
		   }catch(ArithmeticException e){System.out.println(e);}
		   System.out.println("that is it...");
		  }
	
			
	
		
	
	
	
	public static void readFile(String path) throws FileNotFoundException  {
		FileInputStream fin = new FileInputStream("file1.text");
	}

}
