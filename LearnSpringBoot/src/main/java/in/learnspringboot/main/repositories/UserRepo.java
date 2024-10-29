package in.learnspringboot.main.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import in.learnspringboot.main.Entity.User;

public interface UserRepo extends JpaRepository<User, Long>{
	
	public boolean existsByuniqueNameString(String uniqueName);

}
