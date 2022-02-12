package com.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface ShoesRepo extends JpaRepository<SportShoe, Integer> {
	   @Query("select s from SportShoe s where s.id=?1")
	 public SportShoe  getShoe(int id);

}
