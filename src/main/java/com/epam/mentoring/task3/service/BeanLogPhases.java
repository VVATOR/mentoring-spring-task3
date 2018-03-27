package com.epam.mentoring.task3.service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BeanLogPhases {
	private static final Logger LOG = LoggerFactory.getLogger(BeanLogPhases.class);

	public BeanLogPhases() {
		super();
	}

	private void init() {
		LOG.info("initialization phase");
	}

	private void destroy() {
		LOG.info("destroy phases");
	}
}
