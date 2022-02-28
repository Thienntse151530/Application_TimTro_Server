package com.fpt.timtro.timtro_server.repo;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;
import com.fpt.timtro.timtro_server.models.*;

public interface UserRepository extends JpaRepository<UserModel, Integer>{

}
