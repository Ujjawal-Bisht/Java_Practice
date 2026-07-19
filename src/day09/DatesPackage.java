package day09;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DatesPackage {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now() ;
		System.out.println(date);
		
		LocalTime time = LocalTime.now() ;
		System.out.println(time);
		
		LocalDateTime dateTime = LocalDateTime.now() ;
		System.out.println(dateTime);
		
		Instant instant = Instant.now() ;	// UTC timestamp
		System.out.println(instant);
		
		// Custom DateTime
		LocalDateTime dateTime2 = LocalDateTime.now() ;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss") ;
		String newDateTime = dateTime2.format(formatter) ;
		System.out.println(newDateTime) ;
		
		LocalDate newDate = LocalDate.of(2005, 04, 8) ;
		LocalDateTime newDate2 = LocalDateTime.of(2005, 04, 8, 15, 28, 40) ;
		System.out.println(newDate2);
		if(newDate.isBefore(date)) {
			System.out.println(newDate + " is before " + date);
		}else {
			System.out.println(date + " is before " + newDate);
		}
	}

}
