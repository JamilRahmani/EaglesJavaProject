package practiceSeasons;

public class VendingMachine {

	public static void main(String[] args) {
		
		String [][] ProductPrice = new String [2][4];
		ProductPrice[0][0] = "Pepsi";
		ProductPrice[0][1] = "Water";
		ProductPrice[0][2] = "Cola";
		ProductPrice[0][3] = "Redbull";
		ProductPrice[1][0] = "2";
		ProductPrice[1][1] = "1";
		ProductPrice[1][2] = "2";
		ProductPrice[1][3] = "3";
		
		String [] vendingMachineInfo = new String [8];
		
		vendingMachineInfo[0] = "Healthy Products";
		vendingMachineInfo[1] = "Address: Springfield, VA";
		vendingMachineInfo[2] = "Host: Vending Company";
		vendingMachineInfo[3] = "Cashier: Emma";
		vendingMachineInfo[4] = "27-April-2021";
		vendingMachineInfo[5] = "02:30:00";
		vendingMachineInfo[6] = "Thanks for Shopping with us";
		vendingMachineInfo[7] = "htts://www.healthyproducts.com";
		
		for(int i = 0; i < vendingMachineInfo.length; i++) {
			System.out.println(vendingMachineInfo[i]);
		}
		
		System.out.println("\t");
		
		
		String [] itemsSold = {"Redbull",   "Water", "Cola"};
		
		for (int i = 0; i <itemsSold.length; i++){
		
			if (itemsSold[i] == "Pepsi")
				
		{			
				System.out.println();
				System.out.println("Product: "+ProductPrice[0][0] + "\nPrice:  "+ProductPrice[1][0]);
		}
		
		if (itemsSold[i] == "Water") {
				System.out.println();
				System.out.println("Product: "+ProductPrice[0][1] + "\nPrice:  "+ProductPrice[1][1]);
		}
		
		if ( itemsSold[i] == "Cola") {
			System.out.println();
			System.out.println("Product: "+ProductPrice[0][2] + "\nPrice:  "+ProductPrice[1][2]);
		}
		
		if (itemsSold[i] == "Redbull") {
						
			System.out.println();
			System.out.println("Product: "+ProductPrice[0][3] + "\nPrice:  "+ProductPrice[1][3]);
		}
	   }
		
	/*	String [][] ProductPrice = new String [2][4];
		ProductPrice[0][0] = "Pepsi";
		ProductPrice[0][1] = "Water";
		ProductPrice[0][2] = "Cola";
		ProductPrice[0][3] = "Redbull";
		ProductPrice[1][0] = "2";
		ProductPrice[1][1] = "1";
		ProductPrice[1][2] = "2";
		ProductPrice[1][3] = "3";
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
				System.out.println("Product: "+ProductPrice[0][0] + "\nPrice:  "+ProductPrice[1][0]);
				break;
		case "Water":
			for(int i = 0; i < vendingMachineInfo.length; i++) {
				System.out.println(vendingMachineInfo[i]);
			}
				System.out.println();
				System.out.println("Product: "+ProductPrice[0][1] + "\nPrice:  "+ProductPrice[1][1]);
				break;
		case "Cola":
			for(int i = 0; i < vendingMachineInfo.length; i++) {
				System.out.println(vendingMachineInfo[i]);
			}
			System.out.println();
			System.out.println("Product: "+ProductPrice[0][2] + "\nPrice:  "+ProductPrice[1][2]);
			break;
		case "Redbull":
			for(int i = 0; i < vendingMachineInfo.length; i++) {
				System.out.println(vendingMachineInfo[i]);
			}
			System.out.println();
			System.out.println("Product: "+ProductPrice[0][3] + "\nPrice:  "+ProductPrice[1][3]);
			break;
		}*/
	}

}
