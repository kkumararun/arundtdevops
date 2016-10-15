package myecomfrontend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping(value = { "/welcome", "/" })
	public ModelAndView helloWorld() {

		ModelAndView model = new ModelAndView("index");
		model.addObject("msg", "Welcome to my page");
		return model;
	}

	@RequestMapping("/aboutUs")
	public ModelAndView aboutUsView() {

		ModelAndView model = new ModelAndView("About_Us");
		model.addObject("msg", "Welcome to our about us");
		return model;
	}

	@RequestMapping("/contact")
	public ModelAndView contactView() {

		ModelAndView model = new ModelAndView("contact");
		model.addObject("msg", "NIIT Raj Nagar");
		return model;
	}

}