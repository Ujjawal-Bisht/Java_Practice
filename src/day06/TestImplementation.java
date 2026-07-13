package day06;

import java.util.ArrayList;

public class TestImplementation {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
		Test t1 = new Test(21, "Ujjawal") ;
		Test2 t2 = new Test2(1001, "UB") ;
		
		ArrayList ar1 = new ArrayList() ;
		ar1.add(10) ;
		ar1.add(t1) ;
		ar1.add("Hello") ;
		ar1.add(t2) ;
		
		System.out.println(ar1);
	}
}
