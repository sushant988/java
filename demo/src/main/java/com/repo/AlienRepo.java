package com.repo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.example.demo.Alien;


public class AlienRepo {
	List<Alien> list=new ArrayList<>();
	public AlienRepo() {
		
		Alien a1=new Alien();
		a1.setAid(101);
		a1.setAname("name");
		a1.setTech("Java");
		
		Alien a2=new Alien();
		a2.setAid(102);
		a2.setAname("name");
		a2.setTech("Java");
		
		Alien a3=new Alien();
		a3.setAid(103);
		a3.setAname("name");
		a3.setTech("Java");
		list.add(a1);
		list.add(a2);
		list.add(a3);
		
		
	}
	
	public void delete(int aid) {
		Iterator<Alien> i=list.iterator();
		while (i.hasNext()) {
			Alien a=(Alien)i.next();
			if(a.getAid()==aid) {
				i.remove();
			}
		}
	}
	
	public List<Alien> addOrSave(Alien aid) {
	list.add(aid);
	return list;
	}
	
	public List<Alien> fetchAll() {
		return list;
		
	}
	
	
}
