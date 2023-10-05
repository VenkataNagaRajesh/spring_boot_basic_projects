package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.User;
import com.example.exception.UserNotFoundException;
import com.example.repo.UserRepo;

@Service
public class UserService {

	@Autowired
	private UserRepo userrepo;
	
	public User userSave(User user)
	{
		return userrepo.save(user);
	}
	
	public User getUser(int id) throws UserNotFoundException
	{
		User user=userrepo.findById(id).get();
		if(user!=null)
		{
			return user;
		}
		else {
			throw new UserNotFoundException("user not found with id");
		}
	}
	public  List<User> getAll()
	{
		return userrepo.findAll();
	}
	
	
}
