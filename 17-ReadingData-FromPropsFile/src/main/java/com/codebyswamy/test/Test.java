package com.codebyswamy.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.codebyswamy.beans.Product;
import com.codebyswamy.config.AppConfig;

public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Product product = context.getBean(Product.class);
		System.out.println(product);
	}
}

