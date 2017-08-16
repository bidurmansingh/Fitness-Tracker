package com.bidur.fitnesstracker.controller;



import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping(value ="/greeting")
	public String sayHel(Model model) {

		model.addAttribute("greeting", "Hello World");

		return "hello";
	}

}
