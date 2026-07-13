package day05;

public class Child extends Parent{
	
	String fName ;
	String lName ;
	int age ; 
	boolean isSpeak ;
	
	Child(String fName, String lName, int age) {
		super(fName, lName, age);
		this.isSpeak = true ;
	}

	@Override
	void walk() {
		System.out.println("Child can walk, run too.");
	}
}
