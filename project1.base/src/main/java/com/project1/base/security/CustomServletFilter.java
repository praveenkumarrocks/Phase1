package com.project1.base.security;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter("/*")
public class CustomServletFilter implements Filter {

	protected ContextThreadLocal currentTenant;
	
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		try {
			if (request instanceof HttpServletRequest) {
				Context context = new Context();
				ContextThreadLocal.set(context);
				response.setContentType("text/html; charset=UTF-8");
				response.setCharacterEncoding("UTF-8");
			}
			chain.doFilter(request, response);
		} finally {
			//do something if neded.
		}
	}

	public void destroy() {
		// TODO Auto-generated method stub
	}
}