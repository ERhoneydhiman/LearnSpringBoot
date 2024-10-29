package in.learnspringboot.main.exceptions;

public class BadCredentialsException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BadCredentialsException() {}
	
	public BadCredentialsException(String msg) {super(msg);}

}
