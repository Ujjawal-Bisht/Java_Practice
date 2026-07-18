package day08;

public class MainComposition {

	public static void main(String[] args) {
			Car car1 = new Car("Toyota", 2025, "v9") ;
			
			System.out.println(car1.engine.type);
			
			car1.start() ;
	}

}
