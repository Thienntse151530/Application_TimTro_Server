package com.fpt.timtro.timtro_server.controllers.auth;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fpt.timtro.timtro_server.models.MessageSignInModel;
import com.fpt.timtro.timtro_server.models.UserModel;
import com.fpt.timtro.timtro_server.repo.UserRepository;

@RestController
public class AuthSignInController {
	private final UserRepository userRepository;

	  AuthSignInController(UserRepository userRepository) {
	    this.userRepository = userRepository;
	  }
	  String token = null;
	  public String generateRandomPassword() {
		  	int len = 20;
			String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijk"
	          +"lmnopqrstuvwxyz!@#$%&";
			Random rnd = new Random();
			StringBuilder sb = new StringBuilder(len);
			for (int i = 0; i < len; i++)
				sb.append(chars.charAt(rnd.nextInt(chars.length())));
			return sb.toString();
		}
	  @PutMapping("/putAuthSignIn")
	  boolean authSignInUser(@RequestBody UserModel userModel) {
		 UserModel authUser = userRepository.getListOfUsers(userModel.getAccount(), userModel.getPassword());
		 boolean check = false;
		 if(authUser != null) {
			 token = generateRandomPassword();
			 System.out.println("--true--");
			 check = true;
		 }
	    return check;
	  }
	  
	  @GetMapping("/getAuthSignIn")
	  MessageSignInModel getAuthSignInUser(){
		  MessageSignInModel inModel = new MessageSignInModel();
		  if(token != null) {
			  inModel.setCode(200);
			  inModel.setToken(token);
		  }
		  return inModel;
	  }
		  	  
}
