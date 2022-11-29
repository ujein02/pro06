package com.shop.myapp2;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	@GetMapping("/home")
	@ResponseBody
	public String goHome(HttpServletRequest request) {
		return "Spring Boot Maven home";
	}

}
