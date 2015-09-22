package com.project1.base.model;

import java.io.Serializable;

public class UserSession implements Serializable {

	private static final long serialVersionUID = -1108324635055044599L;
	
	private String id;
	private User user;
	private String module;
	private String language;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getModule() {
		return module;
	}
	public void setModule(String module) {
		this.module = module;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}

}
