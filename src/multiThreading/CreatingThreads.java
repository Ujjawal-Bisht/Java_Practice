package multiThreading;

public class CreatingThreads {
	public static void main(String[] args) {
		MyThread1 t1 = new MyThread1() ;
		t1.start() ;
	}
}

class MyThread1 extends Thread{
	@Override
	public void run() {
		System.out.println("This is my thread created by extending Thread class...");
	}
}