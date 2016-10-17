// Testing code 

package myecom;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import myecom.dao.ProductDAO;
import myecom.models.Product;

public class TestRun {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();

		appContext.scan("myecom");
		appContext.refresh();
		ProductDAO productdaoImpl = (ProductDAO)appContext.getBean(ProductDAO.class);

		Product product = new Product();

		// product.setId(545);
		product.setProductName("It's a Testing Product");
		product.setProductBrand("Test Brand");
		
		productdaoImpl.insertProduct(product);

		appContext.close();
		System.out.println(product);

	}

}
