package myecomfrontend.persistanceController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.GsonHttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.ObjectMapper;

import myecom.dao.ProductDAO;
import myecom.models.Product;

@Controller
public class ProductController {

	List<Product> product;
	@Autowired
ProductDAO productDao;
	
	@RequestMapping("/allproduct")
	public @ResponseBody List<Product> getAllProduct(){
		 product=productDao.getAllProduct();		
		return product;
	}

	
	
}
