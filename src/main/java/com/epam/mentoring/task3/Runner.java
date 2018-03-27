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
		
		
		User u = context.getBean(User.class);
		LOG.info("-------{}",u);

		
		BeanLogPhases usaaa = context.getBean(BeanLogPhases.class);
		
		 usaaa = (BeanLogPhases) context.getBean("beanLogPhases");

		 BeanDefinitionRegistry beanFactory = new DefaultListableBeanFactory();
		User us = context.getBean(User.class);
		LOG.info("1");
		us = (User) context.getBean("user");
		LOG.info("2");
		us = (User) context.getBean("user");
		LOG.info("3");
		((DefaultListableBeanFactory) beanFactory).destroySingleton("user");
		us = (User) context.getBean("user");
		LOG.info("4");
		us = (User) context.getBean("user");
		us = (User) context.getBean("user");
		//
			 
		/* FactoryBean ubf = new UserFactoryBeanImpl();
		 try {
			User uu = (User) ubf.getObject();
			LOG.info("{}",uu);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/

		 
		   
		 	
		
		BeanSetterPropertyForSpringContext beanSetterPropertyForSpringContext = context.getBean(BeanSetterPropertyForSpringContext.class);
		Properties properties = new Properties();
		properties.setProperty("username", "Awesome");
		properties.setProperty("app.work", "EPAM");
		properties.setProperty("app.yearStartWork", "2018");
		beanSetterPropertyForSpringContext.setPropertyInSpringContext(context,properties);
		
		context.refresh();
		 						
			
		User user = context.getBean(User.class);
		LOG.info("Parameter from reloaded context{}",user);
		
		
		context.close();
	}

}
