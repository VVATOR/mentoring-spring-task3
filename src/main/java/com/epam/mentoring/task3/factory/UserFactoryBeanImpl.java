package com.epam.mentoring.task3.factory;

import org.springframework.beans.factory.FactoryBean;

import com.epam.mentoring.task3.model.User;
import com.epam.mentoring.task3.model.Work;

public class UserFactoryBeanImpl implements FactoryBean<User> {

	private String username;
	private int age;
	private Work work;
	

	public User getObject() throws Exception {
		return new User(age, username, work);
	}

	public Class<?> getObjectType() {
		return User.class;
	}

	public boolean isSingleton() {
		return false;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Work getWork() {
		return work;
	}

	public void setWork(Work work) {
		this.work = work;
	}	
	
	
	
}
