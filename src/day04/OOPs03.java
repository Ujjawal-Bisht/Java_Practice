package day04;

public class OOPs03 {
	public static void main(String[] args) {
		ObjectArray obj1 = new ObjectArray("name1") ;
		ObjectArray obj2 = new ObjectArray("name2") ;
		ObjectArray obj3 = new ObjectArray("name3") ;
		
		ObjectArray[] objects = {obj1, obj2, obj3} ;
		
//		for(int i=0 ; i<objects.length ; i++) {
//			System.out.println(objects[i].name);
//		}
		
		// Enhanced for loop
		
		for(ObjectArray obj: objects) {
			System.out.println(obj.name);
		}
	}
}
