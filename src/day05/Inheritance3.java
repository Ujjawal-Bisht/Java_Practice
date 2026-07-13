package day05;

public class Inheritance3 {

	public static void main(String[] args) {
		GrandParent gp = new GrandParent("Govind", "Singh") ;
		gp.showName();
		gp.walk();
		
		System.out.println("---------------------------------------------");
		
		Parent p = new Parent("Anil", "Bisht", 45) ;
		p.showName();
		p.walk();
		p.work();
		
		System.out.println("---------------------------------------------");

		Child c = new Child("Ujjawal", "Bisht", 21) ;
		c.showName();
		c.walk();
		System.out.println(c.isSpeak?"Yes, child can speak":"No, child cannot speak yet");
	}

}
