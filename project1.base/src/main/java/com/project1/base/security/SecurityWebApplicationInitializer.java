package com.project1.base.security;

import java.util.EnumSet;

import javax.servlet.DispatcherType;
import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

public class SecurityWebApplicationInitializer extends AbstractSecurityWebApplicationInitializer {
		
	/**
	 * Invoked before the springSecurityFilterChain is added.
	 * @param servletContext the {@link ServletContext}
	 */
	public void beforeSpringSecurityFilterChain(ServletContext servletContext) {
		FilterRegistration filterRegistration = servletContext.addFilter("LicenseServletFilter", CustomServletFilter.class);
		filterRegistration.addMappingForUrlPatterns(EnumSet.of(DispatcherType.REQUEST), false, "/*");
	}
}
