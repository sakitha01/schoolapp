package com.school.app.schoolapp.service;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.school.app.schoolapp.model.User;
import com.school.app.schoolapp.repository.UserRepository;

@Service
public class UserService {
	
	private UserRepository userRepository;
	
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public User reg(@Valid User user) {
		return userRepository.save(user);
	}

}
