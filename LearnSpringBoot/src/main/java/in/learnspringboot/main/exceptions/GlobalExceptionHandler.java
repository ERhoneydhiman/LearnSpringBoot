package in.learnspringboot.main.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	
	@ExceptionHandler(value = UniqueNameAllreadyExist.class)
	@ResponseStatus
	public @ResponseBody ErrorResponce uniqueNameAllreadyExistException(Exception e) {
		return new ErrorResponce(HttpStatus.CONFLICT.value(), e.getMessage());
		
	}
	
	@ExceptionHandler(value = UniqueNameNotFoundException.class)
	@ResponseStatus
	public @ResponseBody ErrorResponce uniqueNameNotFoundException(Exception e) {
		return new ErrorResponce(HttpStatus.CONFLICT.value(), e.getMessage());	
	}
	
	@ExceptionHandler(value = BadCredentialsException.class)
	@ResponseStatus
	public @ResponseBody ErrorResponce badCredentialsException(Exception e) {
		return new ErrorResponce(HttpStatus.CONFLICT.value(), e.getMessage());	
	}

}
