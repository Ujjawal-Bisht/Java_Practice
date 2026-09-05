package day12;

import java.util.ArrayList;
import java.util.List;

public class Collections02 {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);

        System.out.println(list1.equals(list2)); // true

        list2.add(4);
        System.out.println(list1.equals(list2)); // false
        
		System.out.println("-------------------------------------------------------------------------------------");
        // sublist
        System.out.println("List: " + list2) ;
        List<Integer> sub = list2.subList(1, 3) ;
        System.out.println("sublist: " + sub);
        
        // Unstructured Changes
        
        // list
        list2.set(1, 12) ;
        // sublist
        sub.set(1, 13) ;
        System.out.println("After Unstructured Changes");
        System.out.println(list2);
        System.out.println(sub);
        
        // Structured Changes
        
        // sublist
        sub.remove(0) ;
        sub.add(5) ;
        
        // list
        list2.add(5) ; // ConcurrentModificationException 
        System.out.println("After Structured Changes");
        System.out.println(list2); // This is printed successfully.
//        System.out.println(sub); // Exception occurred at this point.
        
        
        
	}

}
