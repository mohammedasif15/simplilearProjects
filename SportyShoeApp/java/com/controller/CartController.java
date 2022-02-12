package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CartController {
	@Autowired
CartDAO DAO;
	@RequestMapping("addcart")
	@ResponseBody
	public String getItem(HttpServletRequest req,HttpServletResponse res) {
		int id=(Integer.parseInt(req.getParameter("id")));
		DAO.insert(id);
		return "Added to cart Successfully";
	}
	@RequestMapping("getorder")
	public ModelAndView getall(HttpServletRequest req,HttpServletResponse res,HttpSession ses) {
		ModelAndView mv=new ModelAndView();
		List<Cart> e=DAO.getall();
		mv.setViewName("Disorder.jsp");
		mv.addObject("list",e);
		return mv;
	}


}
