package com.project1.base.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

import com.project1.base.model.User;
import com.project1.base.model.UserSession;

/**
 * This class is used as provider for authenticating the user with DB
 * @author harkamwaljeet.Singh
 * 
 */

@Component
public class PlatformAuthenticationProvider extends AbstractAuthenticationProvider{
	
	@Autowired
	ILoginService loginService;
	
	@Autowired
	UserSession userSession;
	
	public PlatformAuthenticationProvider() {

	}

	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		String name = authentication.getName();
		String password = authentication.getCredentials().toString();
		User user = null;
	
		try {
			user = loginService.login(name, password);
		} catch (Exception any) {
			//log exception
		}
		if (user == null) {
			throw new BadCredentialsException("Login failed.");
		}
		// in the case of locked user 
		if(!user.isVerified()){
			throw new BadCredentialsException("The Login ID has been locked due to multiple unsuccessful login attempts");
		}
		 if (password != null && user!=null) {
			// saving the user into user session and contextThreadLocal
			setUserSessionDetails(userSession, user);
			return getUserAuthentication(name,password);
	     }
		 setUserSessionDetails(userSession, user);
		 throw new BadCredentialsException("Login failed.");
	}

	public boolean supports(Class<?> authentication) {
		return authentication.equals(UsernamePasswordAuthenticationToken.class);
	}
}