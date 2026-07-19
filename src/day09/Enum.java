package day09;

public class Enum {

	public static void main(String[] args) {
		Days day = Days.Monday ;
//		System.out.println(day);
		
		switch(day) {
		case Monday -> System.out.println("monday");
		case Tuesday -> System.out.println("Tuesday");
		case Wednesday -> System.out.println("Wednesday");
		}
	}

}
