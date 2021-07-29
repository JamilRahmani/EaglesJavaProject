package OOPsPractice2;

public class Customer {
	

	private String firstName;
	private String midName;
	private String lastName;
	private String Jobtitle;
	private String gender;
	private int age;
	private String ssn;
	private Contact contantInfo;
	
	public Customer(String firstName, String midName, String lastName, String jobtitle, String gender, int age,
			String ssn, Contact contantInfo) {
		this.firstName = firstName;
		this.midName = midName;
		this.lastName = lastName;
		Jobtitle = jobtitle;
		this.gender = gender;
		this.age = age;
		this.ssn = ssn;
		this.contantInfo = contantInfo;
	}
	public Customer(String firstName, String midName, String lastName, String jobtitle, String gender, int age,
			String ssn, String addressLine1, String addressLine2, String addressState, String addressCity,
			String addressZipCode, String email, int phone) {
		this.contantInfo = new Contact(addressLine1, addressLine2, addressState, addressCity, addressZipCode, email,
				phone);
		this.firstName = firstName;
		this.midName = midName;
		this.lastName = lastName;
		Jobtitle = jobtitle;
		this.gender = gender;
		this.age = age;
		this.ssn = ssn;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMidName() {
		return midName;
	}
	public void setMidName(String midName) {
		this.midName = midName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getJobtitle() {
		return Jobtitle;
	}
	public void setJobtitle(String jobtitle) {
		Jobtitle = jobtitle;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Contact getContantInfo() {
		return contantInfo;
	}
	public void setContantInfo(Contact contantInfo) {
		this.contantInfo = contantInfo;
	}
	
	public String toString() {
		return "Customer: "+ firstName+", "+ lastName+", "+age+", "+ gender+", "+ Jobtitle;
	}
	
	

}
