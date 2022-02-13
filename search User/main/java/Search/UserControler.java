package Search;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class UserControler {
	@Autowired
	UserDAO dao;
	@Autowired
	UserRepo repo;
	@RequestMapping("/user")
	public ModelAndView get(HttpServletRequest req,HttpServletResponse res) {
		String user=req.getParameter("user");
		UserBean b=new UserBean();
		b=dao.find(user);
		ModelAndView mv=new ModelAndView();
		if(repo.findByName(user)!=null) {
			 mv.setViewName("validate.jsp");
		}
		else {
			 mv.setViewName("error.jsp");
		}
		return mv;
	}
	 @RequestMapping("edit")
	public ModelAndView set(HttpServletRequest req,HttpServletResponse res) {
		UserBean b=new UserBean();
		ModelAndView mv=new ModelAndView();
		b.setUser(req.getParameter("user"));
		b.setPassword(req.getParameter("password"));
	    b.setPhone(req.getParameter("phone"));
		b.setAddress(req.getParameter("add"));
		UserBean bb=new UserBean();
		bb=dao.upate(b);
		if(bb!=null) {
			mv.setViewName("success.jsp");
		}
		
		return mv;
		
	}

}
