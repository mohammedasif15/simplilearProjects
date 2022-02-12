package com.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CartDAO {
	@Autowired
	CartRepo repo;
	
	@Autowired
	ShoesRepo srepo;

	public String insert(int id) {
	SportShoe s=srepo.getShoe(id);
	Cart c=new Cart();
	c.setId(s.getId());
	c.setName(s.getName());
	c.setType(s.getType());
	c.setPrice(s.getPrice());
	repo.save(c);
	
	return "Added to Cart";
	}
	public List<Cart> getall(){
		return repo.findAll();
	}
}
