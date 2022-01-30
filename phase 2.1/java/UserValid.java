

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserValid
 */
public class UserValid extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserValid() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<String> v=new ArrayList<>();
		v.add("abc@gamil.com");
		v.add("bcd@yahoo.com");
		v.add("fgh@outlook.com");
		v.add("nifg@cloud.com");
		v.add("lmt@gmail.com");
		v.add("noe@hotmail.com");
		PrintWriter p=response.getWriter();
		String s=request.getParameter("email");
		int flag=0;
		for(String e:v) {
			if(e.equals(s)) {
				flag=1;
				break;
			}
			else {
				flag=0;
			}
		}
	if(flag==1) {
		p.print("Valid Email id");
		System.out.println("valid");
	}
	else if(flag==0){
		p.print("Invalid email id");
		System.out.println("invalid");
	}
	}

}
