package com.spring.oneToOneMapping2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	
	
	@GetMapping("/hello")
	public String sayhi() {
		return "hello";
		
		
	}
	
	
}
