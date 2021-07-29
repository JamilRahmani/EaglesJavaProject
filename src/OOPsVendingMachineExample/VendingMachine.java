package OOPsVendingMachineExample;

public class VendingMachine {
	
	
	// create a blue print for a vending machine
		// it should be able to store all of the items in the machine
		// it should define where each item is located
		// it should keep track of the qty available of each item
		// it should be able to sell an item
		// it should be able to print a receipt for items sold
		// it should be able to print a list of all items available
		// Product
		// [M&M] [Lays] [ ] [ ]
		// [ ] [ ] [ ] [ ]
		// [][][][][][][]
		// quantity of each
		// [5] [5] [ ] [ ]
		// [ ] [ ] [ ] [ ]
		// [][][][][][][]
		// declare variables
		private Product[][] products;
		private int[][] quantities;
		private int maxQuantity;
		
		// create constructor
		public VendingMachine() {
			products = new Product[3][];
			products[0] = new Product[4];
			products[1] = new Product[4];
			products[2] = new Product[7];
			
			quantities = new int[3][];
			quantities[0] = new int[4];
			quantities[1] = new int[4];
			quantities[2] = new int[7];
			
			maxQuantity = 15;
		}
		public void addItem(Product item, int row, int col, int qty) {
			if (quantities[row][col] + qty > maxQuantity) {
				// dont add the item
				System.out.println("We are exceeding the maximum quantity by "
						+ ((quantities[row][col] + qty) - maxQuantity) + ". can not proccess this request.");
			} else {
				products[row][col] = item;
				quantities[row][col] = quantities[row][col] + qty;
			}
		}
		public void sellItem(int row, int col, int qty) {
			// we have to check our stock and see if the requested qty is available
			if (qty > quantities[row][col]) {
				// we dont have availability
				System.out.println("The requested amount of " + qty + " is not available at the moment. We only have "
						+ quantities[row][col] + " available!");
			} else {
				System.out.println(qty + " of " + products[row][col] + " dropped");
				quantities[row][col] -= qty;
			}
		}
		public void printAllStock() {
			int sum = 0;
			double total = 0;
			System.out.println("*** List of all Products in the Machine ***");
			System.out.println("Row    Col   Quantity    Name&Price");
			for (int row = 0; row < quantities.length; row++) {
				for (int col = 0; col < quantities[row].length; col++) {
					if (quantities[row][col] > 0) {
						System.out.println(row + "\t" + col + "\t" + quantities[row][col] + "\t " + products[row][col]);
						sum += quantities[row][col];
						total += (products[row][col].getPrice() * quantities[row][col]);
					}
				}
			}
			System.out.println("The total number of items in the machine is " +sum);
			System.out.println("The total cash vlaue of all the products in the machine is "+total
					);
		}
		public String toString() {
			String line1 = "[\t" + products[0][0] + quantities[0][0] + "\t][\t" + products[0][1] + quantities[0][1]
					+ "\t][\t" + products[0][2] + quantities[0][2] + "\t][\t" + products[0][3] + quantities[0][3] + "\t]";
			String line2 = "[\t" + products[1][0] + quantities[1][0] + "\t][\t" + products[1][1] + quantities[1][1]
					+ "\t][\t" + products[1][2] + quantities[1][2] + "\t][\t" + products[1][3] + quantities[1][3] + "\t]";
			String line3 = "[\t" + products[2][0] + quantities[2][0] + "\t][\t" + products[2][1] + quantities[2][1]
					+ "\t][\t" + products[2][2] + quantities[2][2] + "\t][\t" + products[2][3] + quantities[2][3] + "\t]"
					+ "[\t" + products[2][4] + quantities[2][4] + "\t] [\t" + products[2][5] + quantities[2][5] + "\t] [\t"
					+ products[2][6] + quantities[2][6] + "\t]";
			return line1 + "\n" + line2 + "\n" + line3;
		}
	
	
	
	
	
	
	
	
	
	
	

}
