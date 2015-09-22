package com.project1.base.security;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import com.project1.base.model.User;
import com.project1.base.model.UserSession;
/**
 * 
 * @author harkamwaljeet.Singh
 *
 */
public abstract class AbstractAuthenticationProvider implements AuthenticationProvider {
	
	@Override
	abstract public Authentication authenticate(Authentication authentication) throws AuthenticationException;
	
	@Override
	abstract public boolean supports(Class<?> authentication);
	
	protected void setUserSessionDetails(UserSession userSession, User user ){
		userSession.setUser(user);
		ContextThreadLocal.get().setUserSession(userSession);
	}
	
	public Authentication getUserAuthentication(String userName,String password ){
		List<GrantedAuthority> grantedAuths = new ArrayList<GrantedAuthority>();
		grantedAuths.add(new SimpleGrantedAuthority("ROLE_USER"));
		Authentication auth = new UsernamePasswordAuthenticationToken(userName, password, grantedAuths);
		return auth;
	}
		
}
