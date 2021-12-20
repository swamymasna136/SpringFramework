package com.codebyswamy.config;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.codebyswamy.beans.Product;


@Configuration
public class AppConfig {

	@Bean
	public Product prodObj() {
		
		Product product = new Product();
		product.setName(list());
		product.setBrands(set());
		product.setTypes(map());
		product.setDetails(props());
		return product;
	}

	public Properties props() {
		Properties prop = new Properties();
		prop.setProperty("LATOP", "GOOD");
		prop.setProperty("TV", "NICE");
		return prop;
	}

	public Map<Integer, String> map() {
		Map<Integer, String>map = new LinkedHashMap<Integer, String>();
		map.put(101, "TYPE-1");
		map.put(857, "TYPE-7");
		return map;
	}

	public Set<String> set() {
		Set<String> set = new LinkedHashSet<String>();
		set.add("DELL");
		set.add("SUMSUNG");
		return set;
	}

	public List<String> list() {
		List<String>list = new LinkedList<String>();
		list.add("LAPTOP");
		list.add("TV");
		return list;
	}
}

