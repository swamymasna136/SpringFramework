package com.codebyswamy.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.codebyswamy.beans.Product;

public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Product product1 = context.getBean(Product.class);
		Product product2 = context.getBean(Product.class);
		System.out.println(product1.hashCode());
		System.out.println(product2.hashCode());
	}
}

