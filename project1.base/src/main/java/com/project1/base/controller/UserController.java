package com.project1.base.controller;

import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import com.project1.base.model.User;
import com.project1.base.repository.UserRepository;

@Controller
public class UserController {
	
	@Autowired
	UserRepository userRepository;
	
	@RequestMapping(value = "/addUser", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public ModelAndView addUser(@RequestParam Map<String, String> params) {
		String emailId = params.get("emailId");
		String password = params.get("password");
		String confirmPassword = params.get("confirmPassword");
		ModelAndView model = new ModelAndView();
		if(StringUtils.isEmpty(emailId) || StringUtils.isEmpty(password)){
			model.setViewName("register");
			model.addObject("message", "Please enter all mandatory fields!");
			return model;
		}else if(!StringUtils.isEmpty(password) && !StringUtils.isEmpty(confirmPassword) && !(password.equals(confirmPassword))){
			model.setViewName("register");
			model.addObject("message", "Password and confirm password does not match!");
			return model;
		}else{
			User user = new User();
			user.setEmailId(emailId);
			user.setPassword(password);
			user.setFirstName(params.get("firstName"));
			user.setLastName(params.get("lastName"));
			userRepository.save(user);
			model.setViewName("login");
			return model;
		}
	}
}
