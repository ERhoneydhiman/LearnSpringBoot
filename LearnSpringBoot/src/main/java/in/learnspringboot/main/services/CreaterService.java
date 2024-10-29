package in.learnspringboot.main.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.learnspringboot.main.Entity.Creater;
import in.learnspringboot.main.dao.CreaterDAO;
import in.learnspringboot.main.dto.CreaterReqDTO;
import in.learnspringboot.main.dto.CreaterResDTO;
import in.learnspringboot.main.exceptions.UniqueNameAllreadyExist;
import in.learnspringboot.main.exceptions.UniqueNameNotFoundException;
import in.learnspringboot.main.translaters.CreaterTranslater;

@Service
public class CreaterService implements CreateServiceInterface{
	
	@Autowired
	private CreaterDAO createrDAO;
	
	@Autowired
	private CreaterTranslater createrTranslater;

	@Override
	public CreaterResDTO signInCreater(CreaterReqDTO createrReqDTO) throws UniqueNameAllreadyExist{
		
		CreaterResDTO savedCreaterDto = createrDAO.saveCreater(createrReqDTO);
		
		return savedCreaterDto;
	}
	
	@Override
	public CreaterResDTO loginCreater(String uniqueName, String password) throws Exception{
		
		CreaterResDTO createrResDTO = createrDAO.loginCreater(uniqueName, password);
		return createrResDTO;
		
	}
	
	public CreaterResDTO getCreaterByUniqueName(String uniqueNameString) throws Exception{
		
		Creater creater = createrDAO.findCreaterByUniqueName(uniqueNameString).orElseThrow(()->new UniqueNameNotFoundException("creater not found..."));
		CreaterResDTO createrResDTO = createrTranslater.createrEntityToDto(creater);
		return createrResDTO;
		
	}
	
	public CreaterResDTO updateCreater(String uniqueNameString, CreaterReqDTO createrReqDTO) throws Exception{
		
		Creater creater = createrDAO.findCreaterByUniqueName(uniqueNameString).orElseThrow(()->new UniqueNameNotFoundException("creater not found..."));
		
		creater.setEmailString(createrReqDTO.getEmailString());
		creater.setNameString(createrReqDTO.getNameString());
		creater.setPhoneNoLong(createrReqDTO.getPhoneNoLong());
		creater.setNicheOfCreaterString(createrReqDTO.getNicheOfCreaterString());
		
		Creater updatedCreater = createrDAO.updateCreater(creater);
		
		return createrTranslater.createrEntityToDto(updatedCreater);
		
	}

}
