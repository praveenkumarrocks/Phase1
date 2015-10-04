package com.project1.base.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import com.project1.base.security.LoginFailureHandler;
import com.project1.base.security.LoginSuccessHandler;
import com.project1.base.security.LogoutSuccessHandler;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	LoginSuccessHandler loginSuccessHandler;
	
	@Autowired
	LogoutSuccessHandler logoutSuccessHandler;
	
	@Autowired
	LoginFailureHandler loginFailureHandler;
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/bikes","/login").authenticated()
        .antMatchers("/**").permitAll()
        .anyRequest().authenticated()
        .and()
        .formLogin().loginPage("/login").usernameParameter("userName").passwordParameter("password").successHandler(loginSuccessHandler).permitAll().and().csrf().disable()
				.logout().logoutUrl("/logout").invalidateHttpSession(true).addLogoutHandler(logoutSuccessHandler)              
				.permitAll();
		http.formLogin().failureHandler(loginFailureHandler);
	}
	
}