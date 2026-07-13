package day05;

public class Parent extends GrandParent{
	int age ;
	String fName ;
	String lName ;
	
	Parent(String fName, String lName, int age) {
		super(fName, lName);
		this.age = age ;
	}
	
	@Override
	void walk() {
		System.out.println("Parents can run.");
	}
	
	void work() {
		System.out.println("Father is a working professional.");
	}
}
