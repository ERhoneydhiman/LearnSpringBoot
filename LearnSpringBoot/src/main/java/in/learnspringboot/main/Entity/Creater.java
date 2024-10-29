package in.learnspringboot.main.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table
@Entity
public class Creater {
	@Column
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long IdLong;
	private String nameString;
	private String uniqueNameString;
	private String emailString;
	private Long phoneNoLong;
	private String nicheOfCreaterString;
	private String passwordString;

}
