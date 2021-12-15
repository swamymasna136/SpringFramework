package com.codebyswamy.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.codebyswamy.beans.Company;
import com.codebyswamy.config.AppConfig;

public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Company company = context.getBean(Company.class);
		company.setCmpId(5455);
		company.setCmpName("SUZUKI");
		company.setCmpProf(5600.00);
		System.out.println(company);
	}
}

