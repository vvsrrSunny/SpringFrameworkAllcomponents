package com.fmvc.contollers;

import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class DemoController {
	@RequestMapping(method = RequestMethod.GET) // needs
												// http://localhost:8080/MyFirstMVCProj/
	public String greet(ModelMap model) {
		model.addAttribute("greeting", "Hello World from Spring 4 MVC");
		// System.out.println("greeting", "Hello World from Spring 4 MVC");

		return "welcome";
	}

	@RequestMapping(path = "/pathTesting", method = RequestMethod.GET) // needs
																		// http://localhost:8080/MyFirstMVCProj/pathTesting
	public String greet2(ModelMap model) {
		model.addAttribute("greeting", "Hello World from Spring 4 MVC greest 2");
		// System.out.println("greeting", "Hello World from Spring 4 MVC");

		return "welcome";
	}
}