package in.learnspringboot.main.exceptions;

public class UniqueNameAllreadyExist extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public UniqueNameAllreadyExist() {}
	
	public UniqueNameAllreadyExist(String msg) {super(msg);}
	
}
