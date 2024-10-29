package in.learnspringboot.main.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import in.learnspringboot.main.Entity.User;
import in.learnspringboot.main.dto.UserReqDTO;
import in.learnspringboot.main.dto.UserResDTO;
import in.learnspringboot.main.exceptions.UniqueNameAllreadyExist;
import in.learnspringboot.main.repositories.UserRepo;
import in.learnspringboot.main.translaters.UserTranslater;

@Repository
public class UserDAO {

	@Autowired
	private UserRepo userRepo;

	@Autowired
	private UserTranslater userTranslater;

	public UserResDTO saveUser(UserReqDTO userReqDTO) throws UniqueNameAllreadyExist{

		User user = userTranslater.userDtoToEntity(userReqDTO);
		
		if (userRepo.existsByuniqueNameString(user.getUniqueNameString())) {
			throw new UniqueNameAllreadyExist("user unique name already exist...");
		}
		
		User savedUser = userRepo.save(user);
		UserResDTO resUser = userTranslater.userEntityToDto(savedUser);

		return resUser;

	}

}
