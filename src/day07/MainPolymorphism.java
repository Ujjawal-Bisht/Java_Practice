package day07;

public class MainPolymorphism {

	public static void main(String[] args) {
		
		Car c = new Car() ;
		Bike b = new Bike() ;
		Boat t = new Boat() ;
		
//		c.go();
//		b.go();
//		t.go();
		
		Vehicle2[] vehicles = {c, b, t} ;
		Object[] obj = {c, b, t} ;
		
		for(Vehicle2 v: vehicles) {
			v.go();
		}
	}

}
