package day07;

public class MainAbstraction {

	public static void main(String[] args) {
//		Shape s = new Shape();
		
		Circle c = new Circle(7) ;
		Triangle t = new Triangle(4,6) ;
		Rectangle r = new Rectangle(3,4) ;
		
		c.display();
		
		System.out.println(c.area());		
		System.out.println(t.area());
		System.out.println(r.area());
	}

}
