package com.simplilearn.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class MyGenericServlet
 */
@WebServlet("/MyGenericServlet")
public class MyGenericServlet extends GenericServlet implements Servlet {
	private static final long serialVersionUID = 1L;	
       
    /**
     * @see GenericServlet#GenericServlet()
     */
    public MyGenericServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
	String name=	request.getParameter("username");
	String address=	request.getParameter("address");
		
	response.setContentType("text/html");
	
	PrintWriter out=	response.getWriter();
		out.print("Welcome Mr "+name+"<br>");
		out.print("YOur address is "+address+"<br>");
		
		ServletContext application=this.getServletContext();
		String token=application.getInitParameter("token");
		
		out.print("The token is "+token);
		
		
		
		if(name.equals("admin")){
			
			
			
		}else{
			
			
		}
		
		
		
		
	}

}
