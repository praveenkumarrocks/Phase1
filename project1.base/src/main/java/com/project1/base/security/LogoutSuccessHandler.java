package com.project1.base.security;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Component;

import com.project1.base.model.UserSession;


/**
 * This class is used as handler for logout when user do logout 
 */

@Component
public class LogoutSuccessHandler extends SecurityContextLogoutHandler{
	
	@Autowired
	UserSession userSession;

	@Override
	public void logout(HttpServletRequest request, HttpServletResponse response, Authentication authentication)  {
		RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();
		super.logout(request, response, authentication);		
	    try {
			redirectStrategy.sendRedirect(request, response, "/index");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}