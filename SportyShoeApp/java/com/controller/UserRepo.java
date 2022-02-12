package com.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepo extends JpaRepository<User, Integer> {
	@Query("select u from User u where u.username=?1")
	public User findByName(String name);
}
