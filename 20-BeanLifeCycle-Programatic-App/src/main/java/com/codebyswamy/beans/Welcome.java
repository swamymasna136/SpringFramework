package com.codebyswamy.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Welcome implements InitializingBean , DisposableBean{

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Bean Welcome has been instantiated & this is init() method..!");
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("Container has been closed & this is the destroy() method..!");
	}
}



