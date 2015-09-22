package com.project1.base.logging;

import org.springframework.stereotype.Component;

@Component
public class Logger implements ILogger {

	@Override
	public void info(Class<?> clazz, String messagePattern, Object... arguments) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(Class<?> clazz, String messagePattern,
			Object... arguments) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(Class<?> clazz, String messagePattern, Object... arguments) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(Class<?> clazz, String messagePattern,
			Object... arguments) {
		// TODO Auto-generated method stub

	}

	@Override
	public org.slf4j.Logger getLogger(Class<?> clazz) {
		// TODO Auto-generated method stub
		return null;
	}

}
