package day04;

public class Car {
	String name = "Ford" ;
	String model = "Mustang" ;
	int year = 2025 ;
	double price = 50000;
	boolean isRunning = false ;
	
	void Start() {
		isRunning = true ;
		System.out.println("Car has been Started.");
	}
	
	void Stop() {
		isRunning = false ;
		System.out.println("Car has been stoped.");
	}
}
