package com.epam.mentoring.task3;

import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.epam.mentoring.task3.factory.UserFactoryBeanImpl;
import com.epam.mentoring.task3.model.User;
import com.epam.mentoring.task3.service.BeanLogPhases;

public class Runner {
	private static final Logger LOG = LoggerFactory.getLogger(Runner.class);

	public static void main(String[] args) {

		LOG.info("START APPLICATION");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config-main.xml");

		User uff = (User) context.getBean("userFromFactory");
		LOG.info("Result of factory-method: {}", uff);

		User ufbi = (User) context.getBean("userFactoryBeanImpl");
		LOG.info("Result of implement FactoryBean interface: {}", ufbi);

		BeanSetterPropertyForSpringContext beanSetterPropertyForSpringContext = context.getBean(BeanSetterPropertyForSpringContext.class);
		Properties properties = new Properties();
		properties.setProperty("username", "Awesome");
		properties.setProperty("app.work", "EPAM");
		properties.setProperty("app.yearStartWork", "2018");
		beanSetterPropertyForSpringContext.setPropertyInSpringContext(context, properties);
		context.refresh();

		User user = (User) context.getBean("userFactoryBeanImpl");
		LOG.info("Parameter from reloaded context{}", user);

		
		LOG.info("Implement bean that sends message to log at initialization and destroy phases");
		BeanLogPhases usaaa = context.getBean(BeanLogPhases.class);

		context.close();
	}

}
