package com.project1.base.security;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;

import com.project1.base.model.UserSession;

/**
 * Callback for successful login
 *
 */
@Component
public class LoginSuccessHandler extends SimpleUrlAuthenticationSuccessHandler{

	@Autowired
	UserSession userSession;
	
	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws IOException, ServletException {
		String targetUrl = determineTargetUrl(authentication);
		RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();
		
        if (response.isCommitted()) {
            return;
        }
		userSession.setId(RequestContextHolder.currentRequestAttributes().getSessionId());
        redirectStrategy.sendRedirect(request, response, targetUrl);
	}
	
	protected String determineTargetUrl(Authentication authentication) {
        String url="";
        Collection<? extends GrantedAuthority> authorities =  authentication.getAuthorities(); 
        List<String> roles = new ArrayList<String>();
 
        for (GrantedAuthority a : authorities) {
            roles.add(a.getAuthority());
        }
 
        if (isUser(roles)) {
            url = "/index";
        } else {
            url="/accessDenied";
        }
 
        return url;
    }
	private boolean isUser(List<String> roles) {
        if (roles.contains("ROLE_USER")) {
            return true;
        }
        return false;
    }
}
