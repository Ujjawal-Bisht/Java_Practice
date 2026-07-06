package day02;

public class BankAccount {
	
	static String name ;
	private double balance ;

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		BankAccount.name = name;
	}

	public BankAccount(String name) {
		BankAccount.name = name ;
		this.balance = 0 ;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	void deposit(double amount) throws InvalidAmountException{
		if(amount < 0) {
			throw new InvalidAmountException("Amount cannot be negative.") ;
		}
		
		setBalance(getBalance() + amount) ;
	}
	
	void withdraw(double amount) {}

}
