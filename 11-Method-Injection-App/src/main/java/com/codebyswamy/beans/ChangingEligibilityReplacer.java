package com.codebyswamy.beans;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class ChangingEligibilityReplacer implements MethodReplacer {

	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println("Welcome to AXIS Bank..!");
		System.out.println("You are Eligible for the AXIS Bank Credit Card..!");
		System.out.println("Thank You for Choosing AXIS Bank..!");
		return null;
	}

}
