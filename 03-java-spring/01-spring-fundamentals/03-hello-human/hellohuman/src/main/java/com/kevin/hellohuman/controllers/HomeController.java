package com.kevin.hellohuman.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping("/")
	public String hello() {
		return "Hello Human!";
	}
	
	@RequestMapping("/hello")
	public String helloyou(@RequestParam(value="q") String firstName) {
		return "Hello" + " " + firstName;
	}
}
