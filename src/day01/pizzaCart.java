package day01;

import java.util.Scanner;

public class pizzaCart {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		System.out.println("Yokoso Watashino Pizza Cart.");
		boolean cont = true ;
		int ttl = 0;
		while(cont) {
			System.out.println("\t Menu \n 1.) Regular Pizza - 60Rs.\n 2.) Cheeze Pizza - 80Rs.\n 3.) Mix Vegi Pizza - 100Rs.\n 4.) Double Cheeze Pizza - 120Rs.");
			
			System.out.println("Please Enter your Choice - (1/2/3/4)");
			int ch = sc.nextInt();
			
			System.out.println("Please Enter the quantity of your pizzas? - ");
			int quan = sc.nextInt() ;
			
			System.out.print("Your bill is ");
			switch(ch){
				case 1 -> ttl += (quan * 60) ;
				case 2 -> ttl += (quan * 80) ;
				case 3 -> ttl += (quan * 100) ;
				case 4 -> ttl += (quan * 120) ;
			}
			System.out.println(ttl);
			
			System.out.println("Do you want to place order again? - (yes/no)");
			String choice = sc.next() ;
			cont = (choice.equals("yes") ? true : false) ;
		}
		System.out.println("Your final bill is " + ttl);
		
		System.out.println("How would you like to pay sir?");
		System.out.println("1.) Cash \n2.) Card \n3.) UPI");
		int newCh = sc.nextInt() ;
		if(newCh == 2) {
			System.out.println("Then you new total will be "+ (ttl + (0.01 * ttl) ) + "Rs.\n" + ttl + " + 1% transaction fee." );
		}
		System.out.println("Thank You for ordering from us.");
		sc.close();
	}

}
