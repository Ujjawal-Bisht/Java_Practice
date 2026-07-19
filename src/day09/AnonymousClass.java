package day09;

public class AnonymousClass {
//	Classes without names which cannot be reused.
//	Used when we don't want to create a new class for just 1 subclass.
//	We can add custom behavior without creating a new class.
	public static void main(String[] args) {
		SubClass1 class1 = new SubClass1() ;
		class1.method();
		
		SubClass1 class2 = new SubClass1() {
			@Override
			void method() {
				System.out.println("Now this method is overriden but not in another class, instead we have created an anonymous class.");
			}
		};
		
		class2.method();
	}

}
