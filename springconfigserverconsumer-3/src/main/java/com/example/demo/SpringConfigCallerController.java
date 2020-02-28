package com.example.demo;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class SpringConfigCallerController {
	
	
	@Autowired
	CurrencyExchangeServiceProxy CurrencyExchangeServiceProxy;
	
	@GetMapping(path="/exchange-client/{from}/to/{to}/quantity/{quantity}")
	public ExchangeValue exchangeValue(@PathVariable("from") String from, @PathVariable("to") String to, @PathVariable("quantity") BigDecimal quantity)
	{
		Map uriVa=new HashMap<>();
		uriVa.put("from", from);
		uriVa.put("to", to);
		System.out.println("before with values "+from +"-----------"+to+"====="+uriVa );
		//ResponseEntity<ExchangeValue> responseEntity=new RestTemplate().getForEntity("http://localhost:63000/currency-exchange/{from}/to/{to}", ExchangeValue.class, uriVa);
		//ExchangeValue response=responseEntity.getBody();  
		
		ExchangeValue response=CurrencyExchangeServiceProxy.getExchangeValue(from, to);
		//creating a new response bean and getting the response back and taking it into Bean  
		return new ExchangeValue(response.getId(), from,to,response.getConversionMultiple(), quantity,quantity.multiply(response.getConversionMultiple()),response.getPort());  

	}
}
