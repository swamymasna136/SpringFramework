package com.codebyswamy;

public class Product {

	private Integer prodId;
	private String prodName;
	private Double prodCost;
	
	public Product() {
		super();
	}

	public Product(Integer prodId, String prodName, Double prodCost) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodCost = prodCost;
	}

	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodName=" + prodName + ", prodCost=" + prodCost + "]";
	}
	
	
}
