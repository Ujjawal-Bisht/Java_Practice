package multiThreading;

public class CreatingThread3 {
	public static void main(String[] args) {
		Thread t3 = new Thread(() -> System.out.println("This is my Thread created using lambda function.")) ;
		t3.start();
	}
}
