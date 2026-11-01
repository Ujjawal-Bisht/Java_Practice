package multiThreading;

public class Running2Threads {

	public static void main(String[] args) {
		Thread t1 = new Thread(() -> {
			for(int i=2 ; i<=100 ; i+=2) System.out.println("T1: " + i);
		}) ;
		
		Thread t2 = new Thread(() -> {
			for(int i=1 ; i<=100 ; i+=2) System.out.println("T2: " + i);
		}) ;
		
		t1.start();
		t2.start();
	}

}
