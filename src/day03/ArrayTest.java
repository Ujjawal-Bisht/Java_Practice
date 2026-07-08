package day03;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		int[] arr = {1,2,3,5,3,4} ;
//		System.out.println(arr[-1]);  IndexOutOfBoundException
//		System.out.println(arr); 
//		System.out.println(arr[0]); 
//		System.out.println(arr[arr.length-1]);
		
		arr[1] = 11 ;
//		System.out.println(arr[1]);

		
/* ------------------------------------------------------------------------------------ */

		System.out.print("Array before sorting: ");
		for(int x: arr) {
			System.out.print(x + " ");
		}
		
		System.out.println();
		Arrays.sort(arr) ;
		
		System.out.print("Array after sorting: ");
		for(int x: arr) {
			System.out.print(x + " ");
		}
		
		System.out.println();
		
/* ------------------------------------------------------------------------------------ */
		String s[] = {"Hello", "Hi", "Bye", "Tata", "Sayonara"} ;
		
		System.out.print("Array before sorting: ");
		for(String x:s) {
			System.out.print(x + " ");
		}
		
		System.out.println();
		Arrays.sort(s);
		
		System.out.print("Array after sorting: ");
		for(String x:s) {
			System.out.print(x + " ");
		}
		System.out.println();

/* ------------------------------------------------------------------------------------ */
		Scanner sc = new Scanner(System.in) ;
		System.out.print("Enter lenght of array: ");
		int len = sc.nextInt();
		sc.nextLine();
		
//		System.out.println();
		
		String[] names = new String[len] ;
		System.out.print("Enter names: ");
		for(int i=0 ; i<len ; i++) {
			names[i] = sc.nextLine() ;
		}
		
		System.out.print("All names entered are: ");
		int i=0 ;
		for(String name: names) {
			System.out.print(++i + ".) " + name + " ");
		}
		
/* ------------------------------------------------------------------------------------ */

		sc.close();
	}

}
