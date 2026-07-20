package alarmClock;

import java.awt.Toolkit;
import java.time.LocalTime;

public class AlarmClock implements Runnable{
	
	private final LocalTime alarmTime ;

	public AlarmClock(LocalTime alarmTime) {
		this.alarmTime = alarmTime;
	}

	@Override
	public void run() {		
		while (LocalTime.now().isBefore(alarmTime)) {
	        try {
	            Thread.sleep(1000);

	            LocalTime now = LocalTime.now(); 
	            int hour = now.getHour();
	            int min = now.getMinute();
	            int sec = now.getSecond();
	            System.out.printf("\rTime right now- %02d:%02d:%02d", hour, min, sec);
	        } catch (InterruptedException e) {
	            System.out.println("Thread Interrupted");
	            return; 
	        }
	    }
	    System.out.println("\n⏰ Alarm ringing at: " + alarmTime);
	    Toolkit.getDefaultToolkit().beep() ;
	}
}
