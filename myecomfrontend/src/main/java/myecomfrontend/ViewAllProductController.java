package myecomfrontend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ViewAllProductController{ 
	
	@RequestMapping(value={"/viewall/{productCat}"})
	public ModelAndView viewAllProductsByCat(@PathVariable("productCat") String p){

		ModelAndView modelAndView=new ModelAndView("viewall_product");
			modelAndView.addObject("cat",""+p);
	
		
		return modelAndView;		
	}
	
	
	@RequestMapping("/viewall")
	public ModelAndView viewAllProducts(){
		ModelAndView modelAndView=new ModelAndView("viewall_product");
		
		return modelAndView;
		
	}
	
	
	@RequestMapping(value={"/viewbyproduct/{productCat}"})
	public ModelAndView viewAllProductsByID(@PathVariable("productCat") String p){

		ModelAndView modelAndView=new ModelAndView("ViewSingleProduct");
			modelAndView.addObject("sno",""+p);
		
		return modelAndView;		
	}

	@RequestMapping(value={"/deletebyid/{productCat}"})
	public ModelAndView deleteProductsByID(@PathVariable("productCat") String p){

		ModelAndView modelAndView=new ModelAndView("viewall_product");
			modelAndView.addObject("sno",""+p);
		
		return modelAndView;		
	}

	
	
}
