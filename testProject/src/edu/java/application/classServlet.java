package edu.java.application;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class classServlet extends HttpServlet{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//System.out.println("testing from the classServlet");
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();		
		String name = request.getParameter("name");
		HttpSession session = request.getSession();
		ServletContext context = request.getServletContext();
		if(name != null)
			session.setAttribute("FirstName", name);
			context.setAttribute("FirstName", name);
		
		writer.println("I am from classServlet(Get Method) " + name +
				" The session is : " + (String)session.getAttribute("FirstName"));
		writer.println("the context : " + (String)context.getAttribute("FirstName"));
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//System.out.println("testing from the classServlet");
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		
		String name = request.getParameter("name");
		
		writer.println("I am from classServlet(Post Method) " + name);
		
	}
}
