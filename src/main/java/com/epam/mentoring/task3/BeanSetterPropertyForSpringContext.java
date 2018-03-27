package com.epam.mentoring.task3;

import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanSetterPropertyForSpringContext {
	private static final Logger LOG = LoggerFactory.getLogger(BeanSetterPropertyForSpringContext.class);
	
	public BeanSetterPropertyForSpringContext() {
		super();
		LOG.info("Implement bean which sets property");
	}

	public void init() {
		LOG.info("BeanSetterPropertyForSpringContext init");
	}

	public void destroy() {
		LOG.info("BeanSetterPropertyForSpringContext destroy");
	}

	public void setPropertyInSpringContext(ClassPathXmlApplicationContext context, Properties properties) {
		PropertyPlaceholderConfigurer configurer = new PropertyPlaceholderConfigurer();

		configurer.setProperties(properties);
		context.addBeanFactoryPostProcessor(configurer);
	

	}



}
