package com.fpt.timtro.timtro_server.controllers;


import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.fpt.timtro.timtro_server.models.*;
import com.fpt.timtro.timtro_server.repo.UserRepository;

@RestController
public class UserController {
	
	private final UserRepository repository;

	  UserController(UserRepository repository) {
	    this.repository = repository;
	  }
	@GetMapping("/employees")
	@ResponseBody
	   List<UserModel> all() {
	    return repository.findAll();
	  }

}
