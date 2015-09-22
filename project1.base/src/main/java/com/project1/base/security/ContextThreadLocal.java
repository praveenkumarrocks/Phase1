package com.project1.base.security;

import com.project1.base.model.UserSession;

/**
 * 
 * @author harkamwaljeet.Singh
 *
 */
public class ContextThreadLocal {

	public static final ThreadLocal<Context> userThreadLocal = new ThreadLocal<Context>();

	public static void set(Context context) {
		userThreadLocal.set(context);
	}

	public static void unset() {
		userThreadLocal.remove();
	}

	public static Context get() {
		return userThreadLocal.get();
	}
	
	class Context {
		private UserSession userSession;

		public UserSession getUserSession() {
			return userSession;
		}

		public void setUserSession(UserSession userSession) {
			this.userSession = userSession;
		}
	}
}