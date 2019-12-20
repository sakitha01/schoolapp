package com.school.app.schoolapp.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.school.app.schoolapp.model.StudentDetails;
import com.school.app.schoolapp.model.User;
import com.school.app.schoolapp.service.HomeService;
import com.school.app.schoolapp.service.UserService;

@RestController
public class HomeController {
	
	private HomeService homeService;
	private UserService userService;
	
	public HomeController(HomeService homeService,UserService userService) {
		this.homeService = homeService;
		this.userService = userService;
	}

	@PostMapping("/studentsreg")
	public StudentDetails registerStudent(@Valid @RequestBody StudentDetails studentDetails) {
	    return homeService.reg(studentDetails);
	}
	
	@GetMapping("/getallstudents")
	public List<StudentDetails> getAllStudents(){
		return homeService.getAllStudents();
	}
	
	@PostMapping("/userreg")
	public User registerUser(@Valid @RequestBody User user) {
	    return userService.reg(user);
	}
}
