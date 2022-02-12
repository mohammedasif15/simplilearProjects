package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserDAO {
  @Autowired
	UserRepo repo;
	public User insert(User u) {
		return repo.save(u);
	}
	public List<User> getuser(){
		return repo.findAll();
	}
}
