package com.epam.mentoring.task3.model;

public class Work {
	private String companyName;
	private int yearStartWork;

	public Work() {
		super();
	}

	public Work(String companyName, int yearStartWork) {
		super();
		this.companyName = companyName;
		this.yearStartWork = yearStartWork;
	}

	public String getCompanyName() {
		return companyName;
	}

	public int getYearStartWork() {
		return yearStartWork;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public void setYearStartWork(int yearStartWork) {
		this.yearStartWork = yearStartWork;
	}

	@Override
	public String toString() {
		return "Work [companyName=" + companyName + ", yearStartWork=" + yearStartWork + "]";
	}

}
