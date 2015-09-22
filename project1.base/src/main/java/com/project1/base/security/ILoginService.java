package com.project1.base.security;

import com.project1.base.model.User;

public interface ILoginService {

	User createUser(String loginId, String rawPassword);

	User getUser(String loginId);

	User login(String loginId, String password);

	User saveOrUpdateUser(User user);
}