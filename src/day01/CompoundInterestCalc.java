package day01;

import java.util.Scanner;

public class CompoundInterestCalc {

	public static void main(String[] args) {
		// Compound Interest calculator for annual compounding.
		// a = p(1 + (r/100))^n
		
		Scanner sc = new Scanner(System.in) ;
		double principle, rate, amount ;
		int time ;
		
		System.out.print("Please Enter Principle Amount - ");
		principle = sc.nextDouble() ;
		
		System.out.print("Please Enter rate of interest - ");
		rate = sc.nextDouble() ;
		
		System.out.print("Please Enter time(in years) - ");
		time = sc.nextInt() ;
		
		amount = principle * Math.pow((1 + (rate/100)), time) ;
		
		System.out.printf("Amount after compounding %,.2fRs. for %d years at a interest rate of %.2f%% is %,.2f Rs.",principle,time,rate,amount);
				
		sc.close();
	}

}
