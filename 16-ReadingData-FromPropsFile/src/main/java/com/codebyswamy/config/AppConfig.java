package com.codebyswamy.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.codebyswamy.beans.Product;

@PropertySource("app.properties")
@Configuration
public class AppConfig {

	
	@Value("${pid}")
	private Integer prodId;
	@Value("${pname}")
	private String prodName;
	@Value("${pcost}")
	private Double prodCost;
	
	@Bean
	public Product product() {
		Product prod = new Product();
		prod.setProdId(prodId);
		prod.setProdName(prodName);
		prod.setProdCost(prodCost);
		return prod;
	}
}

