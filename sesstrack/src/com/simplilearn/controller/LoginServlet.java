package com.simplilearn.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
	
		String name=	request.getParameter("username");
		String password=	request.getParameter("password");
	HttpSession session=	request.getSession();
	response.setContentType("text/html");
	if(name.equals("aziz") && password.equals("aziz")){
	
		PrintWriter out=response.getWriter();
		out.print("<form action='/sesstrack/save' method='post'>");
		out.print("<input type='hidden' name='username' value="+name +">");
		out.print("<input type='hidden' name='password' value="+password+">");
		out.print("Enter email<input type='text' name='email' >");
		out.print("Enter phone<input type='text' name='phone' >");
		out.print("<input type='submit' name='save' value='save'>");
        
		out.print("</form>");
		
	
	}	
	
	
	
	
	
	
	
	
	else if(name.equals("aziz") && password.equals("aziz123")){
			
			session.setAttribute("username", name);
			session.setAttribute("password", password);
			response.sendRedirect("Dashbaord2");
				
			
		}
		
		
		
	/*	else if(name.equals("admin") && password.equals("admin123")){
		Cookie cookie1=new Cookie("username", name);
		Cookie cookie2=new Cookie("password", password);
		response.addCookie(cookie1);
		response.addCookie(cookie2);
	
		response.sendRedirect("Dashboard");
		
		
		
		}else{
			
			response.sendRedirect("login.html");
				
			
		}*/
		
		
		
	
	
	
	
	}

}
