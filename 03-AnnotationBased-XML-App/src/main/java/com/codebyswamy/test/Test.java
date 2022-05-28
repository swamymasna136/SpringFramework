package com.codebyswamy.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.codebyswamy.beans.Company;

public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Company company = context.getBean(Company.class);
		company.setCmpId(5465);
		company.setCmpName("SUZUKI");
		company.setCmpProf(5500.00);
		System.out.println(company);
	}
}

