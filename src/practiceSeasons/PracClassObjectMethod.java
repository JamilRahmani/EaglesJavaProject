package practiceSeasons;

public class PracClassObjectMethod {
	
	//We declared our instance variables/non-static class variable
	String city;
	String zipcode;
	
	public PracClassObjectMethod() {
		//we initialized the instance variables
		city = "";
		zipcode = "";
	}
	
	public void printinfo() {
		System.out.println(city);
		System.out.println(zipcode);
	}
	
	@Override
	public String toString() {
		return "[city Name: " + city+" ZipCode: "+ zipcode+ "]";
	}
	
	
	
	
	
	

}
