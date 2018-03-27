package com.epam.mentoring.task3.model;

public class User {
	private int age;
	private String username;
	private Work work;

	public User() {
		super();
	}

	public User(int age, String username, Work work) {
		super();
		this.age = age;
		this.username = username;
		this.work = work;
	}

	public User(String username) {
		super();
		this.username = username;
	}

	public int getAge() {
		return age;
	}

	public String getUsername() {
		return username;
	}

	public Work getWork() {
		return work;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setWork(Work work) {
		this.work = work;
	}

	@Override
	public String toString() {
		return "User [age=" + age + ", username=" + username + ", work=" + work + "]";
	}

}
