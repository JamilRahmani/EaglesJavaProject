package RUsBank;

public class USBank {
	
	private int companyAccountNbr;
	private int branchAccountnbr;
	private int customerNbr;
	
	public USBank() {
		companyAccountNbr = 0;
		branchAccountnbr = 0;
		customerNbr = 0;
	}
	public USBank(int CompanyAccountNbr, int BranchAccountNbr, int CustomerNbr) {
		this.companyAccountNbr = CompanyAccountNbr;
		this.branchAccountnbr = BranchAccountNbr;
		this.customerNbr = CustomerNbr;
	}
	public int getCompanyAccountNbr(int passCode) {
		if(passCode == 8950) {
			return companyAccountNbr;
		}else {
			return 400;
		}
		
	}
	public void setCompanyAccountNbr(int CompanyAccountNbr) {
		CompanyAccountNbr = 234567;
		this.companyAccountNbr = CompanyAccountNbr;
	}
	
	public int getBranchAccountNbr(int passCode) {
		return branchAccountnbr;
	}
	public void setBranchAccountNbr(int BranchAccountNbr) {
		this.branchAccountnbr = BranchAccountNbr;
	}
	
	public int getCustomerNbr() {
		return customerNbr;
	}
	public void setCustomerNbr(int CustomerNbr) {
		this.customerNbr = CustomerNbr;
	}

}
