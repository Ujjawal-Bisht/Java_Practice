package day05;

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog1 = new Dog() ;
		Cat cat1 = new Cat() ;
		
		System.out.println(dog1.isAlive);
		cat1.eat();
		
		dog1.speak();
		cat1.speak();
	}

}
