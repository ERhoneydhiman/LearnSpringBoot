package in.learnspringboot.main.exceptions;

public class UniqueNameNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public UniqueNameNotFoundException() {}
	
	public UniqueNameNotFoundException(String msg) {super(msg);}

}
