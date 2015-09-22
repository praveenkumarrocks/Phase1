package com.project1.base.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.project1.base.model.User;
import com.project1.base.repository.UserRepository;

@Controller
@RestController
@RequestMapping("/")
public class BaseController {
	
	@Autowired
	UserRepository userRepository;
	
	@RequestMapping(value = "saveUser", method = RequestMethod.POST, produces = { "application/json" })
	@ResponseStatus(HttpStatus.OK)
	public void saveUser() {
		User user = new User();
		user.setUsername("sunny");
		user.setPassword("sunny");
		userRepository.save(user);
		System.out.print("User saved");
	}
	
	@RequestMapping(value = "getValue", method = RequestMethod.GET, produces = { "application/json" })
	@ResponseStatus(HttpStatus.OK)
	public void get() {
		System.out.print("Something");
	}
}
