package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.User;
import com.example.exception.UserNotFoundException;
import com.example.service.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/v1")
public class UserController {
	
	@Autowired
	UserService userservice;
	@PostMapping("/create")
	public ResponseEntity<User> saveUser(@RequestBody @Valid User user)
	{
	 return new ResponseEntity<User>(userservice.userSave(user),HttpStatus.OK);
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<User> getUser(@PathVariable int id)throws UserNotFoundException
	{
		 
			return new ResponseEntity<User>(userservice.getUser(id),HttpStatus.OK);
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<User>> getAll()
	{
		return ResponseEntity.ok(userservice.getAll());
	}

	
}
