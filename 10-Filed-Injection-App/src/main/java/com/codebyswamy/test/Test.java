package com.codebyswamy.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.codebyswamy.config.AppConfig;
import com.codebyswamy.service.ProductService;

public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		ProductService service = context.getBean(ProductService.class);
		service.saveProduct();
	}
}

