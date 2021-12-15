package com.codebyswamy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.codebyswamy.beans.Student;

@Configuration
public class AppConfig {

	@Bean
	public Student stdObj() {
		
		Student student = new Student();
		student.setStdId(850);
		student.setStdName("SWAMY");
		student.setStdFee(8500.00);
		return student;
	}
}

