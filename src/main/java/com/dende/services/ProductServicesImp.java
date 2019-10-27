package com.dende.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dende.dao.ProductDAO;
import com.dende.entities.Product;

@Service
@Transactional
public class ProductServicesImp {
	
	@Autowired
	private ProductDAO productDAO;
	
	public List<Product> allProduct(){
		return productDAO.findAllProduct();
	}
	
	public List<Product> getListTrendingProduct(){
		return productDAO.getListTrendingProduct();
	}
}
