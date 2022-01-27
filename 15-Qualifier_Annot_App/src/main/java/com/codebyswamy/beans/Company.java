package com.codebyswamy.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Company {

	@Autowired
	@Qualifier(value = "employee3")
	private Employee employee;
	
	public Company() {
		System.out.println("From Company class");
	}

	public void printEmpName() {
		System.out.println("EmpName: " + employee.getName());
	}
	
	public void printEmpAddr() {
		System.out.println("EmpAddr: " + employee.getAddress());
	}
}

