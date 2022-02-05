package com.codebyswamy.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.codebyswamy.beans.Product;

@PropertySource("app.properties")
@Configuration
public class AppConfig {

	@Autowired
	private Environment env;
	
	@Bean
	public Product product() {
		Product prod = new Product();
		prod.setProdId(env.getProperty("pid", Integer.class));
		prod.setProdName(env.getProperty("pname"));
		prod.setProdCost(env.getProperty("pcost", Double.class));
		return prod;
	}
}



