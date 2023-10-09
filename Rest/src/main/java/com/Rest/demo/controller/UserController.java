package com.Rest.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Rest.demo.entity.User;
import com.Rest.demo.service.UserService;

@RestController
public class UserController {

	
	@Autowired
	UserService us;
	
	@PostMapping("/")
	void addUser(@RequestBody User user) {
		us.create(user);
	}
	@GetMapping("/")
	List<User> users(){
		return us.getAll();
	}
	@DeleteMapping("/{userName}")
	void remove(@PathVariable String userName) {
		us.delete(userName);
	}
	
	
}
