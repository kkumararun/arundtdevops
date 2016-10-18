package myecomfrontend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class LoginController {

	@RequestMapping(value={"/login"})
public ModelAndView login(){
	
	
	ModelAndView model=new ModelAndView("login_page");
//	model.addObject("IfClickedOnLogin",true);

	
	return model;
}
	
}
