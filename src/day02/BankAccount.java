package day02;

public class BankAccount {
	
	int AccNo ;
	static String name ;
	private static double balance ;

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		BankAccount.name = name;
	}

	public BankAccount(String name) {
		BankAccount.name = name ;
		BankAccount.balance = 0 ;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		if(balance < 500)System.err.println("WARNING!!!\nMinimum of 500Rs. is required for this account.\nBelow this a small ammount will be deducted from your account every month.");
		BankAccount.balance = balance;
	}
	
	void deposit(double amount) throws InvalidAmountException{
		if(amount < 0) {
			throw new InvalidAmountException("Amount cannot be negative.") ;
		}
		
		setBalance(getBalance() + amount) ;
	}
	
	void withdraw(double amount) {}

}
