package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class OrderDAO {
	@Autowired
	OrderRepo repo;
	@Autowired
	ShoesRepo srepo;
	public OrderDetails insert(OrderDetails o, int id) {
		SportShoe s=srepo.getById(id);
		o.setPname(s.getName());
		o.setPrice(s.getPrice());
		return repo.save(o);
	}
 public List<OrderDetails> getall(){
	return repo.findAll();
 }
}
