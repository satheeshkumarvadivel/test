package com.sourcetree.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloResource {

	@GetMapping("/hello")
	public String sayHello() {
		return "hello world!!!";
	}
	
	@GetMapping("/hi")
	public String sayDifferentHi() {
		return "hiii..";
	}
}
