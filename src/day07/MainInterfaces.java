package day07;

public class MainInterfaces {

	public static void main(String[] args) {
		Rabbit r = new Rabbit() ;
		r.flee();
		
		Eagle e = new Eagle() ;
		e.hunt();
		
		Fish f = new Fish() ;
		f.flee();
		f.hunt();
	}

}
