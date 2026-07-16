package day07;

public abstract class Shape {
	abstract double area() ; // Abstract Method
	
	void display() {
		System.out.println("This is a shape."); // Concrete Method
	}
}
