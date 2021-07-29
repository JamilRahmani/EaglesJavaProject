package OOPsPractice2;

public class RunnerCustomer {

	public static void main(String[] args) {

		
		Customer []customersdata = new Customer[5];
		
		customersdata[0] = new Customer("Jack", "", "Ma", "CEO", "Male", 85, "123-12-1234", new Contact("somewhere", "nice", "VA", "Arlington", "220185", "jack@ssomething.com", 2025874681));
		

		
		
		
		for (int i = 0; i< customersdata.length;i++) {
			System.out.println(customersdata[i]);
		}
		
		
		
		
		
		
		
	}

}
