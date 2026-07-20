package day10;

public class MyRunnable implements Runnable{
	@Override
	public void run() {
		for(int i=0 ; i<5 ; i++) {
//			try {
//				Thread.sleep(1000) ;
//			}catch(InterruptedException e) {
//				System.out.println("Thread Interrupted.");
//			}
//			
//			if(i==4) {
//				System.out.println("Samay Samapt");
//				System.exit(0);
//			}
			try {
				Thread.sleep(1000) ;
				System.out.println(Thread.currentThread().getName() + " " + i);
			}catch(InterruptedException e) {
				System.out.println("Thread Interrupted.");
			}
			
		}
	}

}
