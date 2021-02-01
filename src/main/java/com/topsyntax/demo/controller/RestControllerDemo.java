package com.topsyntax.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerDemo {

	@GetMapping("/")
	public String controllerMain() {
		return "Main Page";
	}
	
	@GetMapping("/wellcome")
	public String controllerMain2() {
		return "Wellcome Page";
	}
}
