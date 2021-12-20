package com.codebyswamy.beans;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Product {

	private List<String>name;
	private Set<String>brands;
	private Map<Integer, String>types;
	private Properties details;
	
	public Product() {
		super();
	}

	public List<String> getName() {
		return name;
	}

	public void setName(List<String> name) {
		this.name = name;
	}

	public Set<String> getBrands() {
		return brands;
	}

	public void setBrands(Set<String> brands) {
		this.brands = brands;
	}

	public Map<Integer, String> getTypes() {
		return types;
	}

	public void setTypes(Map<Integer, String> types) {
		this.types = types;
	}

	public Properties getDetails() {
		return details;
	}

	public void setDetails(Properties details) {
		this.details = details;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", brands=" + brands + ", types=" + types + ", details=" + details + "]";
	}
	
	
	
	
}
