package com.project1.base.security;


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
}