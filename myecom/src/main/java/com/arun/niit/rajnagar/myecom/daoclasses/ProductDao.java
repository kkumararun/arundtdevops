package com.arun.niit.rajnagar.myecom.daoclasses;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.arun.niit.rajnagar.myecom.models.Product;

@Repository("productDaoInterface")
public class ProductDao implements ProductDaoInterface{

	List<Product> productList;

	@Override
	public List<Product> getAllProduct() {
		productList=new ArrayList<Product>();
		Product product= null;
		{
			product=new Product();
		product.setSno("P001");
		product.setProductBrand("Amway");
		product.setProductCategory("Beauty");
		product.setProductName("any product name");
		product.setProductSupplier("Arun");
		product.setQuantitiy(10);		
		productList.add(product);
		
		
		product=new Product();
		product.setSno("P005");
		product.setProductBrand("Lakme");
		product.setProductCategory("Personal Care");
		product.setProductName("Vision Care");
		product.setProductSupplier("Mr. X");
		product.setQuantitiy(10);		
		productList.add(product);
		
		}
		return productList;
		
		}

	@Override
	public void updateProduct(Product p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteProduct(String pid) {
		
		for(Product p:productList)
		{
			if(pid.equals(p.getSno()))
			{
				productList.remove(p);
			}
		}
	}

	@Override
	public Product getProduct(String pid) {
		// TODO Auto-generated method stub
		return null;
	}

	
			
	
}
