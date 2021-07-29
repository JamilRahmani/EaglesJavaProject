package ExceptionHandling;

public class ExceptionExampleTRYandCATCH {

	public static void main(String[] args) {

		
		int [] data = {0,2, 3, 4, 5,};
		String test = null;
		
		try {
			System.out.println(10 / data[2]);
			
//			System.out.println(test.length());
			
		} catch (IndexOutOfBoundsException e) {
			System.out.println("IndexOutOfBoundsException");
			throw e;
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException");
		}catch (Exception e) {
			System.out.println("Exception");
		} finally {
			System.out.println("Finally block");
		}
		

		// throw is a keyword that can execute an exception
				// e.g. ( throw new Exception; )
				
				// throws is a way to handle exception, you can add throws to the definition of your methods
				// to have the people who are calling the method deal with the exception
				
				// interview question
				// what's the difference between final, finally, finalize
				// - final is a specifier that makes the variable final and non-changeable
				// - finally is an optional block in try/catch
				// - finalize is a method in Garbage Collection process that will be ran before element is collected
		
		
		
	}

}
