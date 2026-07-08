package day03;

import java.util.Scanner;

public class linearSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		System.out.print("Enter how many fruits you want to enter in array: ");
		int n = sc.nextInt() ;
		sc.nextLine() ;
		
		String[] fruits = new String[n] ;
		for(int i=0 ; i<n ; i++) {
			System.out.print("Enter fruit " + (i+1) + " ");
			fruits[i] = sc.nextLine();
		}
		
		System.out.print("Enter which fruit you want to search: ");
		String target = sc.nextLine();
		
		boolean flag = false ;
		
		for(int i=0 ; i<n ; i++) {
			if(fruits[i].equals(target)) {
				flag = true ;
				System.out.println("Fruit found at index " + i);
				break ;
			}
		}
		
		if(!flag) {
			System.out.println("Fruit not in list...");
		}
		
		sc.close();
	}

}
