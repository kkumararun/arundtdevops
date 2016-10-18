package myecomfrontend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SignupController {

	@RequestMapping(value={"/signup"})
public ModelAndView login(){
	
	ModelAndView model=new ModelAndView("signup_page");
	return model;
}
	

}
