package com.simplilearn.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		PrintWriter out=	response.getWriter();
		
		ServletContext application=this.getServletContext();
		String token=application.getInitParameter("token");
		
		out.print("The token is "+token);
		
		
		String name=	request.getParameter("username");
		String password=	request.getParameter("password");
			
		response.setContentType("text/html");
			
		if(name.equals("admin")){
			response.sendRedirect("Dashboard");
			
		}else{
			
			response.sendRedirect("index.html");
				
			
			
			
		}
		
		
		
		
	
	
	
	}

}
