package com.stringtest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class StringController {

	
	@GetMapping("/hello")
	public String getString() {
		return "Hello Eureka microServices!";
	}
	
}
