package com.codebyswamy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codebyswamy.dao.ProductDao;

@Service
public class ProductService {

	@Autowired
	private ProductDao dao;
	
	public ProductService() {
		System.out.println("ProductService.ProductService()");
	}
	
	public void saveProduct() {
		dao.save();
	}
}
