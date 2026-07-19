package day09;

import java.util.Timer;
import java.util.TimerTask;

public class NewYearCountDown {

	public static void main(String[] args) {
		Timer timer = new Timer() ;
		TimerTask task = new TimerTask() {
			
			int i=10 ;
			@Override
			public void run() {
				System.out.println(i);
				i-- ;
				if(i == 0) {
					System.out.println("HAPPY NEW YEAR!!!");
					timer.cancel();
				}
			}
		};
		
		timer.schedule(task, 0, 1500);
	}

}
