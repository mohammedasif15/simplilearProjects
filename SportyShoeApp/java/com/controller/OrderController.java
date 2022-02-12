package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class OrderController {
	@Autowired
	OrderDAO dao;
	
	OrderDetails o=new OrderDetails();
	
	@RequestMapping("buy")
	public ModelAndView insert(HttpServletRequest req,HttpServletResponse res) {
		ModelAndView mv=new ModelAndView();
		int id=Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		String address=req.getParameter("add");
		o.setAddress(address);
		o.setName(name);
		OrderDetails od=new OrderDetails();
		od=dao.insert(o, id);
		if(od!=null) {
			mv.setViewName("order.jsp");
		}
		return mv;
		
		
	}
	@RequestMapping("orderlist")
	public ModelAndView getall() {
		List<OrderDetails> s=dao.getall();
		ModelAndView mv=new ModelAndView();
		mv.addObject("list",s);
		mv.setViewName("orderlist.jsp");
		return mv;
	}

}
