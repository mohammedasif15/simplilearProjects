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
public class controller {
	@Autowired
	UserDAO dao;
	@Autowired
	ShoeDAO DAO;
	@Autowired
	UserRepo repo;

	@RequestMapping("admin")
public ModelAndView admin(HttpServletRequest req,HttpServletResponse res) {
	ModelAndView mv=new ModelAndView();
	mv.setViewName("displayuser.jsp");
	return mv;
}
	@RequestMapping("userlist")
public ModelAndView userlist(HttpServletRequest req,HttpServletResponse res) {
		List<User> user=dao.getuser();
	ModelAndView mv=new ModelAndView();
	mv.addObject("list",user);
	mv.setViewName("userlist.jsp");
	return mv;
}
	
	@RequestMapping("userreg")
	public ModelAndView user(HttpServletRequest req,HttpServletResponse res) {
		String user=req.getParameter("user");
		String passowrd =req.getParameter("password");
		long phone=(Long.parseLong(req.getParameter("phone")));
		String Address=req.getParameter("add");
		User u=new User();
		ModelAndView mv=new ModelAndView();
		u.setUsername(user);
		u.setPassword(passowrd);
		u.setPhone(phone);
		u.setAddress(Address);
		User us=new User();
		us=dao.insert(u);
		if(us!=null) {
			mv.setViewName("show.jsp");
		}
		return mv;
		
	}
	@RequestMapping("getusershoes")
	public ModelAndView getall(HttpServletRequest req,HttpServletResponse res,HttpSession ses) {
		ModelAndView mv=new ModelAndView();
		List<SportShoe> e=DAO.getall();
		mv.setViewName("usershop.jsp");
		mv.addObject("list",e);
		return mv;
	}
	@RequestMapping("usershop")
	public String disuser(HttpServletRequest req,HttpServletResponse res,HttpSession ses) {
		ModelAndView mv=new ModelAndView();
		String user=req.getParameter("user");
		String password=req.getParameter("Pass");
		if(repo.findByName(user)!=null) {
			return "redirect:/getusershoes";
		}
		else {
			return "redirect:/check.jsp";
		}
	}
}
