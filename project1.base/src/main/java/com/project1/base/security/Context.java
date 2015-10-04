package com.project1.base.security;

import com.project1.base.model.UserSession;

public class Context {

	private UserSession userSession;

	public UserSession getUserSession() {
		return userSession;
	}

	public void setUserSession(UserSession userSession) {
		this.userSession = userSession;
	}
}
