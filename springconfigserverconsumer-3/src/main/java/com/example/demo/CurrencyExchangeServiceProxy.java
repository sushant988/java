package com.example.demo;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//@FeignClient(name="currency-exchange-service", url="localhost:8000")
//Enabling feign
//@FeignClient(name="exchange-service",url="localhost:63000")
//@FeignClient(name="exchange-server")
@FeignClient(name="zuul")

@RibbonClient(name = "zuul")
//enabling ribbon
public interface CurrencyExchangeServiceProxy 
{
	//@GetMapping(path="/currency-exchange/{from}/to/{to}")
	@GetMapping(path="/exchange-server/currency-exchange/{from}/to/{to}")
	public ExchangeValue getExchangeValue(@PathVariable("from") String from, @PathVariable("to") String to);
		
}