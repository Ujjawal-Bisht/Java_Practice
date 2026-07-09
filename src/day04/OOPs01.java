package day04;

//import java.util.Random;
//import java.util.Scanner;

public class OOPs01 {
	public static void main(String[] args) {
		// Some examples of object creation
//		Scanner sc = new Scanner(System.in) ;
//		sc.close();
//		Random random = new Random() ;
		
		Car car1 = new Car();
		System.out.println(car1); // This will print the object address - day04.Car@626b2d4a
		
		System.out.println(car1.model);
		System.out.println(car1.name);
		
		System.out.println(car1.isRunning);
		car1.isRunning = true ;
		System.out.println(car1.isRunning);
	}
}
