package com.codebyswamy.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.codebyswamy.beans.CreditCardEligibilityFinder;

public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		CreditCardEligibilityFinder eligibilityFinder = context.getBean(CreditCardEligibilityFinder.class);
		eligibilityFinder.checkCreditCardEligibility();
	}
}
