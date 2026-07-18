package day08;

public class Library {
	String Name ;
	int year ;
	Books[] books ;
	
	public Library(String name, int year, Books[] books) {
		Name = name;
		this.year = year;
		this.books = books;
	}
	
	public void getLibraryInfo() {
		System.out.printf("%s, since %d", Name, this.year);
		System.out.println("\nAll available books are: ");
		for(Books book : this.books) {
			System.out.println(book.getBookInfo()) ;
		}
	}

}
