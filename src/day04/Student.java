package day04;

public class Student {
	String name ;
	int age ;
	double gpa;
	boolean isEnrolled ;
	
	Student(String name, int age, double gpa){
		this.name = name ;
		this.age = age ;
		this.gpa = gpa ;
		System.out.println("Constructor with all 3 parameters");

	}
	
	Student(String name, int age){
		this.name = name ;
		this.age = age ;
		System.out.println("Constructor with 2 parameters");

	}
	
	Student(String name){
		this.name = name ;
		System.out.println("Constructor with only 1 parameter");
	}
	
	Student(){
		System.out.println("Constructor Overloading...");
	}
}
