package com.project1.base.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.project1.base.config.AppConfig;
import com.project1.base.model.User;
import com.project1.base.repository.UserRepository;

@ContextConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
public class UserTest {
	
	@Configuration
	@Import({AppConfig.class})
	public static class DataSourceTestConfiguration {

	}

	@Autowired
	UserRepository userRepository;

	@Test
	public void saveUser(){
		User user = new User();
		user.setUsername("admin2");
		user.setPassword("admin1");
		userRepository.save(user);
	}
}
