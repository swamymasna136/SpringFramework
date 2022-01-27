package com.codebyswamy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

import com.codebyswamy.beans.BeanOne;
import com.codebyswamy.beans.BeanThree;
import com.codebyswamy.beans.BeanTwo;

@Configuration
public class AppConfig {

	@Bean
	@DependsOn(value = {"beanThree" , "beanTwo"})
	public BeanOne beanOne() {
		return new BeanOne();
	}
	
	@Bean
	public BeanTwo beanTwo() {
		return new BeanTwo();
	}
	
	@Bean
	public BeanThree beanThree() {
		return new BeanThree();
	}
}
