package day09;

import java.util.Timer;
import java.util.TimerTask;

public class TimerTest {

	public static void main(String[] args) {
		Timer timer = new Timer() ;
		TimerTask task = new TimerTask() { // Abstract class - compulsory to override run method.
			
//			@Override
//			public void run() {
//				System.out.println("Hello.");
//			}
			
			
			int x = 5;
			@Override
			public void run() {
				// To print hello 5 times.
				System.out.println("Hello");
				x-- ;
				if(x == 0) {
					System.out.println("Task Completed.");
					timer.cancel();
				}
			}
		};
		
//		timer.schedule(task, 3000); // This will run the task with a delay of 3sec.
		timer.schedule(task, 3000, 2000); // This will start the task after 3sec and repeat it every 2sec.
		
	}

}
