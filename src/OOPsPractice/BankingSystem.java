package OOPsPractice;

public class BankingSystem {
	
	public static void main(String[] args) {
		
		BankAccount customer1 = new BankAccount("Mujeeb", "Rahman", 27, 1000);
		BankAccount customer2 = new BankAccount("raj", "kumar", 33, 3000);
		BankAccount customer3 = new BankAccount("david", "malan", 28, 2000);
		BankAccount customer4 = new BankAccount("Saif", "Rahman", 8, 60000);
		BankAccount customer5 = new BankAccount("Mahmood", "khan", 32, 40000);
		
		CheckingAccount checkingobj = new CheckingAccount();
		checkingobj.deposit(6000);
		checkingobj.withDrawWithAtm();
		
		checkingobj.printBalance();
		
	System.out.println("*******************");

		customer1.withdraw(100);
		customer1.printBalance();
		customer1.withdraw(1200);
	
		customer1.deposit(350);

		customer2.deposit(400);
		customer2.withdraw(233.67);
	}
}
