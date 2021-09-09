package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.User;
import com.example.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService service;
	
	@GetMapping("/user")
	public ResponseEntity<User> getUser(@RequestParam long id) {
		User user = service.getUser(id);
		return new ResponseEntity<>(user, HttpStatus.OK);
	}
	
	@GetMapping("/users")
	public ResponseEntity<List<User>> getAllUser() {
		List<User> users = service.getAllUsers();
		return new ResponseEntity<>(users, HttpStatus.OK);
	}

}
