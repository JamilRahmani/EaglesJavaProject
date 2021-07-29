package RUsBank;

public class USBankBranch extends USBank{

	//8950
	
		public int getCompanyAccountNbr(int passCode) {
			if(passCode == 5555) {
				return super.getCompanyAccountNbr(8950);
			}else {
				return 400;
			}
		}
		public void setCompanyAccountNbr(int CompanyAccountNbr) {
			CompanyAccountNbr = 234567;
			super.setCompanyAccountNbr(CompanyAccountNbr);
		}
		public int getBranchAccountNbr(int passCode) {
			if(passCode == 5555) {
				return super.getBranchAccountNbr(passCode);
			}else {
				return 400;
			}
			
		}
		public void setBranchAccountNbr(int BranchAccountNbr) {
			BranchAccountNbr = 112233;
			super.setBranchAccountNbr(BranchAccountNbr);
		}
}
