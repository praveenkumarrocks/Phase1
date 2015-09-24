package com.project1.base.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.project1.base.model.User;
import com.project1.base.repository.UserRepository;

@Controller
public class UserController {
	
	@Autowired
	UserRepository userRepository;
	
	@RequestMapping(value = "/addUser", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public void addUser(@RequestParam("userName") String userName, @RequestParam("password") String password) {
		User user = new User();
		user.setUsername(userName);
		user.setPassword(password);
		userRepository.save(user);
		System.out.print("User saved");
	}
}
