package com.project1.base.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Service;

import com.project1.base.model.User;
import com.project1.base.repository.UserRepository;
import com.project1.base.security.ILoginService;

@Service
public class LoginService extends BaseService implements ILoginService{
	
	@Autowired
	UserRepository loginRepository;

	@Override
	public User createUser(String emailId, String rawPassword) {
		List<GrantedAuthority> grantedAuths = new ArrayList<GrantedAuthority>();
		grantedAuths.add(new SimpleGrantedAuthority("ROLE_USER"));
		User user = new User();
		user.setEmailId(emailId);
		user.setPassword(rawPassword);
		loginRepository.save(user);
        return user;
	}

	@Override
	public User login(String loginId, String password) {
		return loginRepository.getUser(loginId, password);
	}

	@Override
	public User saveOrUpdateUser(User user) {
		return loginRepository.save(user);
	}

}