package com.dende.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dende.entities.Product;

@Repository(value = "productDAO")
@Transactional(rollbackFor = Exception.class)
public class ProductDAO {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public void add(Product product) {
		entityManager.persist(product);
	}
	
	public void update(Product product) {
		entityManager.merge(product);
	}
	
	
	public List<Product> findAllProduct(){
		return entityManager.createQuery("select p from Product as p", Product.class).getResultList();
	}
	
	public List<Product> getListTrendingProduct(){
		return entityManager.createQuery("select p from Product as p where is_trending=1", Product.class).getResultList();
	}
}
