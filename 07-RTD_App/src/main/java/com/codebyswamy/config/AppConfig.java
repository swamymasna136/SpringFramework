package com.codebyswamy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.codebyswamy.beans.Address;
import com.codebyswamy.beans.Employee;

@Configuration
public class AppConfig {

	@Bean
	public Address addressObj() {
		Address addr = new Address();
		addr.setHno("2-78/A");
		addr.setLoc("HYD");
		return addr;
	}
	
	@Bean
	public Employee empObj() {
		Employee emp = new Employee();
		emp.setEmpId(1548);
		emp.setEmpName("SWAMY");
		emp.setAddress(addressObj());
		return emp;
	}
}
