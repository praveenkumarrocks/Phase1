package com.project1.base.security;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.ProviderManager;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.method.configuration.GlobalMethodSecurityConfiguration;

/**
 * @author harkamwaljeet.Singh
 */

@Configuration
@EnableGlobalMethodSecurity(prePostEnabled=true)
public class CustomGlobalMethodSecurityConfig extends GlobalMethodSecurityConfiguration {

	@Autowired
	ApplicationContext applicationContext;

	@Bean
	protected AuthenticationManager authenticationManager() throws Exception {
		List<AuthenticationProvider> listProviders = new ArrayList<AuthenticationProvider>();
		listProviders.add(getCustomauthenitcationProvider());
		ProviderManager providerManager = new ProviderManager(listProviders);
		return providerManager;
	}

	/**
	 * default platform DB authentication provider
	 * @return
	 */
	private AbstractAuthenticationProvider getCustomauthenitcationProvider(){
		AbstractAuthenticationProvider authenticationProvider = new PlatformAuthenticationProvider();
		applicationContext.getAutowireCapableBeanFactory().autowireBean(authenticationProvider);
		return authenticationProvider;
	}
}