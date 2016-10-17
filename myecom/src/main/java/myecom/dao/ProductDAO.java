package myecom.dao;

import java.util.List;

import myecom.models.Product;

public interface ProductDAO {

	public List<Product> getAllProduct();
	public void insertProduct(Product p);


}
