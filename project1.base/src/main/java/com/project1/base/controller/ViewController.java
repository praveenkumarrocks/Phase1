package com.project1.base.controller;

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
import com.project1.base.model.UserSession;
import com.project1.base.repository.UserRepository;

/**
 * Handles requests for the application home page.
 */
@Controller
public class ViewController {

	@Autowired
	UserSession userSession;
	
	@Autowired
	UserRepository userRepository;
	
	@RequestMapping(value = {"/login","/"}, method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public ModelAndView login(@RequestParam(value="userName", required=false)  String userName, @RequestParam(value="password", required=false) String password) {
		ModelAndView model = new ModelAndView();
		if(StringUtils.isEmpty(userName) && StringUtils.isEmpty(password)){
			model.addObject("title", "Login Page!");
			model.addObject("message", "Please enter username and password and click Login!");
			model.setViewName("login");
		}else{
			User user = userRepository.getUser(userName, password);
			if(user != null){
				userSession.setUser(user);
				model.addObject("title", "Home Page!");
				model.addObject("message", "This is welcome page!");
				model.setViewName("index");
			}else{
				model.addObject("title", "Login Page!");
				model.addObject("message", "Error while loggin in, please check username and password!");
				model.setViewName("login");
			}
		}
		return model;
	}
	
	@RequestMapping(value = {"/register"}, method = RequestMethod.GET)
	public ModelAndView register() {
		ModelAndView model = new ModelAndView();
		model.addObject("title", "Register!");
		model.setViewName("register");
		return model;
	}
	
	@RequestMapping(value = {"/bikes"}, method = RequestMethod.GET)
	public ModelAndView bikes() {
		ModelAndView model = new ModelAndView();
		model.addObject("title", "Bikes!");
		model.setViewName("bikes");
		return model;
	}
	
	@RequestMapping(value = {"/best"}, method = RequestMethod.GET)
	public ModelAndView best() {
		ModelAndView model = new ModelAndView();
		model.addObject("title", "Best!");
		model.setViewName("best");
		return model;
	}
	
	@RequestMapping(value = {"/contact"}, method = RequestMethod.GET)
	public ModelAndView contact() {
		ModelAndView model = new ModelAndView();
		model.addObject("title", "Contact!");
		model.setViewName("contact");
		return model;
	}
	
	@RequestMapping(value = {"/about"}, method = RequestMethod.GET)
	public ModelAndView about() {
		ModelAndView model = new ModelAndView();
		model.addObject("title", "About!");
		model.setViewName("about");
		return model;
	}
	
}