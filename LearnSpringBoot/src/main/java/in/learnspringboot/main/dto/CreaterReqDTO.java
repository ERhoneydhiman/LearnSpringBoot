package in.learnspringboot.main.dto;

import lombok.Data;

@Data
public class CreaterReqDTO {
	private String nameString;
	private String uniqueNameString;
	private String emailString;
	private Long phoneNoLong;
	private String nicheOfCreaterString;
	private String passwordString;
}
