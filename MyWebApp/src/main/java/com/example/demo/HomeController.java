package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@Autowired
	AlienDAO alienDAO;
	
	@RequestMapping("home")
	public String home() {
		
		return "home";
	}
	
	@RequestMapping("add")
	public String add(@RequestParam("i") String i) {
		System.out.println("called"+i);
		return "home";
	}
	
	@RequestMapping("hello")
	public ModelAndView hello(Alien alien) {
		ModelAndView v=new ModelAndView();
		v.setViewName("home");
		v.addObject("obj",alien);
		alienDAO.save(alien);
		return v;
	}

	
	@RequestMapping("getAlien")
	public ModelAndView hello(@RequestParam("aid")String aid) {
		ModelAndView v=new ModelAndView();
		v.setViewName("home");
		Optional<Alien> al=alienDAO.findById(Integer.parseInt(aid));
		Alien obj=al.get();
		v.addObject("obj",obj);
		
		return v;
	}
	
	@RequestMapping("getAliens")
	@ResponseBody
	public String hello() {
		
		return alienDAO.findAll().toString();
	
	}
	
	@RequestMapping("getAlien1/{aid}")
	@ResponseBody()
	public Optional<Alien> getAlien1(@PathVariable("aid") String aid) {
		
		return alienDAO.findById(Integer.parseInt(aid));
	
	}
	
	//JSON
	
	@RequestMapping(path="getAliens1",produces = {"application/xml"})
	@ResponseBody
	public List<Alien> hello1() {
		
		return alienDAO.findAll();
	
	}

	@RequestMapping(path="hello11")
	public String hello11() {
		
		return "index";
	
	}
}
