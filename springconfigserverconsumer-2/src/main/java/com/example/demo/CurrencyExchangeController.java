package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeController {
	
	@Autowired
	private ExchangeDAO exchangeDAO;
	
	@Autowired  
	private Environment environment;  
	
	@GetMapping(path="/currency-exchange/{from}/to/{to}")
	public ExchangeValue getExchangeValue(@PathVariable("from") String from, @PathVariable("to") String to) {
		
		ExchangeValue exchangeValue = exchangeDAO.findByFromAndTo(from, to);  
		//setting the port  
		
		System.out.println(exchangeValue);
		exchangeValue.setPort(Integer.parseInt(environment.getProperty("local.server.port")));  
		
		return exchangeValue;
		
	}

}
