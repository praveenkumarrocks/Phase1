package com.project1.base.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import com.project1.base.security.LoginSuccessHandler;
import com.project1.base.security.LogoutSuccessHandler;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	LoginSuccessHandler loginSuccessHandler;
	
	@Autowired
	LogoutSuccessHandler logoutSuccessHandler;
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/resources/**").permitAll().anyRequest().authenticated().and()
				.formLogin().loginPage("/login").successHandler(loginSuccessHandler).usernameParameter("username")
					.passwordParameter("password").permitAll()
			//		.failureHandler(customAuthenticationFailureHandler)
					.and().csrf().disable().logout().logoutUrl("/logout").invalidateHttpSession(true)                    
						.addLogoutHandler(logoutSuccessHandler)              
						//		.deleteCookies(cookieNamesToClear) 
						.permitAll();
	}

	/*@Bean
	public PasswordEncoder passwordEncoder() {
		PasswordEncoder encoder = new BCryptPasswordEncoder();
		return encoder;
	}*/
}