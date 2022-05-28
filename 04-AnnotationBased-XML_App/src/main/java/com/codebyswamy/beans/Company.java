package com.codebyswamy.beans;

import org.springframework.stereotype.Component;

@Component
public class Company {

	private Integer cmpId;
	private String cmpName;
	private Double cmpProf;
	
	public Company() {
		super();
	}

	public Integer getCmpId() {
		return cmpId;
	}

	public void setCmpId(Integer cmpId) {
		this.cmpId = cmpId;
	}

	public String getCmpName() {
		return cmpName;
	}

	public void setCmpName(String cmpName) {
		this.cmpName = cmpName;
	}

	public Double getCmpProf() {
		return cmpProf;
	}

	public void setCmpProf(Double cmpProf) {
		this.cmpProf = cmpProf;
	}

	@Override
	public String toString() {
		return "Company [cmpId=" + cmpId + ", cmpName=" + cmpName + ", cmpProf=" + cmpProf + "]";
	}
	
	
	
}