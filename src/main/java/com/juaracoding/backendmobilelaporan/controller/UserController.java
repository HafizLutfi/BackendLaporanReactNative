package com.juaracoding.backendmobilelaporan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.juaracoding.backendmobilelaporan.entity.User;
import com.juaracoding.backendmobilelaporan.respository.UserRespository;

@RestController
@RequestMapping("/user")
public class UserController {

	
	@Autowired
	UserRespository userRepo;
	
	@GetMapping("/")
	public List<User> getAll(){
		return (List<User>) userRepo.findAll();
	}
	
	@PostMapping("/add/")
	public String addUser(@RequestBody User user) {
		userRepo.save(user);
		return "Selamat Anda telah melakukan Register!";
	}
	
	@GetMapping("/login/{username}")
	public List<User> getAllByUsername(@PathVariable String username){
		return (List<User>) userRepo.findAllByUsername(username);
	}
}
