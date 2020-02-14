package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableConfigServer()
public class SimpleMicroserviceApplication {
	
	@Autowired
	Limits limits;

	public static void main(String[] args) {
		SpringApplication.run(SimpleMicroserviceApplication.class, args);
	}
	
	
	@RequestMapping("/limit-service")
	public Limits getLimitService() {
		Limits l=new Limits();
		l.setMaximum(limits.getMaximum());
		l.setMinimum(limits.getMinimum());
		return l;
	}

}
