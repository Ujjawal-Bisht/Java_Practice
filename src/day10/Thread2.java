package day10;

public class Thread2 {

	public static void main(String[] args) {
		Thread thread1 = new Thread(new MyRunnable2("Ping")) ;
		Thread thread2 = new Thread(new MyRunnable2("Pong")) ;
		
		System.out.println("Game start");
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
		}catch(InterruptedException e){
			System.out.println("Thread Interrupted.");
		}
		System.out.println("Game over");
	}

} 
