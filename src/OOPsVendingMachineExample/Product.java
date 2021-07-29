package OOPsVendingMachineExample;

public class Product {

	// design a blue print that could take any product information
	// things like name, description, expiration date, price
	// declare variables
	private String name;
	private String description;
	private String expirationDate;
	private double price;
	// create constructors
	// default constructor
	public Product() {
		this.name = "";
		this.description = "";
		this.expirationDate = "";
		price = 0;
	}
	// create a parameterized constructor
	public Product(String name, String description, String expirationDate, double price) {
		this.name = name;
		this.description = description;
		this.expirationDate = expirationDate;
		this.price = price;
	}
	// create getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	// implement toString method
	public String toString() {
		return name + " ($" + price + ")";
	}
	
	
	
	
	
	
	
	
	
	
}
