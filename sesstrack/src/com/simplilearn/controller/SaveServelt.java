package com.simplilearn.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SaveServelt
 */
@WebServlet("/save")
public class SaveServelt extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SaveServelt() {
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
		String email=	request.getParameter("email");
		String phone=	request.getParameter("phone");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print("name :"+name+"<br>");
		out.print("password :"+password+"<br>");
		out.print("email :"+email+"<br>");
		out.print("phone :"+phone+"<br>");
		out.print("<a href='PrintNameServlet?username=aziz'>Bye</a>><br>");
		
		
	
		
	}

}
