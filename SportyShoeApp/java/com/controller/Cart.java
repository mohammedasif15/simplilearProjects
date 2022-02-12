package com.controller;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cart {
 @Id
int id;
String name;
String type;
int price;
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
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
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
}
