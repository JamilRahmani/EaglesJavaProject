package RUsBank;

public class CustomerDataBase {
	
	public static void main(String[] args) {
		
		
		//for company account number us this code: 5555
		//for branch account number use this code: 5555
		USBankBranch obj = new USBankBranch();
		obj.setCompanyAccountNbr(5555);
		obj.setBranchAccountNbr(5555);
		obj.setCustomerNbr(1);
		
		System.out.println("Company Account Number: "+obj.getCompanyAccountNbr(5555));
		System.out.println("Branch Account Number: "+obj.getBranchAccountNbr(5555));
		System.out.println("Customer Id: "+obj.getCustomerNbr());
		
		
	}

}
