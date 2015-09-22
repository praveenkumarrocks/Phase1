package com.project1.base.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project1.base.logging.ILogger;

@Service
public class BaseService {

	@Autowired
	private ILogger logger;

	public void setLogger(ILogger logger)
	{
		this.logger = logger;
	}

	protected void debug(String messagePattern,Object... arguments) {
		logger.debug(this.getClass(), messagePattern, arguments);
	}

	protected void warn(String messagePattern,Object... arguments) {
		logger.warn(this.getClass(), messagePattern, arguments);
	}

	public ILogger getLogger()
	{
		return logger;
	}

}