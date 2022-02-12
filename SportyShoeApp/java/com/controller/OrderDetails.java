package com.controller;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class OrderDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
 int id;
 String name;
 public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
String pname;
 int price;

 
String address;
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}

}
