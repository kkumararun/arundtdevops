package com.arun.niit.rajnagar.myecom.daoclasses;

import java.util.List;

import com.arun.niit.rajnagar.myecom.models.Product;

public interface ProductDaoInterface {

	public List<Product> getAllProduct();
	public void updateProduct(Product p);
	public void deleteProduct(String pid);
	public Product getProduct(String pid);
	

}
