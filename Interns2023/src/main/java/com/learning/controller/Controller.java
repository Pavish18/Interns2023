package com.learning.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class Controller {
	@RequestMapping("/hello")
	public String welcome() {
		return "Welcome to new world of development";
	}
}