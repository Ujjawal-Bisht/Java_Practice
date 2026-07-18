package day08;

public class Car {
	String model ;
	int year ;
	Engine engine ;
	
	public Car(String model, int year, String EngineType) {
		this.model = model;
		this.year = year;
		this.engine = new Engine(EngineType);
	}
	
	public void start() {
		engine.start() ;
		System.out.println(this.model + " has been started.");
	}
	
	
	
}
