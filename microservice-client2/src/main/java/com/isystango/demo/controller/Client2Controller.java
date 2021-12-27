package com.isystango.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Client2Controller {

	@Autowired
	private OpenFeignController feignController;
	
	@GetMapping("/")
	public String getService() {
		String output = feignController.getClient1();
		return " Hello From client-2 , "+output;
	}
	
	@PostMapping("/")
	public String addMessages(@RequestBody String message) {
		String out = feignController.addMessage(message);
		return out;
	}
	
}
