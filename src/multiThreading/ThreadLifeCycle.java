package multiThreading;

public class ThreadLifeCycle {

	public static void main(String[] args) {
		
		Thread main = Thread.currentThread() ;
		
		// new Stage
		Thread t = new Thread(() -> {
			System.out.println("Thread name: " + Thread.currentThread().getName());
			System.out.println("Main Thread stage: " + main.getState()); // Timed - Waited due to sleep 
		}) ;
		
		System.out.println(t.getState());
		
		// Runnable Stage
		t.start();

		System.out.println(t.getState());
		
		
		try {
			Thread.sleep(2000);
		}catch(Exception e) {
			
		}
		
		// Terminated 
		System.out.println(t.getState());


	}

}
