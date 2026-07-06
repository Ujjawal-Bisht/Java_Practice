package day02;

public class EnhancedSwitche {

	public static void main(String[] args) {
		
		// Traditional Switch Case
		
		int Wday = 3;

        switch (Wday) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }
        
        
        // Modern Switch Case introduced in Java14
        
        // Example 1:
        
     		String day = "Monday" ;
     		switch (day) {
     			case "Monday"  -> System.out.println("Monday");
     			case "Tuesday"  -> System.out.println("Tuesday");
     			case "Wednesday"  -> System.out.println("Wednesday");
     			case "Thursday"  -> System.out.println("Thursday");
     			case "Friday"  -> System.out.println("Friday");
     			case "Saturday"  -> System.out.println("Saturday");
     			case "Sunday"  -> System.out.println("Sunday");
     			default -> System.out.println("It's not a valid day.");
     		}

		
		// Example 2:
		switch(day) {
			case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("Weekday");
			case "Saturday", "Sunday" -> System.out.println("Weekend");
			default -> System.out.println("It's not a valid day.");
		}
		
		// Example 3:
		String result = switch (Wday) {
		    case 1, 7 -> {
		        System.out.println("Weekend!");
		        yield "Holiday";
		    	}
		    default -> "Working Day";
		};
		System.out.println(result);
	
	
	}
}
