package com.codebyswamy.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.codebyswamy.beans.Employee;
import com.codebyswamy.config.AppConfig;

public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Employee employee1 = context.getBean(Employee.class);
		Employee employee2 = context.getBean(Employee.class);
		System.out.println(employee1.hashCode());
		System.out.println(employee2.hashCode());
	}
}


