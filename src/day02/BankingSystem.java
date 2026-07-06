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
		
		System.out.println("*".repeat(25));
		System.out.println("1.) Create a new Bank Account\n2.) Use Existing Account\n3.) Exit");
		int ch;
		do {
			System.out.print("Please Enter your Choice: ");
			ch = sc.nextInt() ;
			
			if(ch == 1) {
				System.out.print("Enter Account Holder's name: ");
				String name = sc.nextLine() ;
				
//				BankAccount(name) ;
			}else if(ch == 2) {
				
			}else {
				System.out.println("!!! WARNING !!! \nPlease Enter a valid choice.");
			}
		}while(ch != 3);
		
	}
}
