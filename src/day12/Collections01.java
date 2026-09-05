package day12;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Collections01 {
	
	// ALL ABOUT LIST INTERFACE

	public static void main(String[] args) {

		List<Integer> l1 = new ArrayList<>() ;
		
		System.out.println("Is empty - "+ l1.isEmpty());
		System.out.println("-------------------------------------------------------------------------------------");

		System.out.println("Adding element using 'add' method - "+ l1.add(10));
		System.out.println("-------------------------------------------------------------------------------------");

		System.out.println("Size - " + l1.size());
		System.out.println("-------------------------------------------------------------------------------------");

		
		System.out.println("Using '.contains' method for checking presence of any elm (in this case - 12)- " + l1.contains(12));
		System.out.println("-------------------------------------------------------------------------------------");

		l1.add(11);
		l1.add(13);
		l1.add(12);
		System.out.println("After adding some more elements -" + l1);
		System.out.println("-------------------------------------------------------------------------------------");

		
		System.out.println("Removing 13 using it's index and returning it - " + l1.remove(2)) ;
		System.out.println("13 is removed - " + l1);

		System.out.println("Removing direct element- " + l1.remove(Integer.valueOf(12)));
		System.out.println("12 is removed - " + l1);
		System.out.println("-------------------------------------------------------------------------------------");

		
		l1.addAll(new ArrayList<>(Arrays.asList(13, 14)));
		System.out.println("Adding multiple elements using 'addAll' method - " + l1);
		
		Object[] l2 = l1.toArray() ;
		System.out.println(l1);
		System.out.println(l2);
		
		System.out.println("-------------------------------------------------------------------------------------");
		List<Integer> l3 = new ArrayList<>(Arrays.asList(5, 10, 15, 20));
		Object[] l4 = l3.toArray() ;
		
		l4[0] = 0 ;
		System.out.println(l3);
		for(Object x: l4) {
			System.out.print(x + " ");
		}
		System.out.println();
		
		System.out.println("-------------------------------------------------------------------------------------");

		Iterator<Integer> it = l3.iterator() ;
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();
		System.out.println("-------------------------------------------------------------------------------------");

		System.out.println(l3);
		l3.replaceAll(i -> i+(i/2)*3);
		System.out.println(l3);

		
	}

}
