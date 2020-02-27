package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationPropertiesController {
	
	@Autowired
	ApplicationProperties applicationProperties;
	
	@GetMapping("/limits")
	public ApplicationProperties getProperties() {
		return applicationProperties;
	}

}
