package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ShoeDAO {
		@Autowired
		ShoesRepo repo;
	public SportShoe insert(SportShoe e) {
		return repo.save(e);
	}
	public List<SportShoe> getall(){
		return repo.findAll();
	}
	public String delete(int id) {
		repo.deleteById(id);
		return "Deleted Successfully";
	}
	public SportShoe getbyId(int id) {
	    return repo.findById(id).orElse(null);
	}
	public SportShoe update(SportShoe e) {
		SportShoe existing= repo.findById(e.getId()).orElse(null);
	    existing.setName(e.getName());
	    existing.setType(e.getType());
	    existing.setPrice(e.getPrice());
	    existing.setLocation(e.getLocation());
	    return repo.save(existing);
	}

	}
	
