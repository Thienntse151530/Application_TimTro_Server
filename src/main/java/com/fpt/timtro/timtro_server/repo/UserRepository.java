package com.fpt.timtro.timtro_server.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

//import org.springframework.data.repository.CrudRepository;
import com.fpt.timtro.timtro_server.models.*;

public interface UserRepository extends JpaRepository<UserModel, Integer>{
	
	//Get data of user from table user in database
	@Query(value = "SELECT * FROM _user WHERE account = :account AND _password = :password", nativeQuery = true)
	UserModel getListOfUsers(@Param("account") String account, @Param("password") String password);
}





