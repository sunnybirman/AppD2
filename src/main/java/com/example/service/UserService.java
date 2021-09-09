package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.User;
import com.example.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public User getUser(Long id){
		Optional<User> optnl = repository.findById(id);
		return optnl.get();
	}

	
	public List<User> getAllUsers() {
		return repository.findAll();
	}
}
