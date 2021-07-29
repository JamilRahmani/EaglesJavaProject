package OOPsPractice3;

public class Parent {
	
	// if we dont initialize all of the variables it will give us a problem in the future
	private String name;
	private int age;
	private String jobTitle;
	private String addrress;
	private String email;
	private String skypeID;
	
	
	public Parent() {
		this.name = "";
		this.age = 0;
		this.jobTitle = "";
		this.addrress = "";
		this.email = "";
		this.skypeID = "";
	}
public Parent(String name, int age, String jobTitle) {
		
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
	}

	// with-- this(); -- we are calling the default constructor 
	public Parent(int age) {
		this();
		this.age = age;
	}
	
	
	public Parent(String name) {
		this();
		this.name = name;
		
	}
	
	public Parent(String jobTitle, int age) {
		this();
		this.age = age;
		this.jobTitle = jobTitle;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getAddrress() {
		return addrress;
	}
	public void setAddrress(String addrress) {
		this.addrress = addrress;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSkypeID() {
		return skypeID;
	}
	public void setSkypeID(String skypeID) {
		this.skypeID = skypeID;
	}
	
	
	
	

}
