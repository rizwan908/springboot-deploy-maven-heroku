package com.topsyntax.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerDemo {

	@RequestMapping("/")
	public String controllerMain() {
		return "Main Page";
	}

	@RequestMapping("/welcome")
	public String controllerMain2() {
		return "Wellcome Page";
	}

}
