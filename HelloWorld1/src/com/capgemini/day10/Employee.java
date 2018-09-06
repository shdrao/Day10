package com.capgemini.day10;

public class Employee {
	private int id;
	private String name;
	private String department;
	private double salary;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id ,String name, String department, double salary) {
		super();
		this.id=id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	public int getid() {
		return id;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	
	
}
