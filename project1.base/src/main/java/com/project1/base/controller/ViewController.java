package com.project1.base.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import com.project1.base.model.UserSession;
import com.project1.base.repository.UserRepository;

/**
 * Handles requests for the application
 */
@Controller
public class ViewController {

	@Autowired
	UserSession userSession;
	
	@Autowired
	UserRepository userRepository;
	
	@RequestMapping(value = {"/login"}, method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public ModelAndView login() {
		ModelAndView model = new ModelAndView();
		model.setViewName("login");
		return model;
	}
	
	@RequestMapping(value = {"/"}, method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public ModelAndView welcome() {
		ModelAndView model = new ModelAndView();
		model.setViewName("index");
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
	
	@RequestMapping(value = {"/index"}, method = RequestMethod.GET)
	public ModelAndView index() {
		ModelAndView model = new ModelAndView();
		model.addObject("title", "Home!");
		model.setViewName("index");
		return model;
	}
	
}