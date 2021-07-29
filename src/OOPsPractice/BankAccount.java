package OOPsPractice;

public class BankAccount {

	String firstName;
	String lastName;
	int age;
	
	double balance;
	
	// default constructor
	public BankAccount() {
		firstName = "";
		lastName = "";
		age =0;
		balance = 0;
	}
	
	//parameterized constructor
	
	public BankAccount(String fName, String lName, int newAge, double newBalance) {
		firstName = fName;
		lastName = lName;
		age = newAge;
		balance = newBalance;
	}
	
	//access modifier - return-type identifier( args ) { body }
	//return the value for balance
	
	public double getbalance() {
		return balance;
	}
	
	// create a printBalance method that prints a phrase
	
	public void printBalance() {
		System.out.println("The "+ firstName+" balance is $ "+ balance+ "/__");
	}
	
	
	//we need a method to withdraw
	public void withdraw(double amount) {
		
		if (amount > balance) {
			System.out.println("we can not give you more then what you have with us, which is $: "+ balance+"/__");
		}else {
			balance = balance - amount;
			System.out.print("The amount of $: "+amount+ " has been deducted from your account. ");
			printBalance();
		}
		
	}
	
	//we need a method to deposit
	public void deposit(double amount) {
		balance += amount;
		System.out.print("The amount of $ "+ amount+ "has been added to your(" + firstName + ") account. ");
		printBalance();
	}
	
	
	
	
	
	
}
