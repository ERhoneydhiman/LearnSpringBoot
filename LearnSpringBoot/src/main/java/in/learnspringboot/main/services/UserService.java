package in.learnspringboot.main.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.learnspringboot.main.dao.UserDAO;
import in.learnspringboot.main.dto.UserReqDTO;
import in.learnspringboot.main.dto.UserResDTO;
import in.learnspringboot.main.exceptions.UniqueNameAllreadyExist;

@Service
public class UserService implements UserServiceInterface{
	@Autowired
	private UserDAO userDAO;

	@Override
	public UserResDTO signInUser(UserReqDTO userReqDTO) throws UniqueNameAllreadyExist{
		
		UserResDTO savedUserDto = userDAO.saveUser(userReqDTO);
		
		return savedUserDto;
	}

}
