package com.codebyswamy.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.codebyswamy.beans.AadarCard;
import com.codebyswamy.beans.AadarCardGenerator;

public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		AadarCardGenerator generator = context.getBean(AadarCardGenerator.class);
		AadarCard aadar1 = generator.getAadar();
		AadarCard aadar2 = generator.getAadar();
		System.out.println(aadar1.hashCode());
		System.out.println(aadar2.hashCode());
	}
}
