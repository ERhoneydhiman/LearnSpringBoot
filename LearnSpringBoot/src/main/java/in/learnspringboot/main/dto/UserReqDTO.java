package in.learnspringboot.main.dto;

import lombok.Data;

@Data
public class UserReqDTO {
	
	private String nameString;
	private String uniqueNameString;
	private String emailString;
	private Long phoneNoLong;
	private String passwordString;

}
