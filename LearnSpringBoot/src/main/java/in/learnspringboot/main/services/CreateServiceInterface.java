package in.learnspringboot.main.services;

import in.learnspringboot.main.dto.CreaterReqDTO;
import in.learnspringboot.main.dto.CreaterResDTO;

public interface CreateServiceInterface {
	
//	for signin
	public CreaterResDTO signInCreater(CreaterReqDTO createrReqDTO);
	
//	for login
	public CreaterResDTO loginCreater(String uniqueName, String password) throws Exception;
	
}
