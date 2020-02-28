package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeDAO extends JpaRepository<ExchangeValue, Integer> {

	ExchangeValue findByFromAndTo(String from,String to);

}
