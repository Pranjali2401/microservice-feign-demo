package com.isystango.demo.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(value = "feign-client" , url="http://localhost:8001/")
public interface OpenFeignController {
	
	@GetMapping
	String getClient1();
	
	@PostMapping
	String addMessage(String message);

}
