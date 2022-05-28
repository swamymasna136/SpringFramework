package com.codebyswamy.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.codebyswamy.beans.Car;

public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Car car = context.getBean("ertiga2" , Car.class);
		System.out.println(car);
	}
}


