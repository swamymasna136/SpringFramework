package com.codebyswamy.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.codebyswamy.beans.Student;
import com.codebyswamy.config.AppConfig;

public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Student student = context.getBean("stdObj", Student.class);
		System.out.println(student);
	}
}

