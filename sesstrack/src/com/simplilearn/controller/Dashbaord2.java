package com.simplilearn.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Dashbaord2
 */
@WebServlet("/Dashbaord2")
public class Dashbaord2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Dashbaord2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		response.setContentType("text/html");
		HttpSession session=request.getSession(false);
		PrintWriter out=response.getWriter();
		
	Object name=	session.getAttribute("username");
		try{
		if(name==null){
			
			response.sendRedirect("login.html");
			
		}else{
			
			out.println("Welcome to dashboard  "+name+"<br>");
			out.println("<a href='/sesstrack/logout'> Logout</a>");
			
			
			
			
			
		}
		
		}catch(NullPointerException npe){
			out.println("Please login");
			
			
		}
		
		
		
		
		
		
		
	}

}
