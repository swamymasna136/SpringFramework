package com.codebyswamy.dao;

import org.springframework.stereotype.Repository;

@Repository
public class ProductDao {

	public ProductDao() {
		System.out.println("ProductDao.ProductDao()");
	}
	
	public void save() {
		System.out.println("Product Data Saved in the Database..!!!");
	}
}
