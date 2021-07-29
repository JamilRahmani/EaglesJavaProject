package practiceSeasons;

public class PracticeSeasion4 {

	public static void main(String[] args) {
		
		//compile time errors
		//run time errors
		//single and multi dimensional array
		//enhanced for loop: we can use it only with arrays and collection
		//int arr [] : single declaration, also with multi declaration
		//int [] arr :
		
		
		//for Numbers: int, double, float, nbr = 5;
		
		// Data types
		// primitive data type: (char, int, double,boolean)
		// Reference data type: (String: String is also object)
		// array data type:  (all the above)
		
		// Vending machine
		// product
//		String[] products = new String [4];
//		products[0] = "Pepsi";
//		products[1] = "Cola";
//		products[2] = "Redbull";
//		products[3] = "Water";
//		
//		int [] productprices =new int [4];
//		productprices[0] = 3;
//		productprices[1] = 4;
//		productprices[2] = 6;
//		productprices[3] = 2;
//		
//		String [] vindingmachineinfo = new String [8];
//		vindingmachineinfo[0] = "Healthey products";
//		vindingmachineinfo[1] = "Address: Alexandria, va";
//		vindingmachineinfo[2] = "Host: vending compay";
//		vindingmachineinfo[3] = "Cashier: Khalid";
//		vindingmachineinfo[4] = "22/May/2020";
//		vindingmachineinfo[5] = "05:45:12";
//		vindingmachineinfo[6] = "Thanks for shopping with us";
//		vindingmachineinfo[7] = "http://www.healthyproducts.com";
//		
//		String itemSold = "Redbull";
//		
//		
//		switch (itemSold) {
//		case "Pepsi":
//			for (int i =0; i< vindingmachineinfo.length; i++) {
//				System.out.println(vindingmachineinfo[i]);
//			}
//			System.out.println();
//			System.out.println("Product: " + products[0]);
//			System.out.println("Price: "+ productprices[0]);
//			break;
//		case "Cola":
//			for (int i =0; i< vindingmachineinfo.length; i++) {
//				System.out.println(vindingmachineinfo[i]);
//			}
//			System.out.println();
//			System.out.println("Product: " + products[1]);
//			System.out.println("Price: "+ productprices[1]);
//			break;
//		case "Redbull":
//			for (int i =0; i< vindingmachineinfo.length; i++) {
//				System.out.println(vindingmachineinfo[i]);
//			}
//			System.out.println();
//			System.out.println("Product: " + products[2]);
//			System.out.println("Price: "+ productprices[2]);
//			break;
//		case "Water":
//			for (int i =0; i< vindingmachineinfo.length; i++) {
//				System.out.println(vindingmachineinfo[i]);
//			}
//			System.out.println();
//			System.out.println("Product: " + products[3]);
//			System.out.println("Price: "+ productprices[3]);
//		}
//		
		
		//Products
		String[][] productPrices = new String [4][4];
		String [][] products = new String [4][4];
		products[0][0] = "Pepsi";
		productPrices[1][0] = "2";
		
		products[0][1] = "Water";
		productPrices[1][1] = "1";
		
		products[0][2] = "Cola";
		productPrices[1][2] = "2";
		
		products[0][3] = "Redbull";
		productPrices[1][3] = "3";
		

				
				String [] vendingMachineInfo = new String [8];
				vendingMachineInfo[0] = "Healthy Products";
				vendingMachineInfo[1] = "Address: Springfield, VA";
				vendingMachineInfo[2] = "Host: Vending Company";
				vendingMachineInfo[3] = "Cashier: Emma";
				vendingMachineInfo[4] = "27-April-2021";
				vendingMachineInfo[5] = "02:30:00";
				vendingMachineInfo[6] = "Thanks for Shopping with us";
				vendingMachineInfo[7] = "htts://www.healthyproducts.com";
				
				String itemSold = "Redbull";
				
				switch (itemSold) {
				case "Pepsi":
					for(int i = 0; i < vendingMachineInfo.length; i++) {
						System.out.println(vendingMachineInfo[i]);
					}
						System.out.println();
						System.out.println("Product: "+products[0]);
						System.out.println("Price  : "+productPrices[0]);
						break;
				case "Water":
					for(int i = 0; i < vendingMachineInfo.length; i++) {
						System.out.println(vendingMachineInfo[i]);
					}
						System.out.println();
						System.out.println("Product: "+products[1]);
						System.out.println("Price  : "+productPrices[1]);
						break;
				case "Cola":
					for(int i = 0; i < vendingMachineInfo.length; i++) {
						System.out.println(vendingMachineInfo[i]);
					}
					System.out.println("Product: "+products[2]);
					System.out.println("Price  : "+productPrices[2]);
					break;
				case "Redbull":
					for(int i = 0; i < vendingMachineInfo.length; i++) {
						System.out.println(vendingMachineInfo[i]);
					}
					System.out.println("Product: "+products[3]);
					System.out.println("Price  : "+productPrices[3]);
					break;
				}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
