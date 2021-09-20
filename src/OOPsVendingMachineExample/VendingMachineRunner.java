package OOPsVendingMachineExample;



public class VendingMachineRunner {
	
	// we want to have a place to run and interact with all of the vending machines
		// that we have
		// try to create multiple vending machines
		// try to add items to each of these machines
		// try to buy items from these machines
	
		public static void main(String[] args) {
			Product mm = new Product("M&M", "candy", "1/1/2050", 5.50);
			Product chips = new Product("Lays", "chips", "1/1/2050", 2.99);
			
			VendingMachine machine1 = new VendingMachine();
			VendingMachine machine2 = new VendingMachine();
			
			machine1.addItem(mm, 0, 0, 5);
			machine1.addItem(mm, 0, 0, 3);
			machine1.addItem(chips, 0, 1, 4);
			machine1.addItem(chips, 0, 2, 2);
			machine1.addItem(mm, 0, 3, 6);
			
			machine1.sellItem(0, 0, 2);
			machine1.sellItem(0, 1, 55);
			
			machine1.addItem(mm, 0, 0, 15);
			
			
			
			
			
			System.out.println(machine1.toString());
			System.out.println("*******************");
			machine1.printAllStock();
			
		}
		
		
	
	
	
	
	
	
	
	

}
