package com.project1.base.event;

import org.springframework.context.ApplicationEvent;

import com.project1.base.model.User;

	public class OnRegistrationCompleteEvent extends ApplicationEvent {
		
		private static final long serialVersionUID = -7382314251652440238L;
		
	    private final User user;
	 
	    private final String appUrl;
	    

		public OnRegistrationCompleteEvent(User user, String appUrl) {
	        super(user);
	        this.user = user;
	        this.appUrl = appUrl;
	    }

		public User getUser() {
			return user;
		}
		public String getAppUrl() {
			return appUrl;
		}
}
