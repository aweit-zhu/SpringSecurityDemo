package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	//@ResponseBody
	public String index() {
		//return "Welcome Hello!!";
		return "index";
	}
	
	@RequestMapping("/loginpage")
	public String loginpage() {
		return "loginpage";
	}
}
