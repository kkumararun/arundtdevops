package myecomfrontend.persistanceController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.GsonHttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.arun.niit.rajnagar.myecom.daoclasses.ProductDao;
import com.arun.niit.rajnagar.myecom.daoclasses.ProductDaoInterface;
import com.arun.niit.rajnagar.myecom.models.Product;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class ProductController {


	@Autowired
ProductDaoInterface productDao;
	
	@RequestMapping("/allproduct")
	public @ResponseBody List<Product> getAllProduct(){
	
		List<Product> product=productDao.getAllProduct();
		

		return product;
	}

	
}
