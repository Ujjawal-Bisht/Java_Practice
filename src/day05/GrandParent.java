package day05;

public class GrandParent {
	int age = 78 ;
	String fName ;
	String lName ;
	
	GrandParent(String fName, String lName){
		this.fName = fName ;
		this.lName = lName ;
	}
	
	void walk(){
		System.out.println("Grandpa can walk");
	}
	
	void showName() {
		System.out.println(fName + " " + lName);
	}
}
