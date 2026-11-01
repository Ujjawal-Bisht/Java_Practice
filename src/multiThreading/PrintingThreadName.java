package multiThreading;

public class PrintingThreadName {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getId());

		Thread t1 = new Thread(() -> {
			System.out.println("Name of this thread1 is: "+ Thread.currentThread().getName());
			System.out.println("Id of this thread1 is: "+ Thread.currentThread().getId());
		}) ;
		
		Thread t2 = new Thread(() -> {
			System.out.println("Name of this thread2 is: "+ Thread.currentThread().getName());
			System.out.println("Id of this thread2 is: "+ Thread.currentThread().getId());
		}) ;
		
		t1.start();
		t2.start();
	}

}
