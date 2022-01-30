package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ProductValidation
 */
public class ProductValidation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductValidation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */

		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
		{
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			int pid = Integer.parseInt(request.getParameter("pid"));
			String pname = request.getParameter("pname");
			
			if (pid <= 0 || pname == null)
			{
				out.println("<h4 style = 'color:red'>Invalid Entry.</h4>");
				RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
				dispatcher.include(request, response);
				
			}
			else if(pid > 0)
			{
				try 
				{
					Operation.insert(pid, pname);
					out.println("<h1>Product added successfully</h1>");
				} 
				catch (Exception e) 
				{
					out.println("<h4 style = 'color:red'>Duplicate Value.<br>Please enter another value.</h4>");
					RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
					dispatcher.include(request, response);
				}				
			}				
		
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
