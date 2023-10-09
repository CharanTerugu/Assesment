package com.Rest.demo.service.serviceimplementation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.Rest.demo.entity.User;
import com.Rest.demo.service.UserService;
@Service
public class UserServiceImpl implements UserService{

	List<User> users=new ArrayList<>();
	
	@Override
	public void create(User user) {
		// TODO Auto-generated method stub
		
		users.add(user);
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return users;
	}

	@Override
	public void delete(String userName) {
		// TODO Auto-generated method stub
		for(int i=0;i<users.size();i++)
		{
			if(users.get(i).getUserName().equals(userName)) {
				users.remove(i);
			}
		}
		
	}

}
