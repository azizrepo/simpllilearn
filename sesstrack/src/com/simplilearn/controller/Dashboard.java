package com.simplilearn.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Dashboard
 */
@WebServlet("/Dashboard")
public class Dashboard extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Dashboard() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("Cookies are ");
	  Cookie[] cookies=request.getCookies();
		for (int i = 0; i < cookies.length; i++) {
			Cookie cookie = cookies[i];	
			out.println("Name: "+cookie.getName()+"<br>");
			out.println("value "+cookie.getValue()+"<br>");
			
			out.println("IS Secure : "+cookie.getSecure()+"<br>");
			out.println("Domain :"+cookie.getDomain()+"<br>");
			out.println("Max age "+cookie.getMaxAge()+"<br>");
			
		}
		
		
		
		
	  
	  
	  
	  
		
	
	
	
	}

}
