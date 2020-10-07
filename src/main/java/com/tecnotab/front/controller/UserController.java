package com.tecnotab.front.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tecnotab.front.model.User;
import com.tecnotab.front.repository.UserRepository;

@RestController
public class UserController  {
	
	@Autowired
	private UserRepository userRepo;
	
	@GetMapping("/getAllUsers")
	public List<User> listAllUsers() {
		
		List<User> user =userRepo.findAll();
		return user;
	}

}
