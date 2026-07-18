package day08;

public class Books {
	String Name ;
	int pages;
	
	public Books(String Name, int pages){
		this.Name = Name ;
		this.pages = pages ;
	}
	
	public String getBookInfo() {
		return Name + " (" + pages + " pages)" ;
	}
}
