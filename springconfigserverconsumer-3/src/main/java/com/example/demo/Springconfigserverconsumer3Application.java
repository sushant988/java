package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.example.demo")

public class Springconfigserverconsumer3Application {

	public static void main(String[] args) {
		SpringApplication.run(Springconfigserverconsumer3Application.class, args);
	}

}
