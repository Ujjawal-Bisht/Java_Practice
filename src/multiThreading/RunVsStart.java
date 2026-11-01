package multiThreading;

public class RunVsStart {

	public static void main(String[] args) {
		MyThread t = new MyThread() ;
		Thread t1 = new Thread(t) ;
		
		t1.run() ;
		t1.start();
		t1.run();
//		t1.start() ;
	}

}

class MyThread implements Runnable{
	@Override
	public void run() {
//		System.out.println("Name of this thread is: " + Thread.currentThread().getName());
		System.out.println("Hi!!");
	}
}