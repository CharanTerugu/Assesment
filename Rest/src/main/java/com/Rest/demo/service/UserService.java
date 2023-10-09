package com.Rest.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Rest.demo.entity.User;

@Service
public interface UserService {
	
	void create(User user);
	List<User> getAll();
	void delete(String userName);
	

}
