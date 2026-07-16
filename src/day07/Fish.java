package day07;

public class Fish implements Prey, Predator{

	@Override
	public void hunt() {
		System.out.println("Fish can hunt too.");
	}

	@Override
	public void flee() {
		System.out.println("Fish swim ayay.");
	}
	
}
