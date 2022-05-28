package com.codebyswamy.beans;

public class Welcome {

	public void init() throws Exception {
		System.out.println("Bean Welcome has been instantiated & this is the init() method...!");
	}
	
	public void destroy() throws Exception{
		System.out.println("Container has been closed & this is destroy() method..!");
	}
}


