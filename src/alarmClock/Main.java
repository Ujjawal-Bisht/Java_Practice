package alarmClock;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss") ;
		LocalTime time = null ;
		
		while(time == null) {
			try {
				System.out.print("Enter local time (HH:MM:SS) :");
				String inputTime = sc.nextLine() ;
				
				time = LocalTime.parse(inputTime, formatter);
				System.out.println("Alarm set for: " + time);
			}catch(DateTimeParseException e) {
				System.out.println("Something went Wrong! Are you entering correct time?");
			}
		}
		
		AlarmClock clock = new AlarmClock(time) ;
		Thread alarmThread = new Thread(clock) ;
		
		alarmThread.start();
		
		sc.close();
		
	}

}
