package day02;

import java.util.Scanner;

public class BankingSystem {
	// Create Account 
	// Add Balance
	// Withdraw Money
	// Check Balance
	// Exit
	static Scanner sc = new Scanner(System.in) ;
	public static void main(String[] args) {
		System.out.println("Welcome to MyBank where your money is my money and my money is also my money.");
		
		System.out.println("*".repeat(35));
		System.out.println("1.) Create a new Bank Account\n2.) Use Existing Account\n3.) Exit");
		int ch;
		do {
			System.out.print("Please Enter your Choice: ");
			ch = sc.nextInt() ;
			sc.nextLine();
			
			if(ch == 1) {
				System.out.print("Enter Account Holder's name: ");
				String name = sc.nextLine() ;
				
				BankAccount acc1 = new BankAccount(name) ;
				System.out.println("Minimum balance for this account should be greater than 500Rs.\nPlease deposit some money to start a bank account.");
				double bal = sc.nextDouble() ;
				acc1.setBalance(bal);
				
				System.out.println("A new account for "+name+" has been created.");
				
			}else if(ch == 2) {
				
			}else {
				System.out.println("!!! WARNING !!! \nPlease Enter a valid choice.");
			}
		}while(ch != 3);
		
	}
}
