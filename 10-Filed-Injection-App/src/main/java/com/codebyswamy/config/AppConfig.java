package com.codebyswamy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.codebyswamy.dao.ProductDao;
import com.codebyswamy.service.ProductService;

@Configuration
public class AppConfig {

	@Bean
	public ProductDao dao() {
		return new ProductDao();
	}
	
	@Bean
	public ProductService service() {
		return new ProductService();
	}
}
