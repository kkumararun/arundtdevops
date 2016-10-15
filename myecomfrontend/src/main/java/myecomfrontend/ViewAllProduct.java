package myecomfrontend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ViewAllProduct{ 
	
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

}
