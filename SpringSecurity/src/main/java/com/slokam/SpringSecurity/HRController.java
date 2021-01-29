package com.slokam.SpringSecurity;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("hr")
public class HRController {
	
	@RequestMapping("/goto")
	public ModelAndView goToPage() {
		ModelAndView mv = new ModelAndView("hr");
		return mv;
	}

}
