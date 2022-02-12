package com.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
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

public class ShoeController {
	@Autowired
   ShoeDAO dao;
@RequestMapping("insertshoe")
    public String insert(HttpServletRequest req,HttpServletResponse res,HttpSession ses) throws ParseException {
    SportShoe e =new  SportShoe();
  e.setName(req.getParameter("name"));
  e.setType(req.getParameter("type"));
  e.setPrice(Integer.parseInt(req.getParameter("price")));
   String date=req.getParameter("date");
 
   SimpleDateFormat sdf=new SimpleDateFormat("yyyy-mm-dd");
   java.util.Date datefinal=sdf.parse(date);

   e.setDate(datefinal);
   e.setLocation(req.getParameter("location"));
  
    ModelAndView mv=new ModelAndView();
    SportShoe ee=dao.insert(e);
    if(ee!=null) {
    	mv.setViewName("show.jsp");
    }
    ses.setAttribute("msg","Product Added Successfully");
    return"redirect:/getallshoes";
    }
@RequestMapping("getallshoes")
public ModelAndView getall(HttpServletRequest req,HttpServletResponse res,HttpSession ses) {
	ModelAndView mv=new ModelAndView();
	List<SportShoe> e=dao.getall();
	mv.setViewName("DisAlShoe.jsp");
	mv.addObject("list",e);
	return mv;
}

@RequestMapping("deleteshoe")

 public String deletebyid(HttpServletRequest req,HttpServletResponse res) {
	 int id=Integer.parseInt(req.getParameter("id"));
	 SportShoe e=new SportShoe();
	 e.setId(id);;
	 String ee=dao.delete(id);
	 res.setContentType("Deleted Successfully");
	 return "redirect:/delete.jsp";
	 
 }

@RequestMapping("GET")

 public ModelAndView getbyId(HttpServletRequest req,HttpServletResponse res) {
	 ModelAndView mv =new ModelAndView();
	 int id=Integer.parseInt(req.getParameter("id"));
	 SportShoe e=new SportShoe();
	e.setId(id);
	 SportShoe ee=new SportShoe();
	 ee=dao.getbyId(id);
	
	 mv.addObject("record",ee);
	 mv.setViewName("getShoe.jsp");
	 return mv;
	
	
 }

@RequestMapping("update")
public ModelAndView uppdate(HttpServletRequest req,HttpServletResponse res) {
	 int id=Integer.parseInt(req.getParameter("id"));
	String name=req.getParameter("name");
	 ModelAndView mv =new ModelAndView();
	 SportShoe e=new SportShoe();
	 e.setId(id);
	 e.setName(name);
	 e.setType(req.getParameter("type"));
	 e.setPrice(Integer.parseInt(req.getParameter("price")));
	 e.setLocation(req.getParameter("location"));
	 SportShoe ee=new  SportShoe();
	 ee=dao.update(e);
	 if(ee!=null) {
	 mv.setViewName("updatemsg.jsp");
	   }
	   return mv;
	   }
}
