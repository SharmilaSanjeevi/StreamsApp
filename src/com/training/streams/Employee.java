package com.training.streams;

public class Employee {

	int empid;
	String name;
	String city;

	public Employee(int empid, String name, String city) {
		super();
		this.empid = empid;
		this.name = name;
		this.city = city;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", city=" + city + "]";
	}

}
