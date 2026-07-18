package day08;

public class Engine {
	String type ;

	public Engine(String type) {
		this.type = type;
	}
	
	void start() {
		System.out.println("Starting " + this.type + " engine.");
	}
	
}
