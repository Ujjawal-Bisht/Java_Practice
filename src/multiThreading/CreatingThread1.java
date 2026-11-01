package multiThreading;

public class CreatingThread1 {

	public static void main(String[] args) {
		MyThread2 t2 = new MyThread2() ;
		Thread t = new Thread(t2) ;
		
		t.start();
		
	}
	
	static class MyThread2 implements Runnable{

		@Override
		public void run() {
			System.out.println("This is my thread created by implementing thread interface...");
		}
		
	}

}
