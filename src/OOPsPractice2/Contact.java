package OOPsPractice2;

public class Contact {
	

	
		private String addressLine1;
		private String addressLine2;
		private String addressState;
		private String addressCity;
		private String addressZipCode;
		private String email;
		private int phone;
		
		public Contact(String addressLine1, String addressLine2, String addressState, String addressCity,
				String addressZipCode, String email, int phone) {
			this.addressLine1 = addressLine1;
			this.addressLine2 = addressLine2;
			this.addressState = addressState;
			this.addressCity = addressCity;
			this.addressZipCode = addressZipCode;
			this.email = email;
			this.phone = phone;
		}
		public String getAddressLine1() {
			return addressLine1;
		}
		public void setAddressLine1(String addressLine1) {
			this.addressLine1 = addressLine1;
		}
		public String getAddressLine2() {
			return addressLine2;
		}
		public void setAddressLine2(String addressLine2) {
			this.addressLine2 = addressLine2;
		}
		public String getAddressState() {
			return addressState;
		}
		public void setAddressState(String addressState) {
			this.addressState = addressState;
		}
		public String getAddressCity() {
			return addressCity;
		}
		public void setAddressCity(String addressCity) {
			this.addressCity = addressCity;
		}
		public String getAddressZipCode() {
			return addressZipCode;
		}
		public void setAddressZipCode(String addressZipCode) {
			this.addressZipCode = addressZipCode;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public int getPhone() {
			return phone;
		}
		public void setPhone(int phone) {
			this.phone = phone;
		}
		
		
		
		
		
		
		
		
		
}


