package com.epam.mentoring.task3.factory;

import com.epam.mentoring.task3.model.User;

public class UserFactory {

		
	public UserFactory() {
	}

	public User getUser() {
		return new User();
	}
}
