package com.codebyswamy.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class BeanOne {

	@Autowired
	private BeanTwo beanTwo;
	
	@Autowired
	private BeanThree beanThree;
	
	public BeanOne() {
		System.out.println("BeanOne Object is Created with Its Constructor..!");
	}
}
