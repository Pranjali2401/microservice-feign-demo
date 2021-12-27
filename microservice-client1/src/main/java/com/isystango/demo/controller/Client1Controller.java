package com.isystango.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Client1Controller {

	@Value("${spring.application.name}")
	String applicationName;
	
	@GetMapping("/")
	public String getMessage() {
		return "Hello From "+applicationName;
	}
	
	@PostMapping("/")
	public String addMessage(@RequestBody String message) {
		return "Client send Message is " + message;
	}
	
	
	
}
