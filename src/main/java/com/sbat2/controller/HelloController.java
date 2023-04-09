package com.sbat2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/hello-azure-world-new")
	public String helloAzureWorld() {
		return "Hello World of Azure";
	}
	
}
