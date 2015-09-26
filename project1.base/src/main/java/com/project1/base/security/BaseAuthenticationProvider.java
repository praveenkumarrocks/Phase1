package com.project1.base.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;

import com.project1.base.logging.ILogger;
import com.project1.base.model.User;
import com.project1.base.model.UserSession;

public class BaseAuthenticationProvider extends AbstractAuthenticationProvider {
	
	@Autowired
	ILoginService loginService;
	
	@Autowired
	ILogger logger;

	@Autowired
	UserSession userSession;
	
	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		String name = authentication.getName();
		String password = authentication.getCredentials().toString();
		User user = null;
	
		try {
			user = loginService.login(name, password);
			
		} catch (Exception any) {
			logger.error(BaseAuthenticationProvider.class, "Exception in loginSerivce");
		}
		if (user == null) {
			// need to remove
		//	setFailureUserDetails(userSession,user);
			throw new BadCredentialsException("Login failed.");
		}
		// in the case of locked user 
		if(!user.isVerified()){
			throw new BadCredentialsException("The Login ID has been locked due to multiple unsuccessful login attempts."
					+ " Please contact your administrator to have your password reset, or wait until your locked account is released (in {0} minutes");
		}
		 if (password != null && user!=null) {
			// saving the user into user session and contextThreadLocal
				setUserSessionDetails(userSession, user);
				return getUserAuthentication(name,password);
	     }
		 setUserSessionDetails(userSession, user);
		 throw new BadCredentialsException("Login failed.");
	}

	@Override
	public boolean supports(Class<?> authentication) {
		return authentication.equals(UsernamePasswordAuthenticationToken.class);
	}
}