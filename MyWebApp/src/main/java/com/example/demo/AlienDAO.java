package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AlienDAO extends JpaRepository<Alien, Integer>{

	List<Alien> getByTech(String tech);
	
	List<Alien> findByAidGreaterThan(int aid);
	
	@Query(" from Alien where tech=?1 order by tech desc")
	List<Alien> findByTechSorted1(String Tech);

}
