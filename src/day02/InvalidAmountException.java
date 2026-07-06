package day02;

public class InvalidAmountException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidAmountException(String msg) {
		super(msg) ;
	}
	
	public InvalidAmountException(String msg, Throwable cause) {
		super(msg, cause) ;
	}
}
