package com.codebyswamy.beans;

public class Car {

	private Integer id;
	private String name;
	private String engineType;
	private String variantName;
	
	public Car() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	public String getVariantName() {
		return variantName;
	}

	public void setVariantName(String variantName) {
		this.variantName = variantName;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + ", engineType=" + engineType + ", variantName=" + variantName + "]";
	}
	
	
}
