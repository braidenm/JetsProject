package com.skilldistillery.jets;

public class Pilot {
	private final String name, gender;
	private final int yearsFlying, salary;
	
	
	public Pilot(String name, String gender, int yearsFlying, int salary) {
		super();
		this.name = name;
		this.gender = gender;
		this.yearsFlying = yearsFlying;
		this.salary = salary;
	}


	public String getName() {
		return name;
	}


	public String getGender() {
		return gender;
	}


	public int getYearsFlying() {
		return yearsFlying;
	}
	public int getSalary() {
		return salary;
	}


	@Override
	public String toString() {
		return "Pilot [name=" + name + ", gender=" + gender + ", yearsFlying=" + yearsFlying + ", salary= $" + salary
				+ "] ";
	}
	
	
	

}
