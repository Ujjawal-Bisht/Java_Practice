package day08;

public class MainAggrigation {

	public static void main(String[] args) {
		// Here Library class has a book class in it.
		
		Books book1 = new Books("The Pragmatic Programmer", 253) ;
		Books book2 = new Books("Mastering C++", 515) ;
		Books book3 = new Books("Advance Java", 1221) ;
		Books book4 = new Books("Python for ML and DS", 657) ;
//		System.out.println(book1.getBookInfo());
		
		Books[] books = {book1, book2, book3, book4} ;
		
		Library lib = new Library("Central Library", 1989, books) ;
		
		lib.getLibraryInfo();
	}

}
