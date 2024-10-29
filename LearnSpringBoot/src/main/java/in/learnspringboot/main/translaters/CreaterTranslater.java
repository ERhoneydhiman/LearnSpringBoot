package in.learnspringboot.main.translaters;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import in.learnspringboot.main.Entity.Creater;
import in.learnspringboot.main.dto.CreaterReqDTO;
import in.learnspringboot.main.dto.CreaterResDTO;

@Component
public class CreaterTranslater {
	
	@Autowired
	private ModelMapper modelMapper;
	
//	this fun map entity to dto in creater
	public CreaterResDTO createrEntityToDto(Creater creater) {
		return modelMapper.map(creater, CreaterResDTO.class);
	}
	
	
	
//	this fun map dto to entity in creater
	public Creater createrDtoToEntity(CreaterReqDTO createrReqDTO) {
		return modelMapper.map(createrReqDTO, Creater.class);
	}
	
	
}
