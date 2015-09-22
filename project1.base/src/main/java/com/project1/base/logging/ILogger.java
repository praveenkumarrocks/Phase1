package com.project1.base.logging;

public interface ILogger {

	/**
	 * Log message at info level with sessionId and userName;
	 */
	public abstract void info(Class<?> clazz, String messagePattern, Object... arguments);

	/**
	 * Log message at debug level with sessionId and userName;
	 */
	public abstract void debug(Class<?> clazz, String messagePattern, Object... arguments);

	/**
	 * Log message at warn level with sessionId and userName;
	 */
	public abstract void warn(Class<?> clazz, String messagePattern, Object... arguments);

	/**
	 * Log message at error level with sessionId and userName;
	 */
	public abstract void error(Class<?> clazz, String messagePattern, Object... arguments);

	public abstract org.slf4j.Logger getLogger(Class<?> clazz);

	default public boolean isInfoEnabled(Class<?> clazz) {
		return false;
	}

	default public boolean isDebugEnabled(Class<?> clazz) {
		return false;
	}	

	default public boolean isWEnabled(Class<?> clazz) {
		return false;
	}	

}
