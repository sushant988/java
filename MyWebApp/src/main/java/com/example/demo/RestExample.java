package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestExample {
	
	@Autowired
	AlienDAO alienDAO;
	
	@PostMapping(produces="application/json",path="alien")
	@ResponseBody
	public Alien saveAlien(@RequestBody Alien alien) {
		alienDAO.save(alien);
		return alien;
		
	}

	@DeleteMapping(produces="application/json",path="alien/{aid}")
	@ResponseBody
	public String deleteAlien(@PathVariable("aid") int aid) {
		alienDAO.delete(alienDAO.findById(aid).get());
		return "deleted";
		
	}
	
	@PutMapping(produces="application/json",path="alien")
	@ResponseBody
	public Alien updateAlien(@RequestBody Alien alien) {
		alienDAO.save(alien);
		return alien;
		
	}
	
	@GetMapping(produces="application/json",path="aliens")
	@ResponseBody
	public List<Alien> getAliens() {
		return alienDAO.findAll();
		
	}
}
