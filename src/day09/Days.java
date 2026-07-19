package day09;

public enum Days {
	Sunday(1),
	Monday(2),
	Tuesday(3),
	Wednesday(4),
	Thursday(5),
	Friday(6),
	Saturday(7) ;
	
	private final int dayNum ;
	
	Days(int dayNum){
		this.dayNum = dayNum ;
	}
	
	public int getDayNum() {
		return this.dayNum ;
	}
}
