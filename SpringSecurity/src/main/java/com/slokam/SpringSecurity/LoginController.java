package com.slokam.SpringSecurity;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	
	@RequestMapping("loginPage")
	public ModelAndView gotoLogin() {
		return new ModelAndView("ourloginPage");
	}

}
