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

		product.setProductId("5451");
		product.setProductName("It's a Testing Product3");
		product.setProductBrand("Test Brand");
		product.setProductCategory("Beauty");
		
		productdaoImpl.insertProduct(product);
		product=new Product();
		product.setProductId("54152");
		product.setProductName("It's a Testing Product 4");
		product.setProductBrand("Test Brand 2");
		product.setProductCategory("Personal");
		productdaoImpl.insertProduct(product);
		
		appContext.close();
		System.out.println(product);

	}

}
