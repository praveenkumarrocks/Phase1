package com.project1.base.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.core.Ordered;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.project1.base.model.UserSession;

@Configuration
@ComponentScan("com.project1")
@EnableWebMvc
public class ServerConfig extends WebMvcConfigurerAdapter {
	
	@Bean(name = "userSession")
	@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
	public UserSession getUserSession() {
		UserSession session = new UserSession();
		session.setId(RequestContextHolder.currentRequestAttributes().getSessionId());
		return session;
	}
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/js/**","/images/**","/css/**")
				.addResourceLocations("/WEB-INF/views/js/","/WEB-INF/views/images/","/WEB-INF/views/css/")
				.setCachePeriod(315569126);
		registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
	}
}