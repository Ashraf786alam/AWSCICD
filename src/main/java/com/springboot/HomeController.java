package com.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/home1")
	public String Home1() {
		return "This is Home1";
	}
	
	@GetMapping("/home2")
	public String Home2() {
		return "This is Home2";
	}
	
	@GetMapping("/home3")
	public String Home3() {
		return "This is Home3";
	}

}
