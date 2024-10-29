package in.learnspringboot.main.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.learnspringboot.main.dao.CreaterDAO;
import in.learnspringboot.main.dto.CreaterReqDTO;
import in.learnspringboot.main.dto.CreaterResDTO;
import in.learnspringboot.main.exceptions.UniqueNameAllreadyExist;

@Service
public class CreaterService implements CreateServiceInterface{
	
	@Autowired
	private CreaterDAO createrDAO;

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

}
