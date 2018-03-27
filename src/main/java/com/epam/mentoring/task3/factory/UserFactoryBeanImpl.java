package com.epam.mentoring.task3.factory;

import org.springframework.beans.factory.FactoryBean;

import com.epam.mentoring.task3.model.User;

public class UserFactoryBeanImpl implements FactoryBean<User> {

	private String username;

	@Override
	public User getObject() throws Exception {
		return new User(username);
	}

	@Override
	public Class<User> getObjectType() {
		return User.class;
	}

	@Override
	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return false;
	}

	public void setUsername(String username) {
		this.username = username;

	}

}
